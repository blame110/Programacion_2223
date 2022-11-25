package unidad3;

public class EjemploUtilizacionObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String direccion = "calle";

		// Definimos un objeto denominado javi de la clase Persona
		// Para poder utilizar un objeto hay que crearlo
		// Lo creamos utilizando new y el nombre de la clase
		Persona javi = new Persona();

		// Para acceder a los atributos de un objeto se utiliza el .
		javi.nombre = "Javier";

		// javi.edad = 23;
		// llamamos a la funcion setEdad pasandole el valor 23
		// La funcion asigna el valor 23 a el atributo de javi edad
		javi.setEdad(23);

		// A las variables privadas no se puede acceder desde fuera de la clase
		// javi.sexo = 'M';
		// javi.altura = 1.85f;
		// javi.direccion = "calle paloma";

		System.out.println("Tu edad es de " + javi.edad);

		javi.cumpleanos();

		System.out.println("Tu edad es de " + javi.edad);

	}

}
