package unidad22;

import java.util.Scanner;

public class EjemploEstadisticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int cantNumeros=0;
		double num=0;
		double sumatorio=0;
		double max=-Double.MAX_VALUE;
		double min=Double.MAX_VALUE;

		
		//Leemos la cantidad de números para calcular
		System.out.println("Introduce la cantidad de números");
		cantNumeros = teclado.nextInt();
				
		//Leemos todos los numeros
		for(int i=0;i<cantNumeros;i++) {
			
			//Muestro un mensaje y leo el numero
			System.out.println("Introduce el número "+ (i+1) +": ");
			num=teclado.nextDouble();
			
			//Sumamos el numero leido al sumatorio
			sumatorio = sumatorio + num;
			
			//Si el número que leemos es mayor que nuestro maximo
			//hasta ese momento el numero leido sera el nuevo maximo
			if (num>max) max=num;
			
			//Para el minimo es igual pero si es menor el numero leido
			//Que nuestro minimo
			if (num<min) min=num;
			
		}
		
		System.out.println("La suma de todos los numeros es " + sumatorio);
		System.out.println("La media de todos los numeros es " + sumatorio/cantNumeros);
		System.out.println("El maximo es " + max);
		System.out.println("El mínimo es " + min);
		
		teclado.close();
		
	}

}
