package grupo03;

import java.util.Locale;
import java.util.Scanner;

//43.	Calcule a m�dia aritm�tica de 500 valores fornecidos pelo usu�rio.

public class Grupo03Ex13 {
	public static void main (String [] args) {
	
		Scanner sc = new Scanner(System. in);
		Locale.setDefault(Locale.US);
		
		double soma = 0.0;
		double media = 0.0;
		
		for(int i = 1; i <= 500; i++) {
		
		double N = sc.nextDouble();
		
		soma = soma + N;
		media = (double) soma / i;		
		}
		sc.close();
		System.out.printf("M�dia = %.2f", media);	
	}
}
