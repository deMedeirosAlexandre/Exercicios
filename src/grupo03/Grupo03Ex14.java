package grupo03;

import java.util.Locale;
import java.util.Scanner;

//44.Modifique o problema anterior para que a quantidade de valores tamb�m seja fornecida
//pelo usu�rio.

public class Grupo03Ex14 {
	public static void main (String [] args) {	
		
		Scanner sc = new Scanner(System. in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite a quantidade de n�meros a ser considerada na m�dia");
		int numeroMedia = sc.nextInt();
		System.out.println("Digite o valor para c�lculo da m�dia");
		
		double soma = 0.0;
		double media = 0.0;
		
		for(int i = 1; i <= numeroMedia; i++) {
		
		double N = sc.nextDouble();
		
		soma = soma + N;
		media = (double) soma / i;		
		}
		sc.close();
		System.out.printf("M�dia = %.2f", media);		
	}
}
