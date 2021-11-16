package grupo03;


import java.util.Scanner;

//38.	Verifique se um número é primo ou não.

public class Grupo03Ex08 {
	
	public static void main (String [] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int N = sc.nextInt();	
		
		sc.close();
		
		int soma = 0;
		
		for(int i = 1; i <= N; i++) {			
			if(N % i == 0) {
				soma = soma + 1;				
			}			
		}
		if(soma == 2) {		
			System.out.println("O número " + N + " é um número primo.");		
		}
		else {
			System.out.println("O número " + N + " não é um número primo.");
		}		
	}	
}