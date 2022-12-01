package unidad3;

public class Localizacion {

	private String descripcion = "";
	private boolean esNeutral = true;
	private int temperatura;
	private String bando;
	public int coordx;
	public int coordy;

	/**
	 * Constructor vacio que inicializa las variables miembro
	 */
	public Localizacion() {

		// inicializamos los valores
		this.descripcion = "";
		this.esNeutral = false;
		this.temperatura = 0;
		this.bando = "";
		this.coordx = 0;
		this.coordy = 0;
	}

	/**
	 * @param descripcion
	 * @param esNeutral
	 * @param temperatura
	 * @param bando
	 * @param coordx
	 * @param coordy
	 */
	public Localizacion(String descripcion, boolean esNeutral, int temperatura, String bando, int coordx, int coordy) {
		super();
		this.descripcion = descripcion;
		this.esNeutral = esNeutral;
		this.temperatura = temperatura;
		this.bando = bando;
		this.coordx = coordx;
		this.coordy = coordy;
	}

	public String getDescripcion() {

		return descripcion + " la temperatura es " + this.temperatura + " estas en la zona de " + this.bando;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEsNeutral() {
		return esNeutral;
	}

	public void setEsNeutral(boolean esNeutral) {
		this.esNeutral = esNeutral;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public String getBando() {
		return bando;
	}

	public void setBando(String bando) {
		this.bando = bando;
	}

}
