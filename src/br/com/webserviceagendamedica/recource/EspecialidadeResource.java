package br.com.webserviceagendamedica.recource;

import javax.ws.rs.Path;
import br.com.webserviceagendamedica.abstractclass.AbstractResource;
import br.com.webserviceagendamedica.controller.EspecialidadeController;

/**
 * Classe responsável por disponibilizar os resources para ser consumidos.
 * @Autor Renan
 */

@Path("/Especialidade")
public class EspecialidadeResource extends AbstractResource {
	
	public EspecialidadeResource() {
		super(new EspecialidadeController());		
	}		
}
