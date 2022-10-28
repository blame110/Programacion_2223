package unidad21;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Constantes de tipos de raza
		final String DES_HUMANO = "Raza Humana";
		final String DES_ENANO = "Raza Enana";
		final String DES_ELFO = "Raza Elfo";
		final String DES_TROLL = "Raza Troll de las Cavernas de la Muerte Oscura";
		final String DES_REPTILIANO = "Raza Lagartija";
		final String DES_GNOMO = "Raza No me hacen caso";

		int tirada6 = (int) (Math.random() * 6 + 1);
		String raza = "";

		System.out.println("Has sacado un " + tirada6 + " en la tirada de raza\n");

		//El switch sirve para dependiendo de una unica variable ejecutar 
		//Instrucciones dependiendo de su valor
		switch (tirada6) {
		case 1:
			System.out.println(DES_HUMANO);
			break;
		case 2:
			System.out.println(DES_ENANO);
			break;
		case 3:
			System.out.println(DES_ELFO);
			break;
		case 4:
			System.out.println(DES_TROLL);
			break;
		case 5:
			System.out.println(DES_REPTILIANO);
			break;
		case 6:
			System.out.println(DES_GNOMO);
			break;
			
			default:
				System.out.println("Esto no se va a ejecutar jamas");
		}

	}

}
