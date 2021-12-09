package grupo03;

import java.util.Locale;
import java.util.Scanner;

//48.	Descida se um aluno será aprovado, reprovado por nota ou reprovado por faltas. 
//Use o sistema de avaliação da FAESA. Pergunte ao usuário a quantidade de notas para cálculo da média semestral, 
//sendo que todas elas possuem o mesmo peso. 

public class Grupo03Ex18 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de aulas no semestre vigente: ");
		int quantidadeDeAulasNoSemestre = sc.nextInt();
		
		System.out.println("Digite a quantidade de faltas no semestre: ");
		int quantidadeDeFaltas = sc.nextInt();
		
		double toleranciaDeFaltas = (double) quantidadeDeAulasNoSemestre * 0.25;
		
		if(quantidadeDeFaltas > toleranciaDeFaltas) {
			
			System.out.println("Reprovado por faltas");			
		}
		else {			
			double somaDasNotasSemestrais = 0;
			double mediaSemestral = 0;
			
			System.out.println("Digite a quantidade de notas para avaliação do semestre: ");
			int quantidadeDeNotasNoSemestre = sc.nextInt();
			
			for(int i = 1; i <= quantidadeDeNotasNoSemestre; i++) {
				
				System.out.println("Digite a " + i + "ª nota para o cálculo da média");
				double nota = sc.nextDouble();
				
				somaDasNotasSemestrais += nota; 
				
				mediaSemestral = somaDasNotasSemestrais / i;
			}			
			sc.close();
			
			System.out.println("Média Semestral: " + mediaSemestral);
			
			if(mediaSemestral < 5.0) {
				System.out.println("Aluno reprovado!");
			}
			else {
				System.out.println("Aluno aprovado!");
			}			
		}		
	}
}
