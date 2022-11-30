package unidad3;

import utilidades.Validaciones;

public class EjemploUtilizacionObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String direccion = "calle";

		// Definimos un objeto denominado javi de la clase Persona
		// Para poder utilizar un objeto hay que crearlo
		// Lo creamos utilizando new y el nombre de la clase
		Persona javi = new Persona();
		Persona carlos = new Persona();
		Persona juanjo = new Persona("Juan José", 18, 'M', 1.76f, "Su casa");

		Validaciones val = new Validaciones();

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

		System.out.println("Tu edad es de " + javi.getEdad());

		javi.cumpleanos();

		System.out.println("Tu edad es de " + javi.getEdad());

		// Mostramos los valores de los atributos del objeto carlos
		System.out.println(carlos);

		System.out.println(juanjo);

		String password = "Alumno_aaaa";

		if (Validaciones.validPassword(password))
			System.out.println("El password es valido");
		else
			System.out.println("El password no cumple los requisitos");

		System.out.println("Hay " + Persona.getContador() + " Personas Creadas");

	}

}
