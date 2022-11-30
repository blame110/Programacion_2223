package unidad3;

/**
 * Clase persona que guarda los datos de las personas y hace + cosas
 * 
 * @author pmpin
 * 
 *
 */
public class Persona {

	// Variables miembro de la clase
	public String nombre;
	private int edad;
	private char sexo;
	private float altura;
	private String direccion;
	// Al hacer estatica una variable miembro de una clase
	// todos los objetos de dicha clase comparten el mismo valor
	private static int contador;

	/**
	 * Al código de este constructor se le llama cuando se cree un objeto utilizando
	 * new Persona()
	 */
	Persona() {

		this.nombre = "Carlos";
		this.edad = (int) (Math.random() * 100);
		this.sexo = (Math.random() > 0.5 ? 'M' : 'F');
		this.altura = (float) (Math.random() * 2.5);
		this.direccion = "Mi casa";
		// Incrementamos el numero de personas
		contador++;
	}

	/**
	 * Constructor que recibe los datos de la persona y se los asigna a las
	 * variables miembro
	 * 
	 * @param nombreRec
	 * @param edadRec
	 * @param sexoRec
	 * @param alturaRec
	 * @param dirRec
	 */
	Persona(String nombreRec, int edadRec, char sexoRec, float alturaRec, String dirRec) {
		this.nombre = nombreRec;
		this.edad = edadRec;
		this.sexo = sexoRec;
		this.altura = alturaRec;
		this.direccion = dirRec;
		contador++;
	}

	/**
	 * Devuelve el valor de la variable miembro de la clase edad
	 * 
	 * @return edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edadNueva) {
		edad = edadNueva;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public static int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public void cumpleanos() {
		edad++;
		System.out.println("Feliz Cumpleaños");
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", altura=" + altura + ", direccion="
				+ direccion + "]";
	}

}
