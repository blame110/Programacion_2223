package unidad22;

import java.util.Scanner;

public class EjemploArrayEstadisticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int cantNumeros=0;
		double sumatorio=0;
		double max=-Double.MAX_VALUE;
		double min=Double.MAX_VALUE;
		//Un array es un conjunto de elementos
		//a la hora de acceder la posicion del primer elemento es la 0
		int numeros[] = {3,5,2,8,6};
		
		numeros[2]= 256;
		
		//System.out.println("El numero que esta en la posicion 2 es " + numeros[2]);
		
		//Mostramos por pantalla todos los valores del array
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println(numeros[i]);
		}
		
		//Leemos la cantidad de números para calcular
		System.out.println("Introduce la cantidad de números");
		cantNumeros = teclado.nextInt();
		
		//Creamos el array poniendo el tamaño entre los corchetes y utilizando new
		int numAleatorios[] = new int[cantNumeros];
		
		//Recorremos el array de numeros aleatorios dandole valores aleatorios
		for(int i=0;i<numAleatorios.length;i++)
		{
			numAleatorios[i]=(int)(Math.random()*10+1);
			System.out.println(numAleatorios[i]);
		}
		
		//Leemos todos los numeros
		for(int i=0;i<cantNumeros;i++) {
			
		
			//Sumamos el numero leido al sumatorio
			sumatorio = sumatorio + numAleatorios[i];
			
			//Si el número que leemos es mayor que nuestro maximo
			//hasta ese momento el numero leido sera el nuevo maximo
			if (numAleatorios[i]>max) max=numAleatorios[i];
			
			//Para el minimo es igual pero si es menor el numero leido
			//Que nuestro minimo
			if (numAleatorios[i]<min) min=numAleatorios[i];
			
		}
	
		System.out.println("La suma de todos los numeros es " + sumatorio);
		System.out.println("La media de todos los numeros es " + sumatorio/cantNumeros);
		System.out.println("El maximo es " + max);
		System.out.println("El mínimo es " + min);
		
		
		teclado.close();
		
		
		
		
	}

}
