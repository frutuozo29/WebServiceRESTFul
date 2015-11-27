package br.com.webserviceagendamedica.controller;

import br.com.webserviceagendamedica.abstractclass.AbstractController;
import br.com.webserviceagendamedica.dao.UsuarioDAO;
import br.com.webserviceagendamedica.model.Usuario;

/**
 * Classe respons�vel por
 * @Autor Renan
 * @Cria��o 25 de nov de 2015
 */
public class UsuarioController extends AbstractController<Usuario> {

	public UsuarioController() {
		super(new UsuarioDAO());
	}
	
}
