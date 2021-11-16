package grupo01;

import java.util.Locale;
import java.util.Scanner;

//4.	Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.

public class Grupo01Ex04 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite nota 1");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite nota 2");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite nota 3");
		double nota3 = sc.nextDouble();
		
		System.out.println("Digite nota 4");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("O aluno tem %.1f de media%n", media);	
		
		sc.close();
	}	
}