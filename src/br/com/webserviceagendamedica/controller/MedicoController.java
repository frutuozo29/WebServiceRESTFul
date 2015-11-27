package br.com.webserviceagendamedica.controller;

import br.com.webserviceagendamedica.abstractclass.AbstractController;
import br.com.webserviceagendamedica.dao.MedicoDAO;
import br.com.webserviceagendamedica.model.Medico;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
public class MedicoController extends AbstractController<Medico> {

	public MedicoController() {
		super(new MedicoDAO());
	}

}
