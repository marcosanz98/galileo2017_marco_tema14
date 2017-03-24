package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarCheckedException2{
	public static void main(String[] args) throws IOException{
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Ruta fichero: ");
		String ruta = teclado.nextLine();
		FileWriter fichero = null;
		
		fichero = abrirFichero(ruta);
			
		System.out.printf("Texto a escribir: ");
		String texto = teclado.nextLine();	
		
		fichero.write(texto);
		
		
		fichero.close();
		
	}
	
	public static FileWriter abrirFichero (String ruta) throws java.io.IOException
	{
		return new FileWriter(ruta);
	}
}
