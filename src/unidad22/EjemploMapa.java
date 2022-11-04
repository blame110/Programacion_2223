package unidad22;

public class EjemploMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		/**
		 * matriz[1] devolveria un array con {4,5,6}
		 * 
		 * matriz[0][2]   	3
		 * 
		 * matriz[2][1]		8
		 * 
		 * matriz[1][1]		5
		 * 
		 * 
		 */
		
		//Para hacer el mapa utilizamos un array de dos dimensiones
		//la primera dimension es para identificar el array 
		//La segunda para identificar el caracter dentro del array 
		//que seleccionamos en la primera dimension
		char mapa[][] = {{'B','B','B','R','B','B','B','B','B','B'},
						{'B','B','B','R','B','B','B','B','B','B'},
						{'B','B','B','R','R','R','B','B','B','B'},
						{'B','B','B','B','B','R','B','B','B','B'},
						{'B','B','B','B','B','R','B','B','B','B'},
						{'B','B','B','R','R','R','B','B','B','B'},
						{'B','B','B','R','B','B','B','B','B','B'},
						{'B','B','B','R','R','R','B','B','B','B'},
						{'B','B','B','B','B','R','B','B','B','B'},
						{'B','B','B','B','B','R','B','B','B','B'},
					};
		
		
		//Generamos las posiciones del monstruo aleatoriamente
		int posMonX = (int)(Math.random()*10);
		int posMonY = (int)(Math.random()*10);
		
		//Introducimos al monustruo en el laberinto
		mapa[posMonX][posMonY]='M';
		
		//Monstramos por pantalla el mapa
		for (int i=0;i<mapa.length;i++)
		{
			for (int j=0;j<mapa[i].length;j++)
			{
				//Mostramos la posicion del mapa de cada coordenada
				System.out.print(mapa[i][j] + " ");
			}
			//pasamos a la siguiente linea del mapa
			System.out.println();
		}
		
	}

}
