package unidad3;

public class FuncionesRecursivas {

	/**
	 * Recibe un entero y devuelve el sumatorio desde 1 hasta dicho numero por
	 * ejemplo si recibe un 5 devolver 1+2+3+4+5 es decir 15
	 * 
	 * @param num
	 * @return el sumatorio de todos los numeros
	 */
	public static int sumatorioI(int num) {
		// utilizamos la variable sumatorio para guardar la suma
		int sumatorio = 0;
		for (int i = 1; i <= num; i++) {
			// En cada repeticion vamos incrementand el sumatorio en el siguiente valor
			sumatorio = sumatorio + i;
		}
		// Una vez acaba el bucle devolvemos el valor
		return sumatorio;
	}

	/**
	 * 
	 * 5!=1*2*3*4*5=!4*5 4!=1*2*3*4=!3*4 3!=1*2*3=!2*3 2!=1*2=!1*2 1!=1
	 * 
	 * !n=n*(n-1)! En el algoritmo recursivo cada problema depende de la solución de
	 * ese mismo problema de un tamaño inferior
	 */
	public static int factorialR(int num) {
		// Si lo mete negativo lo pasamos a positifo
		num = Math.abs(num);

		// El caso base es que el numero acabe llegando a 1, en cuyo caso
		// su factorial es directamente 1
		if (num == 1)
			return 1;
		else
			// El factorial consiste en multiplicar el numero actual por
			// El problema en un grado inferior
			return num * factorialR(num - 1);
	}

	/**
	 * Recibe un entero y devuelve el factorial desde 1 hasta dicho numero por
	 * ejemplo si recibe un 3 devolver 1*2*3 es decir 6
	 * 
	 * @param num
	 * @return el factorial de todos los numeros
	 */
	public static int factorialI(int num) {
		// utilizamos la variable factorial para guardar la suma
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			// En cada repeticion vamos incrementand el factorial en el siguiente valor
			factorial = factorial * i;
		}
		// Una vez acaba el bucle devolvemos el valor
		return factorial;
	}

	public static void divisoresI(int num) {
		// Recorremos todos los numeros desde 1 hasta num y comprobamos si son divisores
		for (int i = 1; i <= num; i++) {

			// La i es divisor de num si el resto de la division es 0
			if (num % i == 0)
				System.out.println(i);

		}
	}

	public static void divisoresR(int num, int divActual) {
		// el 1 es el final de la funcion, y siempre sera divisor
		// sea cual sea num, por lo cual lo mostramos
		if (divActual == 1)
			System.out.println(1);
		else {
			// Si es mayor de 1 hay que comprobar si es divisor de num
			if (num % divActual == 0)
				System.out.println(divActual);
			// Una vez comprobado si divActual es divisor
			// llamamos a la funcion con el siguiente divisor posible
			divisoresR(num, --divActual);

		}

	}

	public static void listarParesR(int num) {
		// Si es 2, es el último par que mostramos
		if (num == 2)
			System.out.println(num);
		else {

			// si no es 2 comprobamos si es par
			if (num % 2 == 0)
				System.out.println(num);

			// llamamos a la funcion con el siguiente numero inferior
			// Para que compruebe si es par
			listarParesR(num - 1);

		}
	}

	/**
	 * 
	 * @param numBus
	 * @param listaNum
	 * @return
	 */
	public static boolean buscarValorI(int numBus, int listaNum[]) {
		// Recorremos todas las posiciones del array ListaNum
		// con i, que va desde 0 hasta la ultima posicion length-1
		for (int i = 0; i < listaNum.length; i++) {
			// Para cada posicion que recorre i
			// Comparamos el numero a buscar con el valor de la lista
			// en esa posicion si es igual es que se ha encontrado
			if (numBus == listaNum[i])
				return true;

		}
		// Si el bucle acaba implica que ninguno de los numeros de
		// la lista es igual a numBus
		return false;

	}

	public static boolean buscarValorR(int numBus, int listaNum[], int contador) {
		// Si el numero que busco esta en la posicion actual lo hemos encontrado
		if (listaNum[contador] == numBus)
			return true;

		// Si contador llega a la ultima posicion del array y no ha encontrado
		// el numBus entonces no esta, devolvemos false
		if (contador == listaNum.length - 1)
			return false;

		// llamamos a nuestra funcion recursivamente con la siguiente posicion
		return buscarValorR(numBus, listaNum, contador + 1);

	}

}
