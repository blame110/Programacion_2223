package unidad22;

import java.util.Scanner;

public class EjemploMapa {
	
	//Constantes de puntos cardinales
	public static final byte NORTE =0;
	public static final byte SUR =1;
	public static final byte ESTE =2;
	public static final byte OESTE =3;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		/**
		 * matriz[1] devolveria un array con {4,5,6}
		 * 
		 * matriz[0][2] 3
		 * 
		 * matriz[2][1] 8
		 * 
		 * matriz[1][1] 5
		 * 
		 * 
		 */

		// Para hacer el mapa utilizamos un array de dos dimensiones
		// la primera dimension es para identificar el array
		// La segunda para identificar el caracter dentro del array
		// que seleccionamos en la primera dimension
		char mapa[][] = { { 'B', 'B', 'B', 'R', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'R', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'R', 'R', 'R', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'R', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'R', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'R', 'R', 'R', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'R', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'R', 'R', 'R', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'R', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'R', 'B', 'B', 'B', 'B' }, };
		Scanner teclado = new Scanner(System.in);

		// Generamos las posiciones del monstruo aleatoriamente
		int posMonX = (int) (Math.random() * 10);
		int posMonY = (int) (Math.random() * 10);
		char movJug = ' ';

		// Introducimos al monustruo en el laberinto
		mapa[posMonY][posMonX] = 'M';

		// Generamos las posiciones del jugador
		int posJugX = 0;
		int posJugY = 0;

		int distancia = 0;
		// Repetimos la generación de posiciones del jugador hasta que este
		// a mas de casillas de distancia
		do {
			posJugX = (int) (Math.random() * 10);
			posJugY = (int) (Math.random() * 10);
			// La distancia se calcula sumando las distancias entre
			// las coordenadas x e y
			distancia = Math.abs(posJugX - posMonX) + Math.abs(posJugY - posMonY);

		} while (distancia < 4);
		// Ponemos al jugador en el mapa
		mapa[posJugY][posJugX] = 'J';

		// Bucle principal del juego
		while (!(posMonX == posJugX && posMonY == posJugY)) {

			// Fase1 Monstramos por pantalla el mapa
			for (int i = 0; i < mapa.length; i++) {
				for (int j = 0; j < mapa[i].length; j++) {
					// Mostramos la posicion del mapa de cada coordenada
					System.out.print(mapa[i][j] + " ");
				}
				// pasamos a la siguiente linea del mapa
				System.out.println();
			}

			// Fase2 leemos el movimiento del jugador
			System.out.println("introduce tu movimiento (N-S-E-O)");
			movJug = teclado.next().charAt(0);

			// Primero borramos al jugador
			mapa[posJugY][posJugX] = 'B';
			// Fase 3 movemos al jugador
			// Dependiendo la coordenada introducida cambiamos la posicion del jugador
			switch (movJug) {
			case 'N':
				// Restamos una posicion en vertical para que suba
				if (posJugY != 0)
					posJugY--;
				mapa[posJugY][posJugX] = 'J';
				break;
			case 'S':
				// Sumamos una posicion en vertical para que baje
				if (posJugY != mapa.length - 1)
					posJugY++;
				mapa[posJugY][posJugX] = 'J';
				break;
			case 'E':
				// Sumamos una posicion en vertical para que baje
				if (posJugX != mapa.length - 1)
					posJugX++;
				mapa[posJugY][posJugX] = 'J';
				break;
			case 'O':
				// Sumamos una posicion en vertical para que baje
				if (posJugX != 0)
					posJugX--;
				mapa[posJugY][posJugX] = 'J';
				break;
			}

			//Fase4 movimiento del monstruo
			
			//Generamos el movimiento del monstruo aleatoriamente entre 0 y 3
			byte movMon =(byte) (Math.random()*4);
			
			//Borramos la posicion actual del monstruo
			//Para que no haya estela
			mapa[posMonY][posMonX]='B';
			
			switch (movMon) {
			case NORTE:
				// Restamos una posicion en vertical para que suba
				if (posMonY != 0)
					posMonY--;
				mapa[posMonY][posMonX] = 'M';
				break;
			case SUR:
				// Sumamos una posicion en vertical para que baje
				if (posMonY != mapa.length - 1)
					posMonY++;
				mapa[posMonY][posMonX] = 'M';
				break;
			case ESTE:
				// Sumamos una posicion en vertical para que baje
				if (posMonX != mapa.length - 1)
					posMonX++;
				mapa[posMonY][posMonX] = 'M';
				break;
			case OESTE:
				// Sumamos una posicion en vertical para que baje
				if (posMonX != 0)
					posMonX--;
				mapa[posMonY][posMonX] = 'M';
				break;
			}
			
			
		}
		
		System.out.println("Estas Muerto");
		//Cerramos el scanner
		teclado.close();

	}

}
