package grupo03;


import java.util.Scanner;

//39.	Verifique se um número é perfeito, ou seja, se a soma dos seus divisores 
//(exceto o próprio número) é igual a ele mesmo. 

public class Grupo03Ex09 {
	
	public static void main (String [] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		long N = sc.nextLong();	
		
		sc.close();
		
		long somaI = 0;
		
		for(long i = 1; i < N; i++) {			
			if(N % i == 0) {				
				somaI = somaI + i;				
			}			
		}
		if(somaI == N) {		
			System.out.println("O número " + N + " é um número perfeito.");		
		}
		else {
			System.out.println("O número " + N + " não é um número perfeito.");
		}		
	}	
}