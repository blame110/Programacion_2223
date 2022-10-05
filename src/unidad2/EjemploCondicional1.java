package unidad2;

import java.util.Scanner;

public class EjemploCondicional1 {

	public static void main(String[] args) {
		// ejercicio teoria sencillo
		/*
		 * Escribir un programa que tire un dado de 100 de forma aleatoria utilizando
		 * Math.random() y dependiendo del valor muestre critico mayor de 90 - pifia
		 * menor de 17 Debe de decir si el valor es superior a 50 o no y muestre el
		 * valor del dado en todos los casos
		 */

		// TODO Auto-generated method stub
		int edad = 0;
		double sueldo = 0;
		String comunidad = "";
		Scanner teclado = new Scanner(System.in);

		// Leemos la edad de teclado
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();

		// ejemplo de estructura condicional
		// evalua la condicion entre parentesis
		// y si es cierta ejecuta el código que hay dentro
		if (edad % 2 == 0) {
			System.out.println("Oye, tu edad " + edad + " es par, jajaja");
		}

		// Leemos el sueldo anual por teclado
		System.out.print("Introduce tu sueldo: ");
		sueldo = teclado.nextDouble();

		// Si el sueldo es mayor de 30mil saco un mensaje
		if (sueldo > 30000) {
			System.out.println("Tu sueldo es superior a 30000");
		} else {
			System.out.println("Tu sueldo es inferior o igual a 30000");
		}
		
		// Leemos la comunidad autonoma
		System.out.print("Introduce tu Comunidad: ");
		comunidad = teclado.next();

		if (comunidad.equalsIgnoreCase("Andalucia")) {
			System.out.println("Bienvenido al sur");
		}

		teclado.close();
	}

}
