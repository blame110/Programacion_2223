package unidad1;

public class Ejemplo1TiposDeVariables {

	public static void main(String[] args) {
		
		//Esto es un comentario
		/*
		 * Comentario multiple
		 * jajajajaj
		 */
		//System.out.println("ejempol");
		//Entero sin decimales tipo int
		int edad=13;
		//Decimal de doble precision double
		double pi = 3.14159;
		float notaAsignatura= 4.6f;
		//Tipo boleano verdadero o falso
		boolean aprobado = true;
		aprobado = false;
		//String tipo cadena de texto
		String nombre = "Hector tiene: ";
		
		char soltero = 's';
		
		String frase =nombre + edad + " anios de edad.";
		
		
		
		edad=51;
		edad = 34;
		
			
		System.out.println(frase);
		System.out.println(pi);
		System.out.println(aprobado);
		System.out.println(nombre);
		System.out.println(soltero);
	}

}
