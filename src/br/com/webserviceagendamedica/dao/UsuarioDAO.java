package br.com.webserviceagendamedica.dao;

import java.util.List;

import br.com.webserviceagendamedica.abstractclass.AbstractDAO;
import br.com.webserviceagendamedica.enumerator.Perfil;
import br.com.webserviceagendamedica.model.Usuario;

/**
 * Classe responsável por
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */

public class UsuarioDAO extends AbstractDAO<Usuario> {
	
	public static UsuarioDAO instance; 

	public static UsuarioDAO getInstance() {
		if(instance == null){
			instance = new UsuarioDAO();
		}
		return instance;
	}
	
	@Override
	public List<Usuario> listarTodos() {
		getConnection();
		lista.clear();
		try {
			ps = conn.prepareStatement("select * from tb_usuario");
			rs = ps.executeQuery();

			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getLong("id_usuario"));
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setEmail(rs.getString("email"));
				usuario.setPerfil(Perfil.getPerfil(rs.getString("perfil")));
				lista.add(usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return lista;
	}
	
	@Override
	public Usuario buscarPorId(int id) {
		getConnection();
		Usuario usuario = null;
		try {
			ps = conn.prepareStatement("select * from tb_usuario where id_usuario = " + String.valueOf(id));
			rs = ps.executeQuery();
			while (rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getLong("id_usuario"));
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setEmail(rs.getString("email"));
				usuario.setPerfil(Perfil.getPerfil(rs.getString("perfil")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return usuario;
	}
}
