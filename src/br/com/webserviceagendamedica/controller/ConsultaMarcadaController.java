package br.com.webserviceagendamedica.controller;

import br.com.webserviceagendamedica.abstractclass.AbstractController;
import br.com.webserviceagendamedica.dao.ConsultaMarcadaDAO;
import br.com.webserviceagendamedica.model.ConsultaMarcada;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
public class ConsultaMarcadaController extends AbstractController<ConsultaMarcada> {

	public ConsultaMarcadaController() {
		super(new ConsultaMarcadaDAO());
	}

}
