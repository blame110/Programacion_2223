package unidad22;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploNumerosEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Leer por teclado un numero que sea cantidad y a partir de ahi ir leyendo
		 * numeros hasta que se hayan introducido cantidad de numeros pares
		 */

		int cantPar = 0, cantParAct = 0;
		int num = 0;
		Scanner teclado = new Scanner(System.in);
		int listaPares[];

		// Leemos la cantidad de pares a buscar
		System.out.print("Introduce la cantidad de pares a buscar:");
		cantPar = teclado.nextInt();

		// Definimos el tamaño de la lista de pares
		listaPares = new int[cantPar];
		int i = 0;
		// Mientras no se hayan encontrado los pares introducidos seguimos leyendo
		while (cantPar != cantParAct) {
			// leemos un numero
			System.out.print("Introduce un numero:");
			num = teclado.nextInt();

			if (num % 2 == 0) {
				// Guardamos el número par en la lista de numeros
				listaPares[i] = num;

				// Incrementamos el número de pares encontrados
				cantParAct++;

				// Incrementamos la posición de la lista
				// Para que pase a la siguiente posicion vacia
				i++;
			}

		}

		System.out.println("Se han encontrado " + cantPar + " números pares, felicidades!");

		System.out.println("Lista de numeros pares: " + Arrays.toString(listaPares));
		// PORHACER toString no funciona, sacar por pantalla la lista de los números
		// pares
		// recorriendo el array listaPares
		teclado.close();

	}

}
