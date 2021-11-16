package grupo02;

import java.util.Locale;
import java.util.Scanner;

//13.	Acrescente no problema anterior  possibilidade dele fazer prova final em caso de
//recuperação. Neste caso a nota de aprovação passa a ser >= 5.0 

public class Grupo02Ex06 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: nota 1");
		double nota1 = sc.nextDouble();	
		
		System.out.println("Digite: nota 2");
		double nota2 = sc.nextDouble();	
		
		System.out.println("Digite: nota 3");
		double nota3 = sc.nextDouble();				
		
		double media = (Math.abs(nota1) + Math.abs(nota2) + Math.abs(nota3))/3;
		System.out.printf("Media = %.2f%n", media);
		
		if(media < 5.0) {
			System.out.println("Aluno reprovado");
		}
		else {
			if(media >= 5.0 && media < 7.0) {
			System.out.println("Aluno em recuperacao");
			System.out.println("Digite a nota da prova final:");
			double notaFim = sc.nextDouble();
			if(notaFim >= 5.0) {
				System.out.println("Aluno aprovado");
			}
			else {
				System.out.println("Aluno reprovado");
			}
			}
			else {
				if(media >= 7.0) {
					System.out.println("Aluno aprovado");
				}
			}
		}		
		
		sc.close();
	}	
}