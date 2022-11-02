package unidad22;

import java.util.Scanner;

public class EjemploTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int altura = 0;


		System.out.println("introduce la altura:");
		altura = teclado.nextInt();

		System.out.println("\n\n");

		System.out.println("\n*************************************");
		System.out.println("**********TRIANGULO*****************");
		System.out.println("*************************************\n\n");
		
		//repetimos cada linea altura veces
		for (int i = 0; i < altura; i++) {
			//Dibujamos una linea de ancho base
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			//Despues de cada linea hacemos un enter
			System.out.println();
		}

		teclado.close();
		
	}

}
