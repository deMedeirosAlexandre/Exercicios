package grupo01;

import java.util.Locale;
import java.util.Scanner;

// 3.	Solicite a quantidade de homens e de mulheres de uma turma da faculdade. 
// Em seguida calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.

public class Grupo01Ex03 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: Quantidade de homens na sala de aula");
		int homens = sc.nextInt();
		System.out.println("Digite: Quantidade de mulheres na sala de aula");
		int mulheres = sc.nextInt();
		
		int total = homens + mulheres;
		
		double phomens = (double) (homens * 100) / total;
		
		double pmulheres = (double) Math.abs(phomens - 100);
		
		System.out.printf("Percentual de homens na sala: %.2f%%%n", phomens);
		System.out.printf("Percentual de mulheres na sala: %.2f%%%n", pmulheres);	
		
		sc.close();
	}	
}