package excepciones;

import java.util.Scanner;

public class ProbarMiExcepcion 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Teclea un nombre: ");
		String nombre = teclado.nextLine();
		if(nombre.toUpperCase().equals("PEPE"))
		{
			try
			{
				throw new ExceptionPepe();
			} catch (ExceptionPepe e)
			{
				e.printStackTrace();
			}
		}
		else
		{

			System.out.printf("El nombre es %s\n",nombre);
		}
	}
}
