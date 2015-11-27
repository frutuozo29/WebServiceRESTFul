package br.com.webserviceagendamedica.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe Modelo LocalAtendimento
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
@XmlRootElement
public class LocalAtendimento {
	
	private long id;
	private String nome;
	private String endereco;

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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
