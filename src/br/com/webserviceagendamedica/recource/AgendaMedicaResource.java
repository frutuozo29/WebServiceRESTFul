package br.com.webserviceagendamedica.recource;

import java.sql.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import br.com.webserviceagendamedica.abstractclass.AbstractResource;
import br.com.webserviceagendamedica.controller.AgendaMedicaController;

/**
 * Classe responsável por disponibilizar os resources da Agenda Medica
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */

@Path("/AgendaMedica")
public class AgendaMedicaResource extends AbstractResource {

	private static Gson _gson;
	private static AgendaMedicaController _controlador;
	
	
	public AgendaMedicaResource() {
		super(new AgendaMedicaController());
		_gson = new Gson();
		_controlador = new AgendaMedicaController();
	}

	@GET
	@Path("/listarPorLocalAtendimento/{id}")
	@Produces("application/json")
	public String listarPorLocalAtendimento(@PathParam("id") int id) {		
		return _gson.toJson(_controlador.listarPorLocalAtendimento(id));
	}

	@GET
	@Path("/listarPorData/{data}")
	@Produces("application/json")
	public String listarPorData(@PathParam("data") Date data) {
		return _gson.toJson(_controlador.listarPorData(data));
	}

	@GET
	@Path("/listarPorMedico/{id}")
	@Produces("application/json")
	public String listarPorMedico(@PathParam("id") int id) {
		return _gson.toJson(_controlador.listarPorMedico(id));
	}

	@GET
	@Path("/listarPorEspecialidade/{id}")
	@Produces("application/json")
	public String listarPorEspecialidade(@PathParam("id") int id) {
		return _gson.toJson(_controlador.listarPorEspecialidade(id));
	}
}
