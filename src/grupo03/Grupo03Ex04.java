package grupo03;

import java.util.Random;

//34.	Exiba 50 n�meros sorteados de 1 a 100 para o usu�rio.

public class Grupo03Ex04 {
	
	public static void main (String [] args) {	
		
		
		Random aleatorio = new Random ();	
		
		for(int i = 1; i <= 50; i++) {		
			int numeroSorteado = aleatorio.nextInt(100) + 1;
			System.out.println(numeroSorteado);		
		}
	}	
}