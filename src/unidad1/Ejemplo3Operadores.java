package unidad1;

public class Ejemplo3Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=2,y=5;
		
		
		
		System.out.println("La suma es: " + (x+y));
		System.out.println(x-y);
		//Si ponemos parentesis primero realiza el calculo de dentro
		System.out.println("El resultado es: " +(x+y)/y);
		//Sino ejecuta la operación de mayor prioridad, entre las básicas 
		//La prioridad es * / + - 
		System.out.println(x+y/y);
		System.out.println(x*y);
		
	}

}
