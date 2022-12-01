package unidad3;

/**
 * La clase Elfo hereda de ser, utiliza la herencia para recibir automaticamente
 * todos los atributos y funciones de su clase padre Ser
 * 
 * @author pmpin
 *
 */
public class Elfo extends Ser {

	private int puntosMagia;
	private boolean esInmuneEnf;
	private boolean esInmuneVen;

	/**
	 * 
	 */
	public Elfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombreRec
	 * @param edadRec
	 * @param sexoRec
	 * @param alturaRec
	 * @param dirRec
	 * @param tatuaje
	 */
	public Elfo(String nombreRec, int edadRec, char sexoRec, float alturaRec, String dirRec, String tatuaje,
			int puntosVida, int fuerza) {
		super(nombreRec, edadRec, sexoRec, alturaRec, dirRec, tatuaje, puntosVida, fuerza);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param puntosMagia
	 * @param esInmuneEnf
	 * @param esInmuneVen
	 */
	public Elfo(int puntosMagia, boolean esInmuneEnf, boolean esInmuneVen) {
		super();
		this.puntosMagia = puntosMagia;
		this.esInmuneEnf = esInmuneEnf;
		this.esInmuneVen = esInmuneVen;
	}

	/**
	 * @param nombreRec
	 * @param edadRec
	 * @param sexoRec
	 * @param alturaRec
	 * @param dirRec
	 * @param tatuaje
	 */
	public Elfo(String nombreRec, int edadRec, char sexoRec, float alturaRec, String dirRec, String tatuaje,
			int puntosVida, int fuerza, int puntosMagia, boolean esInmuneEnf, boolean esInmuneVen) {
		super(nombreRec, edadRec, sexoRec, alturaRec, dirRec, tatuaje, puntosVida, fuerza);

		this.puntosMagia = puntosMagia;
		this.esInmuneEnf = esInmuneEnf;
		this.esInmuneVen = esInmuneVen;
		// TODO Auto-generated constructor stub
	}

	public int getPuntosMagia() {
		return puntosMagia;
	}

	public void setPuntosMagia(int puntosMagia) {
		this.puntosMagia = puntosMagia;
	}

	public boolean isEsInmuneEnf() {
		return esInmuneEnf;
	}

	public void setEsInmuneEnf(boolean esInmuneEnf) {
		this.esInmuneEnf = esInmuneEnf;
	}

	public boolean isEsInmuneVen() {
		return esInmuneVen;
	}

	public void setEsInmuneVen(boolean esInmuneVen) {
		this.esInmuneVen = esInmuneVen;
	}

	@Override
	public String toString() {
		return "Elfo [" + super.toString() + " puntosMagia=" + puntosMagia + ", esInmuneEnf=" + esInmuneEnf
				+ ", esInmuneVen=" + esInmuneVen + "]";
	}

}
