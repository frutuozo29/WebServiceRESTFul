package br.com.webserviceagendamedica.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.webserviceagendamedica.enumerator.Situacao;


/**
 * Classe Modelo AgendaMedica
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
@XmlRootElement
public class AgendaMedica {
	
	private long id;
	private Date dataAgenda;
	private Medico medico;
	private LocalAtendimento localAtendimento;
	private Situacao situacao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDataAgenda() {
		return dataAgenda;
	}
	public void setDataAgenda(Date dataAgenda) {
		this.dataAgenda = dataAgenda;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public LocalAtendimento getLocalAtendimento() {
		return localAtendimento;
	}
	public void setLocalAtendimento(LocalAtendimento localAtendimento) {
		this.localAtendimento = localAtendimento;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
}
