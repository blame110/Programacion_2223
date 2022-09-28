package unidad1;

public class EjemploCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreModulo = "Desarrollo Entorno Servidor";
		
		//Longitud de la cadena
		System.out.println("La longitud es: " + nombreModulo.length());
		
		//Para concatenar cadenas podemos utilizas concat
		String horas = " tiene ocho horas semanales";
		
		System.out.println("La asignatura ".concat(nombreModulo.concat(horas)));
		
		//Pasar una cadena a mayusculas
		System.out.println(nombreModulo.toUpperCase());
		
		//Mostrar el caracter en una posicion en particular
		//La primera posicion empieza por 0 no por 1
		System.out.println(nombreModulo.charAt(4));
		
		
		String palabraBuscada = "Entorno";
		//Busqueda de palabras en un string
		System.out.println("La palabra esta en la posicion " + nombreModulo.indexOf(palabraBuscada));
		
		//Substitucion de una cadena por otras
		System.out.println(horas.replaceAll("ocho", "diez"));
		
	}

}
