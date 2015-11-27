package br.com.webserviceagendamedica.controller;

import br.com.webserviceagendamedica.abstractclass.AbstractController;
import br.com.webserviceagendamedica.dao.LocalAtendimentoDAO;
import br.com.webserviceagendamedica.model.LocalAtendimento;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
public class LocalAtendimentoController extends AbstractController<LocalAtendimento> {

	public LocalAtendimentoController() {
		super(new LocalAtendimentoDAO());
	}

}
