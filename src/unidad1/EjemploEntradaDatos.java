package unidad1;

import java.util.Scanner;

public class EjemploEntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="";
		int edad=22;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre, por favor: ");
		//leemos cadenas de texto con next o nextline
		nombre = teclado.next();
		
		System.out.print("Introduce tu edad: ");
		//leemos un numero con nextint, cuidado que si introduce caracteres peta
		edad = teclado.nextInt();
		
		
		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
		
		//Cerramos el objeto Scanner
		teclado.close();
		
	}

}
