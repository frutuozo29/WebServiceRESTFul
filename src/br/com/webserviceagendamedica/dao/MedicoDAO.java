package br.com.webserviceagendamedica.dao;

import java.util.List;

import br.com.webserviceagendamedica.abstractclass.AbstractDAO;
import br.com.webserviceagendamedica.model.Medico;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */

public class MedicoDAO extends AbstractDAO<Medico> {

	public static MedicoDAO instance; 

	public static MedicoDAO getInstance() {
		if(instance == null){
			instance = new MedicoDAO();
		}
		return instance;
	}
	
	@Override
	public List<Medico> listarTodos() {
		getConnection();
		lista.clear();
		try {
			ps = conn.prepareStatement("select * from tb_medico");
			rs = ps.executeQuery();

			while (rs.next()) {
				Medico medico = new Medico();
				medico.setId(rs.getLong("id_medico"));
				medico.setCrm(rs.getInt("crm"));
				medico.setEspecialidade(EspecialidadeDAO.getInstance().buscarPorId(rs.getInt("id_especialidade")));
				medico.setNome(rs.getString("nome"));
				lista.add(medico);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return lista;
	}

	@Override
	public Medico buscarPorId(int id) {
		getConnection();
		Medico medico = null;
		try {
			ps = conn.prepareStatement("select * from tb_medico where id_medico = " + String.valueOf(id));
			rs = ps.executeQuery();
			
			while (rs.next()) {
				medico = new Medico();
				medico.setId(rs.getLong("id_medico"));
				medico.setCrm(rs.getInt("crm"));
				medico.setEspecialidade(EspecialidadeDAO.getInstance().buscarPorId(rs.getInt("id_especialidade")));
				medico.setNome(rs.getString("nome"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return medico;
	}
}
