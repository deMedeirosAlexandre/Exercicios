package grupo03;


import java.util.Scanner;

//38.	Verifique se um n�mero � primo ou n�o.

public class Grupo03Ex08 {
	
	public static void main (String [] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int N = sc.nextInt();	
		
		sc.close();
		
		int soma = 0;
		
		for(int i = 1; i <= N; i++) {			
			if(N % i == 0) {
				soma = soma + 1;				
			}			
		}
		if(soma == 2) {		
			System.out.println("O n�mero " + N + " � um n�mero primo.");		
		}
		else {
			System.out.println("O n�mero " + N + " n�o � um n�mero primo.");
		}		
	}	
}