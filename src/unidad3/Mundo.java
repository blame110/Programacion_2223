package unidad3;

import java.util.ArrayList;

public class Mundo {

	/**
	 * El mundo va a tener las siguientes miembros
	 * 
	 * nombre int tamanio privado y solo get tipo desertico, helado, tropical
	 * numHabitantes esRadiactivo tempMedia
	 * 
	 * Todos son privados con get y set excepto tamaño
	 * 
	 * Dos constructores, uno vacio que le de valores aleatorios y otro que recibe
	 * todos los valores
	 * 
	 * Funcion esDemasiadoCalido devuelve cierto si la temp es mayor a 50 grados y
	 * su tamaño es superior a 5000km
	 * 
	 * Funcion EdadMediaHabitantes Funcion PorcentajeAgua
	 * 
	 */

	// Constantes de la clase
	public final static int RAZA_ELFO = 0;
	public final static int RAZA_HUMANO = 1;
	public final static int RAZA_ORCO = 2;
	public final static int CLIMA_DESIERTO = 0;
	public final static int CLIMA_HELADO = 1;
	public final static int CLIMA_TROPICAL = 2;

	// Variables miembro de la clase
	private String nombre;
	private int tamanio;
	private String tipoClima;
	private int numHab;
	private boolean esRad;
	private int tempMed;

	// Con un arraylist vamos a gestionar los habitantes del mundo
	ArrayList<Ser> listaSeres;

	// Con un arraylist gestionamos las localizaciones del mundo
	ArrayList<Localizacion> lugares;

	/**
	 * 
	 */
	public Mundo() {

		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param tamanio
	 * @param tipoClima
	 * @param numHab
	 * @param esRad
	 * @param tempMed
	 */
	public Mundo(String nombre, int tamanio, String tipoClima, int numHab, boolean esRad, int tempMed) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.tipoClima = tipoClima;
		this.numHab = numHab;
		this.esRad = esRad;
		this.tempMed = tempMed;
	}

	/**
	 * @param nombre
	 * @param tamanio
	 * @param tipoClima
	 * @param numHab
	 * @param esRad
	 * @param tempMed
	 * @param listaSeres
	 * @param lugares
	 */
	public Mundo(String nombre, int tamanio, String tipoClima, int numHab, boolean esRad, int tempMed,
			ArrayList<Ser> listaSeres, ArrayList<Localizacion> lugares) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.tipoClima = tipoClima;
		this.numHab = numHab;
		this.esRad = esRad;
		this.tempMed = tempMed;
		this.listaSeres = listaSeres;
		this.lugares = lugares;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoClima() {
		return tipoClima;
	}

	public void setTipoClima(String tipoClima) {
		this.tipoClima = tipoClima;
	}

	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public boolean isEsRad() {
		return esRad;
	}

	public void setEsRad(boolean esRad) {
		this.esRad = esRad;
	}

	public int getTempMed() {
		return tempMed;
	}

	public void setTempMed(int tempMed) {
		this.tempMed = tempMed;
	}

	public ArrayList<Ser> getListaSeres() {
		return listaSeres;
	}

	public void setListaSeres(ArrayList<Ser> listaSeres) {
		this.listaSeres = listaSeres;
	}

	public ArrayList<Localizacion> getLugares() {
		return lugares;
	}

	public void setLugares(ArrayList<Localizacion> lugares) {
		this.lugares = lugares;
	}

	public int getTamanio() {
		return tamanio;
	}

	/**
	 * Funcion que crea y genera aleatoriamente un Ser de la raza introducida
	 * 
	 * @param raza
	 * @return
	 */
	public static Ser generarSer(int raza) {
		// Objeto Ser a devolver
		Ser generado = new Ser();
		Elfo elfoGen;
		// Humano humGen;
		// Ogro ogroGen;

		// dependiendo del tipo de raza creamos un objeto de su tipo
		switch (raza) {
		case RAZA_ELFO:
			elfoGen = new Elfo();

			elfoGen.nombre = generarNombre(raza);

			elfoGen.tatuaje = generarNombre(raza);

			elfoGen.setAltura((float) (Math.random() * 2.4));

			// PorHacer
			// A tener en cuenta, el sexo 50% de posibilidades,
			// tiene un 80% de posibilidades de ser inmune a veneno
			// tiene un 60% de posibilidades de ser inmune a veneno

			// Asignamos el Elfo al objeto genrado tipo Ser
			generado = elfoGen;

		}
		// Devolvemos el ser generado aleatoriamente
		return generado;

	}

	/**
	 * Genera un nombre Aleatorio dependiendo de la raza
	 * 
	 * @param raza
	 * @return
	 */
	public static String generarNombre(int raza) {
		String listaNombresElfo[] = { "Legolas", "Daza", "Foli", "Juliane", "AntElf", "Wonka", "SirG" };
		String listaNombresHumano[] = { "Daniel", "Alvaro", "JoseLuis", "Carlos", "Guillermo", "Pablo", "Diego" };
		String listaNombresOrco[] = { "Strunja", "Brutus", "Palurdus", "Tiñesk", "Patrask", "Wonka", "SirG" };

		String nombre = "";
		switch (raza) {
		case RAZA_ELFO:
			nombre = listaNombresElfo[(int) (Math.random() * 7)];
			break;
		case RAZA_HUMANO:
			nombre = listaNombresHumano[(int) (Math.random() * 7)];
			break;
		case RAZA_ORCO:
			nombre = listaNombresOrco[(int) (Math.random() * 7)];
			break;
		}

		return nombre;

	}

	@Override
	public String toString() {
		return "Mundo [nombre=" + nombre + ", tamanio=" + tamanio + ", tipoClima=" + tipoClima + ", numHab=" + numHab
				+ ", esRad=" + esRad + ", tempMed=" + tempMed + ", listaSeres=" + listaSeres + ", lugares=" + lugares
				+ "]";
	}

}
