package grupo03;


import java.util.Scanner;

//39.	Verifique se um n�mero � perfeito, ou seja, se a soma dos seus divisores 
//(exceto o pr�prio n�mero) � igual a ele mesmo. 

public class Grupo03Ex09 {
	
	public static void main (String [] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		long N = sc.nextLong();	
		
		sc.close();
		
		long somaI = 0;
		
		for(long i = 1; i < N; i++) {			
			if(N % i == 0) {				
				somaI = somaI + i;				
			}			
		}
		if(somaI == N) {		
			System.out.println("O n�mero " + N + " � um n�mero perfeito.");		
		}
		else {
			System.out.println("O n�mero " + N + " n�o � um n�mero perfeito.");
		}		
	}	
}