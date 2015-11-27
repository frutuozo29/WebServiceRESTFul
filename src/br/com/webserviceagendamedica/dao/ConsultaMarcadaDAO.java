package br.com.webserviceagendamedica.dao;

import java.util.List;

import br.com.webserviceagendamedica.abstractclass.AbstractDAO;
import br.com.webserviceagendamedica.enumerator.Situacao;
import br.com.webserviceagendamedica.model.ConsultaMarcada;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */

public class ConsultaMarcadaDAO extends AbstractDAO<ConsultaMarcada> {

	@Override
	public List<ConsultaMarcada> listarTodos() {
		getConnection();
		lista.clear();
		try {
			ps = conn.prepareStatement("select * from tb_consulta_marcada");
			rs = ps.executeQuery();

			while (rs.next()) {
				ConsultaMarcada consulta = new ConsultaMarcada();
				consulta.setId(rs.getLong("id_medico"));
				consulta.setAgendaMedica(AgendaMedicaDAO.getInstance().buscarPorId(rs.getInt("id_agenda_medico")));
				consulta.setData_cancelamento(rs.getDate("data_cancelamento"));
				consulta.setData_marcacao_consulta(rs.getDate("nome"));
				consulta.setSituacao(Situacao.getSituacao(rs.getString("situacao")));
				// consulta.setUsuario(rs.getInt(""));
				lista.add(consulta);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return lista;
	}

	@Override
	public ConsultaMarcada buscarPorId(int id) {
		getConnection();
		ConsultaMarcada consulta = null;
		try {
			ps = conn.prepareStatement("select * from tb_consulta_marcada where id_consulta_medica = " + String.valueOf(id));
			rs = ps.executeQuery();
			while (rs.next()) {
				consulta = new ConsultaMarcada();
				consulta.setId(rs.getLong("id_medico"));
				consulta.setAgendaMedica(AgendaMedicaDAO.getInstance().buscarPorId(rs.getInt("id_agenda_medico")));
				consulta.setData_cancelamento(rs.getDate("data_cancelamento"));
				consulta.setData_marcacao_consulta(rs.getDate("nome"));
				consulta.setSituacao(Situacao.getSituacao(rs.getString("situacao")));
				// consulta.setUsuario(rs.getInt(""));				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return consulta;
	}
}
