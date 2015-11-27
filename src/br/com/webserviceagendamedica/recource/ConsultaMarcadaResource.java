package br.com.webserviceagendamedica.recource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.webserviceagendamedica.abstractclass.AbstractResource;
import br.com.webserviceagendamedica.controller.ConsultaMarcadaController;
import br.com.webserviceagendamedica.model.ConsultaMarcada;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
@Path("/ConsultaMarcada")
public class ConsultaMarcadaResource extends AbstractResource {

	public ConsultaMarcadaResource() {
		super(new ConsultaMarcadaController());
	}

	@POST
	@Path("/Inserir")
	@Produces("application/json")
	@Consumes("application/json")
	public String inserirPost(String consulta) {
		Gson gson = new GsonBuilder().setDateFormat("").create();
		ConsultaMarcada consultaMarcada = gson.fromJson(consulta, ConsultaMarcada.class);
		return gson.toJson(consultaMarcada);
	}

}
