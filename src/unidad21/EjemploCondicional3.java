package unidad21;

public class EjemploCondicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Acesso a policia, mayor edad
		// contraseña valoraciónes mayusculas y minusculas
		// longitud mayor que algo
		// simbolos

		/*
		 * En nuestra discoteca se podrá entrar siempre que cumplas las siguientes
		 * Condiciones: 
		 * 1- Ser mayor de edad obligatorio 
		 * 2- Pagar la entrada de 10$ o
		 * ser vip 
		 * 3- llevar el dni encima o ser vip 
		 * 4- no estar en una lista negra 
		 * 5-ç Ir bien vestido y aseado o ser vip
		 */

		int edad = 17;
		double dineroBolsillo = 12.5;
		boolean llevoDni = true, perteneceLN = false;
		boolean bienVestido = false, vip = true;
		
		if ( (edad>=18) && !perteneceLN &&((dineroBolsillo>=10 && llevoDni && bienVestido ) || vip) )
				
			System.out.println("Bienvenido esta es tu casa");
		else
			System.out.println("A tu casa");
		
		// Vamos a poner las condiciones que le mandarian a casa
		if ((edad < 18) || (dineroBolsillo < 10 && !vip) || (perteneceLN == true)
				|| (bienVestido == false && vip == false) || (llevoDni == false && vip == false) )
			System.out.println("A tu casa");
		else
			System.out.println("Bienvenido esta es tu casa");

	}

}
