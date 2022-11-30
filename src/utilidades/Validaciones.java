package utilidades;

public class Validaciones {

	/**
	 * Devuelve cierto si es positivo
	 * 
	 * @param numero
	 * @return
	 */
	public static boolean esPositivo(int numero) {
		// Si es positivo devolvemos cierto
		if (numero >= 0)
			return true;
		else
			return false;

	}

	// Ponemos el modificador estatico en esta funcion/metodo para poder utilizarlo
	// directamente
	public static boolean validPassword(String password) {

		boolean hayNumero = false;
		boolean hayCaracter = false;

		// Tiene que tener mas de 8 caracteres
		if (password.length() < 8)
			return false;

		// Tiene que tener al menos un numero
		for (int i = 0; i < password.length(); i++) {
			// isdigit comprueba si el caracter en la posicion i es numerico
			if (Character.isDigit(password.charAt(i))) {
				hayNumero = true;
			}
			// isalphabetic comprueba si el caracter en la posicion i es alfanumerico
			if (Character.isAlphabetic(password.charAt(i))) {
				hayCaracter = true;
			}
		}

		// Si cumple las dos condiciones es un password valido
		if (hayCaracter && hayNumero)
			return true;
		else
			return false;

	}

}
