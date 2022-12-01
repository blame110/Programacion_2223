package unidad3;

public class EjemploUtilizacionObjetosHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ser juanjo = new Ser("Juan José", 18, 'M', 1.76f, "Su casa", "tigre Rojo", 10, 2000);
		// Podemos asignar un objeto padre a uno de clase hija, ya que
		// contiene todos sus atributos
		Elfo dani = new Elfo("Daniel Blancas", 18, 'M', 1.72f, "Su casa", "tigre Verde", 10, 2000, 20, true, false);

		Ser joseLuis = (Ser) dani;

		System.out.println(dani);

		System.out.println(joseLuis);

		// Creamos un elfo
		Elfo legolas = (Elfo) Mundo.generarSer(Mundo.RAZA_ELFO);

		System.out.println(legolas);

	}

}
