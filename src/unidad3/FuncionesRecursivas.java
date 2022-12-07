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

}
