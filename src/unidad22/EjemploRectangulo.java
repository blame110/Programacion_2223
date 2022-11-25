package unidad22;

import java.util.Scanner;

public class EjemploRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Leer por teclado la altura y la base de un rectangulo y dibujarlo por
		 * pantalla con * por ejemplo un rectangulo de altura 2 y base 3 seria
		 * 
		 * *** ***
		 */

		Scanner teclado = new Scanner(System.in);

		int base = 0, altura = 0;

		System.out.println("introduce la base:");
		base = teclado.nextInt();
		System.out.println("introduce la altura:");
		altura = teclado.nextInt();

		System.out.println("\n\n");

		System.out.println("\n*************************************");
		System.out.println("**********RECTANGULO*****************");
		System.out.println("*************************************\n\n");

		// repetimos cada linea altura veces
		for (int j = 0; j < altura; j++) {
			// Dibujamos una linea de ancho base
			for (int i = 0; i < base; i++) {
				System.out.print("*");
			}
			// Despues de cada linea hacemos un enter
			System.out.println();
		}

		System.out.println("\n*************************************");
		System.out.println("**********RECTANGULO HUECO*************");
		System.out.println("*************************************\n\n");

		// Dibujamos la linea superior
		for (int i = 0; i < base; i++) {
			System.out.print("*");
		}
		System.out.println();

		// Escribimos con un bucle las lineas con los espacios en medio
		for (int i = 0; i < altura - 2; i++) {
			// Dibujo el primer borde
			System.out.print("*");

			for (int j = 0; j < base - 2; j++) {
				System.out.print(" ");
			}

			// Dibujo el último borde
			System.out.print("*\n");
		}

		// Dibujamos la linea inferior
		for (int i = 0; i < base; i++) {
			System.out.print("*");
		}

		System.out.println("\n*************************************");
		System.out.println("**********RECTANGULO HUECO*************");
		System.out.println("*************************************\n\n");

		// Ejercicio a realizar
		// PORHACER Realizar este mismo ejemplo pero con la logica contraria
		// Es decir dibujar espacio si cumple la condicion que sea
		// repetimos cada linea altura veces
		for (int j = 0; j < altura; j++) {
			// Dibujamos una linea de ancho base
			for (int i = 0; i < base; i++) {

				/*
				 * Para dibujar un * debe estar en la parte exterior la linea superior del
				 * rectangulo implica que la altura j sea 0 la linea inferior implica que la j
				 * sea altura-2 la linea lateral izquierda implica que la i sea 0 la linea
				 * lateral derecha implica que la i sea base-1
				 */
				if (j == 0 || j == altura - 1 || i == 0 || i == base - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			// Despues de cada linea hacemos un enter
			System.out.println();
		}

		teclado.close();

	}

}
