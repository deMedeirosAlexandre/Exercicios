package grupo03;

import java.util.Locale;
import java.util.Scanner;

//44.Modifique o problema anterior para que a quantidade de valores também seja fornecida
//pelo usuário.

public class Grupo03Ex14 {
	public static void main (String [] args) {	
		
		Scanner sc = new Scanner(System. in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite a quantidade de números a ser considerada na média");
		int numeroMedia = sc.nextInt();
		System.out.println("Digite o valor para cálculo da média");
		
		double soma = 0.0;
		double media = 0.0;
		
		for(int i = 1; i <= numeroMedia; i++) {
		
		double N = sc.nextDouble();
		
		soma = soma + N;
		media = (double) soma / i;		
		}
		sc.close();
		System.out.printf("Média = %.2f", media);		
	}
}
