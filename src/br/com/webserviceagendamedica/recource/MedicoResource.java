package br.com.webserviceagendamedica.recource;

import javax.ws.rs.Path;

import br.com.webserviceagendamedica.abstractclass.AbstractResource;
import br.com.webserviceagendamedica.controller.MedicoController;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
@Path("/Medico")
public class MedicoResource extends AbstractResource {

	public MedicoResource() {
		super(new MedicoController());
	}
}
