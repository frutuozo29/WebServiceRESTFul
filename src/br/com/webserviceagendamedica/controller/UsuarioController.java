package br.com.webserviceagendamedica.controller;

import br.com.webserviceagendamedica.abstractclass.AbstractController;
import br.com.webserviceagendamedica.dao.UsuarioDAO;
import br.com.webserviceagendamedica.model.Usuario;

/**
 * Classe responsável por
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
public class UsuarioController extends AbstractController<Usuario> {

	public UsuarioController() {
		super(new UsuarioDAO());
	}
	
}
