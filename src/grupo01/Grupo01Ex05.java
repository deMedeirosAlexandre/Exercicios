package grupo01;

import java.util.Locale;
import java.util.Scanner;

//5.	Calcule e exiba o valor final de uma dívida. 
//Para isto pergunte ao usuário o valor inicial do débito,
//a quantidade de meses e os juros mensais. 
//Use o calculo de juros simples.

public class Grupo01Ex05 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial do debito:");
		double C = sc.nextDouble();
		
		System.out.println("Digite a quantidade de meses:");
		int t = sc.nextInt();
		
		System.out.println("Digite a taxa de juros mensais:");
		double i = sc.nextDouble();
		
		double J = (double) C * (i/100.0) * t;
		
		double M = C + J;
		
		System.out.printf("Valor final da divida: R$ %.2f%n", M);		
		
		sc.close();
	}	
}