package br.com.webserviceagendamedica.abstractclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.webserviceagendamedica.factory.ConnectionFactory;
import br.com.webserviceagendamedica.interfaces.IWebServiceDAO;

/**
 * Classe responsável pela abstração das classes DAO.
 * @Autor Renan
 * @Criação 22 de nov de 2015
 */
public abstract class AbstractDAO<T> implements IWebServiceDAO<T> {
	
	public List<T> lista = new ArrayList<T>();
	public PreparedStatement ps = null;
	public ResultSet rs = null;
	
	public Connection conn;
	
	public void getConnection() {
		try {
			if ((conn == null) || (conn.isClosed())) {
				conn = ConnectionFactory.criaConexao();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ps = null;
		rs = null;
	}	
	
	@Override
	public T buscarPorId(int id) {
		return null;
	}
	
	@Override
	public List<T> listarTodos() {
		return null;
	}
	
	@Override
	public void incluir(T object) {
		
	}
	
	@Override
	public void alterar(T object) {
		
	}
	
	@Override
	public void excluir(T object) {
		
	}
	
	public void fechaConexao() {
		ConnectionFactory.fechaConexao(conn, ps, rs);
	}
}
