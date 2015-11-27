package br.com.webserviceagendamedica.interfaces;

import java.util.List;

public interface IWebService<T> {

	public List<T> listarTodos();

	public T buscarPorId(int id);
}
