package unidad22;

import java.util.Scanner;

public class EjemploCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Realizar una calculadora que haga las 4 operaciones básicas
		// mostrara un menu del tipo
		/*
		 * 1. Suma 2. Resta 3. Multiplicar 4. Potencia 5. Salir
		 * 
		 * Introduce la opción más deseada (1-5):
		 * 
		 * El programa seguira leyendo hasta que se introduzca un 5 Si la opción que se
		 * introduce no esta dentro del rango Mostrará una advertencia y el menu otra
		 * vez
		 * 
		 * Si la opcion esta bien introducida mostrará el resultado y si quiere volver a
		 * realizar otra operacion
		 * 
		 */

		double op1 = 0, op2 = 0;
		int opcion = 0;
		Scanner teclado = new Scanner(System.in);

		// Mientras no se introduzca la opción salir seguirmos
		while (opcion != 5) {
			// Mostramos el menu
			System.out.println("\n 1. Suma\n 2. Resta\n 3. Multiplicar" + " \n 4. Potencia"
					+ "\n 5. Salir \n \n Introduce la opción más deseada (1-5):");

			// Leemos la opción seleccionada
			opcion = teclado.nextInt();

			// Si la opcion elegida no es valida, volvemos a mostrar el menu
			// Saltandonos el resto de instrucciones del while
			if (opcion < 1 || opcion > 5) {
				System.out.println("\n\nOpción Erronea\n\n");
				continue;
			}
			
			// Si elige salir no hacemos nada
			if (opcion != 5) {
				

				// Leemos los operadores
				System.out.println("Introduce el primer número: ");
				op1 = teclado.nextDouble();

				System.out.println("Introduce el segundo número: ");
				op2 = teclado.nextDouble();

				// Dependiendo de la opcion mostramos el resultado
				switch (opcion) {
				case 1:
					System.out.println("El resultado es: " + (op1 + op2));
					break;
				case 2:
					System.out.println("El resultado es: " + (op1 - op2));
					break;
				case 3:
					System.out.println("El resultado es: " + (op1 * op2));
					break;
				case 4:
					System.out.println("El resultado es: " + (Math.pow(op1, op2)));
					break;
				}
			}

		}

		teclado.close();

	}

}
