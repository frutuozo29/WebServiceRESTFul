package br.com.webserviceagendamedica.abstractclass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import br.com.webserviceagendamedica.interfaces.IWebServiceController;
import br.com.webserviceagendamedica.interfaces.IWebServiceResource;

public abstract class AbstractResource implements IWebServiceResource{
	
	private IWebServiceController<?> _controlador;
	private static Gson gson;
	
	public AbstractResource(IWebServiceController<?> controlador){
		this._controlador = controlador;
		gson = new Gson();
	}
	
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	@Override
	public String listarTodos(){			
		return gson.toJson(_controlador.listarTodos()); 
	}
	
	@GET
	@Path("/buscarPorId/{id}")
	@Produces("application/json")
	@Override
	public String buscarPorId(@PathParam("id") int id){
		return gson.toJson(_controlador.buscarPorId(id));
	}
	
}
