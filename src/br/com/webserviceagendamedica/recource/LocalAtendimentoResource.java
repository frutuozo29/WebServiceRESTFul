package br.com.webserviceagendamedica.recource;

import javax.ws.rs.Path;

import br.com.webserviceagendamedica.abstractclass.AbstractResource;
import br.com.webserviceagendamedica.controller.LocalAtendimentoController;

/**
 * Classe responsável por
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
@Path("/LocalAtendimento")
public class LocalAtendimentoResource extends AbstractResource {

	public LocalAtendimentoResource() {
		super(new LocalAtendimentoController());
	}
}
