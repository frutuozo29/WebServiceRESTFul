package br.com.webserviceagendamedica.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe modelo da Especialidade
 * @Autor Renan
 */

@XmlRootElement
public class Especialidade {

	private long id;
	private String nome;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Especialidade [id=" + id + ", nome=" + nome + "]";
	}
}
