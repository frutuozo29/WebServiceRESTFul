package br.com.webserviceagendamedica.controller;

import br.com.webserviceagendamedica.abstractclass.AbstractController;
import br.com.webserviceagendamedica.dao.MedicoDAO;
import br.com.webserviceagendamedica.model.Medico;

/**
 * Classe respons�vel por
 * 
 * @Autor Renan
 * @Cria��o 25 de nov de 2015
 */
public class MedicoController extends AbstractController<Medico> {

	public MedicoController() {
		super(new MedicoDAO());
	}

}
