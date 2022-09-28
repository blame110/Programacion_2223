package unidad1;

public class Ejemplo2ConversionDatos 
{
	
	public static void main(String args[]) 
	{
		
		float grande= 12312f;
		int pequeno, edadNum;
		String edad = "46";
		
		pequeno = (int) grande;
		
		//Conversión de texto string a numerico se hace utilizando 
		//la función valueof() del objeto numerico
		edadNum = Integer.valueOf(edad);
		
		System.out.println(pequeno);
		
		System.out.println(edadNum);
		
	}
}
