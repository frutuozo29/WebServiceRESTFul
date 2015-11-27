package br.com.webserviceagendamedica.enumerator;

public enum Perfil {
	User, /* U */
	Admin; /* A */

	public static Perfil getPerfil(String perfil) {

		Perfil retorno = null;
		switch (perfil) {
		case "U":
			retorno = User;
		case "A":
			retorno = Admin;
		default:
			break;
		}
		return retorno;
	}
}
