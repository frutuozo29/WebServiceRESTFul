package br.com.webserviceagendamedica.controller;

import br.com.webserviceagendamedica.abstractclass.AbstractController;
import br.com.webserviceagendamedica.dao.EspecialidadeDAO;
import br.com.webserviceagendamedica.model.Especialidade;

/**
 * Classe responsável por ser o controlador entra a classe Model e a classe DAO
 * 
 * @author Renan
 *
 */
public class EspecialidadeController extends AbstractController<Especialidade> {

	public EspecialidadeController() {
		super(new EspecialidadeDAO());
	}
}
