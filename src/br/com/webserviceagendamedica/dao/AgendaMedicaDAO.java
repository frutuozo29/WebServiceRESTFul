package br.com.webserviceagendamedica.dao;

import java.util.Date;
import java.util.List;

import br.com.webserviceagendamedica.abstractclass.AbstractDAO;
import br.com.webserviceagendamedica.enumerator.Situacao;
import br.com.webserviceagendamedica.model.AgendaMedica;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
public class AgendaMedicaDAO extends AbstractDAO<AgendaMedica> {

	public static AgendaMedicaDAO instance; 

	public static AgendaMedicaDAO getInstance() {
		if(instance == null){
			instance = new AgendaMedicaDAO();
		}
		return instance;
	}
	
	private List<AgendaMedica> getLista(String sql){
		getConnection();
		lista.clear();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				AgendaMedica agendamedica = new AgendaMedica();
				agendamedica.setId(rs.getLong("id_agenda_medica"));
				agendamedica.setMedico(MedicoDAO.getInstance().buscarPorId(rs.getInt("id_medico")));
				agendamedica.setDataAgenda(rs.getDate("data_agenda"));
				agendamedica.setLocalAtendimento(LocalAtendimentoDAO.getInstance().buscarPorId(rs.getInt("id_local_atendimento")));
				agendamedica.setSituacao(Situacao.getSituacao(rs.getString("situacao")));				  
				lista.add(agendamedica);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return lista;		
	}
	
	@Override
	public List<AgendaMedica> listarTodos() {
		return getLista("select * from tb_agenda_medica");
	}

	@Override
	public AgendaMedica buscarPorId(int id) {
		return getLista("select * from tb_agenda_medica where id_agenda_medica = " + String.valueOf(id)).get(0);
	}
	
	public List<AgendaMedica> listarPorLocalAtendimento(int id) {				
		return getLista("select * from tb_agenda_medica where id_local_atendimento = " + String.valueOf(id));
	}
	
	public List<AgendaMedica> listarPorData(Date data) {				
		return getLista("select * from tb_agenda_medica where id_local_atendimento = " + String.valueOf(data));
	}
	
	public List<AgendaMedica> listarPorMedico(int id) {				
		return getLista("select * from tb_agenda_medica where id_medico = " + String.valueOf(id));
	}
	
	public List<AgendaMedica> listarPorEspecialidade(int id) {				
		String sql = "select tam.* from tb_agenda_medica tam inner join tb_medico tmd on tmd.id_medico = tam.id_medico "+
                     " where tmd.id_especialidade = " + String.valueOf(id);
		return getLista(sql);
	}
}
