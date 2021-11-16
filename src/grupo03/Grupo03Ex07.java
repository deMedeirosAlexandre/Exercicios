package grupo03;


import java.util.Scanner;

//37.	Calcule o fatorial de um número.

public class Grupo03Ex07 {
	
	public static void main (String [] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número para cálculo fatorial");
		int N = sc.nextInt();	
		
		sc.close();
		
		int fatorial = 1;		
		
		for(int i = N; i != 0; i--) {			
			fatorial = fatorial * i;		
		}		
		System.out.println(fatorial);
	}	
}