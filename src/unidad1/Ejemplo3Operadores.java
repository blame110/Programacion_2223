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
		
		int cantidad=9;
		//Muestra por pantalla 9 ya que el incremento se hace despues
		System.out.println(cantidad++);
		
		//Para generar un número aleatorio utilizamos Math.random()
		
		double aleatorio =  Math.random();
		
		System.out.println("El numero aleatorio por defecto es " + aleatorio);
		
		System.out.println("El numero aleatorio por defecto es " + (int)(aleatorio*20+1));
		
		int numMelones = (int)(Math.random()*100+1);
		
		System.out.println("Hay " +  numMelones + " y su modulo es " + numMelones%2);
		
	}

}
