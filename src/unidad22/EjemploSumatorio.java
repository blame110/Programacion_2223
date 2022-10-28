package unidad22;

public class EjemploSumatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear un programa que dado un numero me devuelva su sumatorio
		//por ejemplo si se intrude el 4 devolvera 4+3+2+1 es decir 10
		//Se comprobara que el número es positivo y sino se cambiara el signo
		int resultado=0;
		int num = 4;
		
		//si el número es negativo lo positifamos
		if (num<0) { num=-num;}
		
		//Vamos bajando desde el numero hasta 1 sumando todos los valores
		//en la variable resultado
		for (int i = num; i>=1;i-- )
		{
			resultado=resultado+i;
		}
		
		System.out.println("El sumatorio es " + resultado);
		
		
	}

}
