package grupo02;

import java.util.Locale;
import java.util.Scanner;

//12.	A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, 
//ficou de recuperação ou foi reprovado. A média de aprovação é >= 7.0; a média de 
//recuperação é >= 5.0 e < 7.0; e a média do reprovado é < 5.0  

public class Grupo02Ex05 {
	
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