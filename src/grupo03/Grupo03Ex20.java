package grupo03;

import java.util.Locale;
import java.util.Scanner;

//50.	Imprima exatamente o n-ezimo termo da seqüência de Fibonacci.

public class Grupo03Ex20 {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		long sequenciaDeFionacci = 0; 
		long sequenciaDeFionacciAnterior = 1;
		Locale.setDefault(Locale.US);		
		System.out.println("Digite o n-ézimo termo da sequência de Fibonacci");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
				
		for(int i = 1; i <= n; i++) {			
			sequenciaDeFionacci = sequenciaDeFionacci  + sequenciaDeFionacciAnterior;
			sequenciaDeFionacciAnterior = sequenciaDeFionacci - sequenciaDeFionacciAnterior;				
		}			
		System.out.println(n + "º número: " + sequenciaDeFionacci);		
	}

}
