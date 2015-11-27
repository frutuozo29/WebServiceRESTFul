package br.com.webserviceagendamedica.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.webserviceagendamedica.enumerator.Situacao;

/**
 * Classe responsável por
 * 
 * @Autor Renan
 * @Criação 25 de nov de 2015
 */
@XmlRootElement
public class ConsultaMarcada {

	private long id;
	private AgendaMedica agendaMedica;
	private Usuario usuario;
	private Date data_marcacao_consulta;
	private Situacao situacao;
	private Date data_cancelamento;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public AgendaMedica getAgendaMedica() {
		return agendaMedica;
	}

	public void setAgendaMedica(AgendaMedica agendaMedica) {
		this.agendaMedica = agendaMedica;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getData_marcacao_consulta() {
		return data_marcacao_consulta;
	}

	public void setData_marcacao_consulta(Date data_marcacao_consulta) {
		this.data_marcacao_consulta = data_marcacao_consulta;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public Date getData_cancelamento() {
		return data_cancelamento;
	}

	public void setData_cancelamento(Date data_cancelamento) {
		this.data_cancelamento = data_cancelamento;
	}

	@Override
	public String toString() {
		return "ConsultaMarcada [id=" + id + ", agendaMedica=" + agendaMedica + ", usuario=" + usuario
				+ ", data_marcacao_consulta=" + data_marcacao_consulta + ", situacao=" + situacao
				+ ", data_cancelamento=" + data_cancelamento + "]";
	}

	
}
