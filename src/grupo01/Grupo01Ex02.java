package grupo01;

import java.util.Locale;
import java.util.Scanner;

// 2.	Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha.  
// Para isto, peça o valor do seu salário e o valor do salário mínimo atual.

public class Grupo01Ex02 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: Nome do funcionario");
		String nome = sc.nextLine();
		
		System.out.println("Digite: Salario mensal");
		double sal = sc.nextDouble();
		
		System.out.println("Digite: Salario minimo vigente");
		double salMin = sc.nextDouble();
		double qtd;		
		
		qtd = Math.abs(sal/salMin);
		
		System.out.printf("O funcionario %s recebe %.2f salarios minimos%n", nome, qtd);	
		
		sc.close();
	}	
}