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

	public void cumpleanos() {
		edad++;
		System.out.println("Feliz Cumpleaños");
	}

}
