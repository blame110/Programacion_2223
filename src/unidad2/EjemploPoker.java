package unidad2;

import java.util.Scanner;

public class EjemploPoker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * El programa leera 5 cartas de poker y 
	 * tendrá que detectar si ha salido un poker
	 * Corazon-H Picas-S Diamante-D Trebol-T
	 * As de diamantes AD
	 * cinco de picas 5S
	 * 
	 * 
	 * carta1="1D";
	 * En ese caso carta1.charAt(0) valdria '4' y chartAt(1) valdria 'D')
	 */
	//Variable que guarda la mano de poker
		
	Scanner teclado = new Scanner(System.in);
	String carta1= "", carta2= "",carta3= "",carta4= "",carta5 = "";
	
	System.out.println("Introduce la carta 1 (2-10 o JQKA, seguido de HSDT): ");
	carta1 = teclado.next();
	
	//Comprobamos que la longitud de la cadena esta en el rango correcto
	if (!(carta1.length()<=3 && carta1.length()>=2))
	{
		System.out.println("Solo puedes introducir 2 o 3 caracteres");
		System.exit(-1);
	}
	System.out.println(carta1.charAt(1) + " condicion " + (carta1.charAt(1) == 'H'));
	//Si es de dos caracteres comprobamos que el palo es correcto
	if ((carta1.length()==2 && !((carta1.charAt(1) == 'H') || (carta1.charAt(1) == 'S') || (carta1.charAt(1) == 'D') || (carta1.charAt(1) == 'T'))))
	{
		System.out.println("Has introducido mal el palo");
		System.exit(-1);
	}
	
	
	//Si es de tres caracteres comprobamos que el palo es correcto
	if ((carta1.length()==3 && !((carta1.charAt(2) == 'H') || (carta1.charAt(2) == 'S') || (carta1.charAt(2) == 'D') || (carta1.charAt(2) == 'T'))))
	{
		
		System.out.println("Has introducido mal el palo");
		System.exit(-1);
	}
	
	System.out.println("Introduce la carta 2 (2-10 o JQKA): ");
	carta2 = teclado.next();
	
	//Comprobamos que la longitud de la cadena esta en el rango correcto
	if (!(carta2.length()<=3 && carta2.length()>=2))
	{
		System.out.println("Solo puedes introducir 2 o 3 caracteres");
		System.exit(-1);
	}
	
	//Si es de dos caracteres comprobamos que el palo es correcto
	if ((carta2.length()==2 && !((carta2.charAt(1) == 'H') || (carta2.charAt(1) == 'S') || (carta2.charAt(1) == 'D')|| (carta2.charAt(1) == 'T'))))
	{
		System.out.println("Has introducido mal el palo");
		System.exit(-1);
	}
	
	//Si es de tres caracteres comprobamos que el palo es correcto
	if ((carta2.length()==3 && !((carta2.charAt(2) == 'H') || (carta2.charAt(2) == 'S') || (carta2.charAt(2) == 'D')|| (carta2.charAt(2) == 'T'))))
	{
		System.out.println("Has introducido mal el palo");
		System.exit(-1);
	}
	
	
	System.out.println("Introduce la carta 3 (2-10 o JQKA): ");
	carta3 = teclado.next();
	
	//Comprobamos que la longitud de la cadena esta en el rango correcto
	if (!(carta3.length()<=3 && carta3.length()>=2))
	{
		System.out.println("Solo puedes introducir 2 o 3 caracteres");
		System.exit(-1);
	}
	
	//Si es de dos caracteres comprobamos que el palo es correcto
	if ((carta3.length()==2 && !((carta3.charAt(1) == 'H') || (carta3.charAt(1) == 'S') || (carta3.charAt(1) == 'D')|| (carta3.charAt(1) == 'T'))))
	{
		System.out.println("Has introducido mal el palo");
		System.exit(-1);
	}
	
	//Si es de tres caracteres comprobamos que el palo es correcto
	if ((carta3.length()==3 && !((carta3.charAt(2) == 'H') || (carta3.charAt(2) == 'S') || (carta3.charAt(2) == 'D')|| (carta3.charAt(2) == 'T'))))
	{
		System.out.println("Has introducido mal el palo");
		System.exit(-1);
	}
	
	
	System.out.println("Introduce la carta 4 (2-10 o JQKA): ");
	carta4 = teclado.next();
	
	//Comprobamos que la longitud de la cadena esta en el rango correcto
	if (!(carta4.length()<=3 && carta4.length()>=2))
	{
		System.out.println("Solo puedes introducir 2 o 3 caracteres");
		System.exit(-1);
	}
	
	//Si es de dos caracteres comprobamos que el palo es correcto
	if ((carta4.length()==2 && !((carta4.charAt(1) == 'H') || (carta4.charAt(1) == 'S') || (carta4.charAt(1) == 'D')|| (carta4.charAt(1) == 'T'))))
	{
		System.out.println("Has introducido mal el palo");
		System.exit(-1);
	}
	
	//Si es de tres caracteres comprobamos que el palo es correcto
	if ((carta4.length()==3 && !((carta4.charAt(2) == 'H') || (carta4.charAt(2) == 'S') || (carta4.charAt(2) == 'D')|| (carta4.charAt(2) == 'T'))))
	{
		System.out.println("Has introducido mal el palo");
		System.exit(-1);
	}
	
	
	System.out.println("Introduce la carta 5 (2-10 o JQKA): ");
	carta5 = teclado.next().toUpperCase();
	
	//Comprobamos que la longitud de la cadena esta en el rango correcto
	if (!(carta5.length()<=3 && carta5.length()>=2))
	{
		System.out.println("Solo puedes introducir 2 o 3 caracteres");
		System.exit(-1);
	}
	
	//Si es de dos caracteres comprobamos que el palo es correcto
	if ((carta5.length()==2 && !((carta5.charAt(1) == 'H') || (carta5.charAt(1) == 'S') || (carta5.charAt(1) == 'D')|| (carta5.charAt(1) == 'T'))))
	{
		System.out.println("Has introducido mal el palo");
		System.exit(-1);
	}
	
	//Si es de tres caracteres comprobamos que el palo es correcto
	if ((carta5.length()==3 && !((carta5.charAt(2) == 'H') || (carta5.charAt(2) == 'S') || (carta5.charAt(2) == 'D')|| (carta5.charAt(2) == 'T'))))
	{
		System.out.println("Has introducido mal el palo");
		System.exit(-1);
	}
	
	
	/*
	 * Comprobamos si es un flush color
	 * 
	 * Si comprobasemos si las cartas son iguales, cartax es un string
	 * y para compararlas se utiliza la funcion equals, sería
	 * carta1.equals(carta2) porque son de tipo String
	 * 
	 * Sin embargo charAt nos devuelve tipo char, que se compara directamente
	 * con ==
	 */
	//
	if (carta1.charAt(1)==carta2.charAt(1) && carta1.charAt(1)==carta3.charAt(1) && carta1.charAt(1)==carta4.charAt(1) && carta1.charAt(1)==carta5.charAt(1))
		System.out.println("Es color");
	
	
	
	
	
	teclado.close();
	}

}
