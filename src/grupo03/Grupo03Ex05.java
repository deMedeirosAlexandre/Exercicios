package grupo03;

import java.util.Random;
import java.util.Scanner;

//35.	Exiba uma quantidade de n�meros sorteados determinada pelo usu�rio. 
// Pe�a tamb�m que o usu�rio determine a faixa do sorteio. 

public class Grupo03Ex05 {
	
	public static void main (String [] args) {		
		
		Scanner sc = new Scanner(System.in);			
		Random aleatorio = new Random ();	
		
		System.out.println("Digite a quantidade de n�meros sorteados");
		int N = sc.nextInt();
		
		System.out.println("Digite a faixa de n�meros sorteados");
		System.out.println("Primeiro n�mero");
		int primeiro = sc.nextInt();
		
		System.out.println("Segundo n�mero");
		int segundo= sc.nextInt();
		
		sc.close();
		
		int N1, N2;
		
		
		if(primeiro > segundo) {
			N1 = primeiro;
			N2 = segundo;
		}
		else {
			N1 = segundo;
			N2 = primeiro;
		}
		
		for(int i = 1; i <= N; i++) {			
			int numeroSorteado = aleatorio.nextInt(N1 - N2) + N2;
			System.out.println(numeroSorteado);				
		}
	}	
}