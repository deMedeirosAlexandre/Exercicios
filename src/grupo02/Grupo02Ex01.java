package grupo02;

import java.util.Locale;
import java.util.Scanner;

//8.	Transforme um n�mero Racional (formado por numerador e denominador) para um n�mero Real. 
//Antes de dividir, verifique se o denominador � diferente de zero. 
//Emita uma mensagem de alerta ao usu�rio se for zero.  

public class Grupo02Ex01 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numerador:");
		int numerador = sc.nextInt();
		
		System.out.println("Digite o denominador:");
		int denominador = sc.nextInt();
		
		
		if(denominador == 0) {
			System.out.println("Denominador igual a zero, impossivel dividir");
		}
		else {
			double real = (double) numerador / denominador;
			System.out.printf("Numero real = %.3f%n", real);	
			
		}
		
		sc.close();
	}	
}