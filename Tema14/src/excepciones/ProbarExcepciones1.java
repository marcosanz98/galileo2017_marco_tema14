package excepciones;

import java.util.Scanner;

public class ProbarExcepciones1 {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int iNumero=0, doble=0;
		int numeros[] = new int[10];
		boolean error;
		
		do
		{
			error=false;
			
			System.out.printf("Teclea un numero: ");
			try
			{
				String sNumero = teclado.nextLine();
				numeros[10] = Integer.parseInt(sNumero);
				iNumero = numeros[10];
				doble = 2 * iNumero;
			}
			catch (NumberFormatException e) 
			{
				System.out.printf("Error, no ha tecleado un numero\n");
				error = true;
			}
			catch (IndexOutOfBoundsException e) 
			{
				System.out.printf("Error, indice de array incorrecto\n");
			}
		}while(error);
		
		System.out.printf("El doble de %d es %d\n",iNumero,doble);

	}

}
