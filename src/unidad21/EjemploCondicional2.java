package unidad21;

import java.util.Scanner;

public class EjemploCondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota= (int)(Math.random()*10+1);
		Scanner teclado = new Scanner(System.in);

	
		
		if (nota<5) 
			System.out.println("HAS SACADO UN " + nota + " SUSPENSO");
		else//En el else implica que es mayor o igual a 5
			if (nota<6)
				System.out.println("HAS SACADO UN " + nota + " SUFICIENTE");
			else
				if (nota<7)
					System.out.println("HAS SACADO UN " + nota + " BIEN");
				else
					if (nota<9)
						System.out.println("HAS SACADO UN " + nota + " NOTABLE");
					else//Si entra en el else es 9 o mayor de 9 
						System.out.println("HAS SACADO UN " + nota + " SOBRESALIENTE");
		
		
		teclado.close();
	}

}
