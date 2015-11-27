package br.com.webserviceagendamedica.abstractclass;

import java.util.List;

import br.com.webserviceagendamedica.interfaces.IWebServiceController;
import br.com.webserviceagendamedica.interfaces.IWebServiceDAO;

/**
 * Classe responsável pela abstraçao das controllers
 * @Autor Renan
 */
public abstract class AbstractController<T> implements IWebServiceController<T> {
	
	IWebServiceDAO<?> _dao;
	//private String classeDAO;
	
	public AbstractController(IWebServiceDAO<?> dao){
		this._dao = dao;
	}
	
	/*public AbstractController(String classeDAO) {
		this.classeDAO = classeDAO;
		criarInstanciaDAO();
	}
	
	private void criarInstanciaDAO(){
		try {
			this._dao = (IWebServiceDAO<?>) Class.forName(classeDAO).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}*/
	
	@SuppressWarnings("unchecked")
	@Override
	public T buscarPorId(int id) {		
		return  (T) _dao.buscarPorId(id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> listarTodos() {				
		return (List<T>) _dao.listarTodos();
	}
}
