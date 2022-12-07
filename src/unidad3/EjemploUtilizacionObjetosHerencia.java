package unidad3;

public class EjemploUtilizacionObjetosHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ser juanjo = new Ser("Juan José", 18, 'M', 1.76f, "Su casa", "tigre Rojo", 10, 2000);
		// Podemos asignar un objeto padre a uno de clase hija, ya que
		// contiene todos sus atributos
		Elfo dani = new Elfo("Daniel Blancas", 18, 'M', 1.72f, "Su casa", "tigre Verde", 10, 2000, 20, true, false);
		int num;
		Ser joseLuis = (Ser) dani;

		System.out.println(dani);

		System.out.println(joseLuis);

		// Creamos un elfo
		Elfo legolas = (Elfo) Mundo.generarSer(Mundo.RAZA_ELFO);

		Ser daniel = legolas;

		// Para saber si un objeto es de una clase o de otra
		// utilizamos el operados instanceOf
		if (legolas instanceof Elfo) {
			System.out.println("Legolas es un elfo");
		}

		if (daniel instanceof Elfo) {
			System.out.println("Este Ser es un elfo");
		}

		// Podemos ver la clase de un objeto utilizando getClass
		System.out.println("La clase del objeto daniel es: " + daniel.getClass());

		System.out.println(legolas);

		// Creamos un mundo
		Mundo asgard = new Mundo(20, 300);

		System.out.println(asgard);

	}

}
