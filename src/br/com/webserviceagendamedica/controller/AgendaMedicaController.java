package br.com.webserviceagendamedica.controller;

import java.util.Date;
import java.util.List;

import br.com.webserviceagendamedica.abstractclass.AbstractController;
import br.com.webserviceagendamedica.dao.AgendaMedicaDAO;
import br.com.webserviceagendamedica.model.AgendaMedica;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
public class AgendaMedicaController extends AbstractController<AgendaMedica> {

	public AgendaMedicaController() {
		super(new AgendaMedicaDAO());
	}

	public List<AgendaMedica> listarPorLocalAtendimento(int id) {				
		return AgendaMedicaDAO.getInstance().listarPorLocalAtendimento(id);
	}
	
	public List<AgendaMedica> listarPorData(Date data) {				
		return AgendaMedicaDAO.getInstance().listarPorData(data);
	}
	
	public List<AgendaMedica> listarPorMedico(int id) {				
		return AgendaMedicaDAO.getInstance().listarPorMedico(id);
	}
	
	public List<AgendaMedica> listarPorEspecialidade(int id) {				
		return AgendaMedicaDAO.getInstance().listarPorEspecialidade(id);
	}

}
