package br.com.webserviceagendamedica.interfaces;

public interface IWebServiceDAO<T> extends IWebService<T> {

	public void incluir(T object);

	public void excluir(T object);

	public void alterar(T object);

}
