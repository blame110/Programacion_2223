package unidad22;

public class EjemploBuclesSencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		//Mientras la condicion sea cierta entrará, mostrará
		//los numeros desde 1 hasta 100
		while (num<=100)
		{
			//System.out.println(num);
			num++;
			
		}
		
		//Crear un bucle que haga una cuenta atras desde 10 hasta 0
		num=10;
		while (num>=0)
		{
			//System.out.println(num);
			num--;
		}
		//System.out.println("Despegue");
		
		//Mostrar los números pares entre 0 y 50
		num=0;
		while (num<=50)
		{
			//if (num%2==0) System.out.println(num);
			//num++;
			
			System.out.println(num);
			num=num+2;
		}
		
		//Version for del mismo problema
		for (int i=0;i<=50;i++)
		{
			if (i%2==0) System.out.println(i);
		
			
		}
		
		//Version optimizada con for
		for (int i=0;i<=50;i=i+2)
		{
			System.out.println(i);
	
		}
		
		
	}

}
