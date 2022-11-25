package unidad22;

import java.util.Scanner;

public class SolucionExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa en java que haga los siguientes cálculos.
		 * 
		 * Leerá un conjunto de n videojuegos de teclado, con los siguientes datos:
		 * 
		 * Nombre Precio Categoría (Aventura, plataformas, Terror, Shooter) Stock
		 * Puntuación (entre 1 y 10)
		 * 
		 * El usuario introducirá primero la cantidad de videojuegos que va a introducir
		 * por teclado.
		 * 
		 * Y con dichos datos comprobará los siguiente una vez leídos todos los datos:
		 * 
		 * Cuando un producto tenga stock 0, guardará su nombre en un array y mostrará
		 * al final la lista de productos sin stock a pedir de nuevo.
		 * 
		 * La media de precio y el nombre del videojuego más caro y más barato.
		 * 
		 * Mostrar el nombre de los juegos que sean de categoría Plataformas cuya
		 * puntuación sea superior a 9 o cuesten menos de 19 euros
		 * 
		 * Mostrará el Stock total de los productos de la categoría Terror
		 * 
		 * Según se leen los datos se comprobará que los valores de categoría y
		 * puntuación están dentro de los valores posibles entre paréntesis, sino se le
		 * seguirá pidiendo dicho dato hasta que introduzca un valor correcto.
		 * 
		 */

		// Variables para leer los datos
		int numVideojuegos = 0;
		String nombre = "";
		double precio = 0.0;
		String categoria = "";
		int stock = 0;
		int puntuacion = 0;

		// Variables para los calculos
		double sumaPrecios = 0;
		double maxPrecio = -Double.MAX_VALUE;
		double minPrecio = Double.MAX_VALUE;
		String nomMaxPrecio = "", nomMinPrecio = "";
		int stockTerror = 0;
		String listaNombresCond = " ";
		String listaCeroStock[];

		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado la cantidad de videojuegos a tratar
		System.out.print("Introduce el número de videojuegos: ");
		numVideojuegos = teclado.nextInt();

		// Definimos el tamaño del array de nombres de videojuegos al máximo posible
		listaCeroStock = new String[numVideojuegos];

		// Tratamos todos los videojuegos dentro del bucle
		for (int i = 0; i < numVideojuegos; i++) {

			// Leemos los datos del videojuego
			System.out.print("Nombre del videojuego " + (i + 1) + ": ");
			nombre = teclado.next();
			System.out.print("Precio del videojuego " + (i + 1) + ": ");
			precio = teclado.nextDouble();

			// Mientras no se instro
			do {
				System.out.print("Categoria del videojuego (terror, plataformas, shooter, aventura) " + (i + 1) + ": ");
				categoria = teclado.next();
			} while (!categoria.equals("terror") && !categoria.equals("plataformas") && !categoria.equals("shooter")
					&& !categoria.equals("aventuras"));

			System.out.print("Stock del videojuego " + (i + 1) + ": ");
			stock = teclado.nextInt();

			do {
				System.out.print("Puntuacion del videojuego (0-10)" + (i + 1) + ": ");
				puntuacion = teclado.nextInt();
			} while (puntuacion < 0 || puntuacion > 10);

			// Vamos sumando todos los precios en la variable sumaPrecios
			sumaPrecios = sumaPrecios + precio;

			// Calculo del maximo, si el precio del videojuego actual es superior
			// Al de el maximo, es el nuevo maximo
			if (precio > maxPrecio) {
				maxPrecio = precio;
				nomMaxPrecio = nombre;
			}

			// Calculo del minimo, si el precio del videojuego actual es inferior
			// Al de el minimo, es el nuevo minimo
			if (precio < minPrecio) {
				minPrecio = precio;
				nomMinPrecio = nombre;
			}

			// Si la categoria es terror, añadimos su stock al sumatorio
			if (categoria.equals("terror")) {
				stockTerror = stockTerror + stock;
			}

			// Si cumplen las condiciones mostramos el nombre
			if (categoria.equals("plataformas") && puntuacion > 9 || precio < 19) {

				// System.out.println(nombre);
				listaNombresCond = listaNombresCond + " " + nombre;
			}

			// Si el stock del videojuego es 0 guardamos su nombre
			if (stock == 0)
				listaCeroStock[i] = nombre;
			else
				listaCeroStock[i] = "-";

		}

		System.out.println("La media de los precios es: " + (sumaPrecios / numVideojuegos));
		System.out.println("El videojuego mas caro es: " + nomMaxPrecio);
		System.out.println("El videojuego mas barato es: " + nomMinPrecio);
		System.out.println("Quedan " + stockTerror + " unidades de videojuegos de Terror");
		System.out.println("Los videojuegos que cumplen las condiciones son:\n" + listaNombresCond);

		System.out.println("Lista de Videojuegos fuera de Stock");
		for (int i = 0; i < numVideojuegos; i++) {
			// Si no esta el caracter - implica que hay un nombre y hay que mostrarlo
			if (!listaCeroStock[i].equals("-"))
				System.out.println(listaCeroStock[i]);

		}

		teclado.close();

	}

}
