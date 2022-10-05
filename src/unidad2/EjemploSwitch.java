package unidad2;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constantes de tipos de raza
		final String DES_HUMANO = "Raza Humana";
		final String DES_ENANO = "Raza Enana";
		final String DES_ELFO = "Raza Elfo";
		final String DES_TROLL = "Raza Troll de las Cavernas de la Muerte Oscura";
		final String DES_REPTILIANO = "Raza Lagartija";
		final String DES_GNOMO = "Raza No me hacen caso";
			
		int tirada6 = (int)(Math.random()*6+1);
		String raza="";
		
		System.out.println("Has sacado un " + tirada6 + " en la tirada de raza\n");
		
		switch (tirada6) {
		case 1:
			System.out.println(DES_HUMANO);
		case 2:
			System.out.println(DES_ENANO);
		case 3:
			System.out.println(DES_ELFO);
		case 4:
			System.out.println(DES_TROLL);
		case 5:
			System.out.println(DES_REPTILIANO);
		case 6:
			System.out.println(DES_GNOMO);
			
		}
		
		
	}

}
