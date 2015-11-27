package br.com.webserviceagendamedica.dao;

import java.util.List;

import br.com.webserviceagendamedica.abstractclass.AbstractDAO;
import br.com.webserviceagendamedica.model.Especialidade;

/**
 * Classe responsável pelos metodos de CRUD.
 * 
 * @Autor Renan
 */

public class EspecialidadeDAO extends AbstractDAO<Especialidade> {

	public static EspecialidadeDAO instance; 

	public static EspecialidadeDAO getInstance() {
		if(instance == null){
			instance = new EspecialidadeDAO();
		}
		return instance;
	}
	
	@Override
	public List<Especialidade> listarTodos() {
		getConnection();
		lista.clear();
		try {
			ps = conn.prepareStatement("select * from tb_especialidade");
			rs = ps.executeQuery();

			while (rs.next()) {
				Especialidade especialidade = new Especialidade();
				especialidade.setId(rs.getLong("id_especialidade"));
				especialidade.setNome(rs.getString("nome"));
				lista.add(especialidade);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return lista;
	}

	@Override
	public Especialidade buscarPorId(int id) {
		getConnection();
		Especialidade especialidade = null;
		try {
			ps = conn.prepareStatement("select * from tb_especialidade where id_especialidade = " + String.valueOf(id));
			rs = ps.executeQuery();
			while (rs.next()) {
				especialidade = new Especialidade();
				especialidade.setId(rs.getLong("id_especialidade"));
				especialidade.setNome(rs.getString("nome"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return especialidade;
	}
}
