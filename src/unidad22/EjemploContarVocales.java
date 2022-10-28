package unidad22;

public class EjemploContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Este programa leera una frase y contara
		 * las vocales que tiene  la frase
		 * también leera una letra y contara 
		 * la cantidad de veces que la letra esta en la frase
		 */
		
		/*
		 * String nombre="pablo";
		 * la o esta en la posicion 4 ya que empezamos a contar por 0
		 * nombre.length() nos devolvera 5 y si intentamos acceder
		 * a nombre.charAt(5) nos petara terribelemente
		 */
		
		String frase="lE Mundo esta muy guapo hoy y tengo pizza pa come";
		//frase.charAt(5) devolvería la n
		
		char letra='m';
		int numVocales=0,numRepet=0;
		
		//Convertimos a minusculas para evitar que no reconozca 
		//Las letras mayusculas
		frase=frase.toLowerCase();	
		
		//Recorremos todas las letras de la frase con charAt
		//Utilizando un bucle for
		for(int i=0;i<=frase.length()-1;i++)
		{
			char letraActual = frase.charAt(i);
			
			//Si encontramos la letra en la frase incrementamos el contador
			if (letraActual == letra) numRepet++;
			
			//Si encontramos una vocal en la frase incrementamos el contador
			if (letraActual=='a' || letraActual=='e' ||letraActual=='i' ||letraActual=='o' ||letraActual=='u' ) 
				numVocales++;
			
		}
		
		//Mostramos los resultados
		System.out.println("Se han econtrado " + numVocales + " vocales");
		System.out.println("Se ha encontrado  " +  numRepet + " veces la letra " + letra);
		
	}

}
