package unidad22;

import java.util.Scanner;

public class EjemploTablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// realizar la tabla de multiplicar del numero
		// que quiera el usuario
		Scanner teclado = new Scanner(System.in);

		System.out.println("tabla de multplicar del número:");

		int numTabla = teclado.nextInt();

		int i = 1;

		while (i <= 10) {
			System.out.println(numTabla + " x " + i + " = " + numTabla * i);
			i++;
		}

		// Mostrar por pantalla todas las tablas de multiplicar

		int j = 1;

		// El bucle exterior es el que va mostrando todas las tablas,
		// cada vez que la j se incrementa, se mostrará completa una tabla de
		// multiplicar, la correspondiente a la j en esa repeticion
		while (j <= 10) {

			System.out.println("\n\n***************************************");
			System.out.println("**    Tabla de Multiplicar del " + j + "    **");
			System.out.println("***************************************\n\n");

			i = 1;
			// El bucle interior mostrará la tabla de multiplicar completa
			// del número j
			while (i <= 10) {
				System.out.println(j + " x " + i + " = " + j * i);
				i++;
			}

			// Pasamos a la siguiente tabla de multiplicar
			j++;
		}

		System.out.println("\n\nCon el bucle for:\n\n");

		System.out.println("\n\n***************************************");
		System.out.println("**    Tabla de Multiplicar del 1     **");
		System.out.println("***************************************\n\n");

		for (j = 1; j <= 10; j++) {

			// Mostramos la tabla de multiplicar de j
			for (i = 1; i <= 10; i++) {
				System.out.println(j + " x " + i + " = " + j * i);
			}

			if (j < 10) {
				System.out.println("\n\n***************************************");
				System.out.println("**    Tabla de Multiplicar del " + (j + 1) + "    **");
				System.out.println("***************************************\n\n");
			}

		}

		teclado.close();

	}

}
