package br.com.webserviceagendamedica.dao;

import java.util.List;

import br.com.webserviceagendamedica.abstractclass.AbstractDAO;
import br.com.webserviceagendamedica.model.LocalAtendimento;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
public class LocalAtendimentoDAO extends AbstractDAO<LocalAtendimento> {

	public static LocalAtendimentoDAO instance;

	public static LocalAtendimentoDAO getInstance() {
		if (instance == null) {
			instance = new LocalAtendimentoDAO();
		}
		return instance;
	}

	@Override
	public List<LocalAtendimento> listarTodos() {
		getConnection();
		lista.clear();
		try {
			ps = conn.prepareStatement("select * from tb_local_atendimento");
			rs = ps.executeQuery();

			while (rs.next()) {
				LocalAtendimento local = new LocalAtendimento();
				local.setId(rs.getLong("id_local_atendimento"));
				local.setNome(rs.getString("nome"));
				local.setEndereco(rs.getString("endereco"));
				lista.add(local);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return lista;
	}

	@Override
	public LocalAtendimento buscarPorId(int id) {
		getConnection();
		LocalAtendimento local = null;
		try {
			ps = conn.prepareStatement(
					"select * from tb_local_atendimento where id_local_atendimento = " + String.valueOf(id));
			rs = ps.executeQuery();

			while (rs.next()) {
				local = new LocalAtendimento();
				local.setId(rs.getLong("id_local_atendimento"));
				local.setNome(rs.getString("nome"));
				local.setEndereco(rs.getString("endereco"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return local;
	}
}
