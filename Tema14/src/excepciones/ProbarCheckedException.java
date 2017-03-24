package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarCheckedException {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Ruta fichero: ");
		String ruta = teclado.nextLine();
		FileWriter fichero = null;
		
		try 
		{
			fichero = abrirFichero(ruta);
			
			System.out.printf("Texto a escribir: ");
			String texto = teclado.nextLine();	
		
			fichero.write(texto);
			
		} 
		catch (IOException e) 
		{
			System.out.printf("El fichero no ha sido abierto\n");
		}		
		
		try 
		{
			fichero.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.printf("El fichero no ha sido cerrado\n");
		}
	}
	
	public static FileWriter abrirFichero (String ruta) throws java.io.IOException
	{
		return new FileWriter(ruta);
	}
}
