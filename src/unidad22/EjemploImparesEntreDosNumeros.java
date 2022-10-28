package unidad22;

import java.util.Scanner;

public class EjemploImparesEntreDosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer por pantalla dos numeros y mostrar los numeros impares entre dichos numeros
		
		Scanner teclado = new Scanner(System.in);
		int num1=0,num2=0;
		
		System.out.println("Introduce el primer número: ");
		num1=teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2=teclado.nextInt();
		
		//si intruduce el primer numero mayor que el segundo
		//tenemos un problema
		if (num1>num2)
		{
			int intercambio=num1;
			num1=num2;
			num2=intercambio;
		}
		
		//Si el inicial es par le sumo 1 para que empieze por imares
		if (num1%2==0) num1++;
		
		while (num1<=num2)
		{
			System.out.println(num1);
			num1=num1+2;
		}
		/*
		 * Version que comprueba todos los valores
		while (num1<=num2)
		{
			if (num1%2!=0) System.out.println(num1);
			num1++;
		}
		*/
		
		
		
		
		teclado.close();
	}

}
