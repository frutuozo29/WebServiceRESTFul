package br.com.webserviceagendamedica.model;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.webserviceagendamedica.enumerator.Perfil;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
@XmlRootElement
public class Usuario {

	private long id;
	private String login;
	private String senha;
	private Perfil perfil;
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", senha=" + senha + ", perfil=" + perfil + ", email=" + email
				+ "]";
	}

}
