package br.com.webserviceagendamedica.enumerator;

public enum Situacao {
	Marcada, /* M */
	Disponivel, /* D */
	Cancelada; /* C */

	public static Situacao getSituacao(String situacao) {

		Situacao retorno = null;
		switch (situacao) {
		case "M":
			retorno = Marcada;
		case "D":
			retorno = Disponivel;
		case "C":
			retorno = Cancelada;
		default:
			break;
		}
		return retorno;
	}

}
