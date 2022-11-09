package unidad22;

import java.util.Scanner;

public class EjemploFactorialyDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * El factorial de un número es el resultado de multiplicar entre si todos los
		 * numeros desde el 1 hasta el propio numero, es decir:
		 * 
		 * El factorial de 3 seria 1*2*3, es decir 6 El factorial de 4 seria 1*2*3*4, es
		 * decir 24
		 * 
		 * Se suele expresar 4!
		 */

		Scanner teclado = new Scanner(System.in);
		int num = 0;
		double factorial = 1;

		// leemos el número de teclado
		System.out.println("Introduce el numero del cual quieres saber el factorial");
		num = teclado.nextInt();
		// La i tiene que entrar para i=num para que se multiplique el último número
		for (int i = 1; i <= num; i++) {
			// En factorial vamos mulplicando el valor actual de la i
			// Por lo que valga factorial, que es la multiplicacion de los elementos
			// anteriores
			factorial = i * factorial;
		}

		System.out.println("El factorial es: " + factorial);

		teclado.close();

		/**
		 * Hacer un programa que lea un número y muestre todos sus divisores desde 1
		 * hasta el numero Un numero es divisor de otro si al dividirlo su resto es 0 es
		 * decir 4 es divisor de 8 porque 8/4=2 y el resto es 0 4 es divisor de 12
		 * porque 12/4=3 y el resto es 0 5 es divisor de 15 porque 15/5=3 y el resto es
		 * 0
		 */

		// Generamos un número entre 1 y 100
		int numA = (int) (Math.random() * 100 + 1);

		// Vamos desde 1 hasta el numero comprobando si es dividor
		for (int i = 1; i <= numA; i++)

			if (numA % i == 0)
				System.out.println(i + " es divisor de " + numA);
	}

}
