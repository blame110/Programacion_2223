package unidad3;

public class EjemploRecursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;

		int listaNumeros[] = { 2, 45, 5, 78, 23, 12, 16 };
		int fact = FuncionesRecursivas.factorialR(x);

		// System.out.println(fact);

		// FuncionesRecursivas.divisoresR(100, 100);
		// FuncionesRecursivas.divisoresI(100);

		// FuncionesRecursivas.listarParesR(23);

		// llamamos a buscarValorR pasandole el número a buscar, la lista
		// donde buscar y el valor inicial de busqueda, 0
		if (FuncionesRecursivas.buscarValorR(200, listaNumeros, 0))
			System.out.println("El valor esta en la lista");
		else
			System.out.println("El valor no esta en la lista");

	}

}
