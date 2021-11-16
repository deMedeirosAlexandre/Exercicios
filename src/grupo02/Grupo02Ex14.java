package grupo02;

import java.util.Locale;
import java.util.Scanner;

//21.	Exiba o valor do empréstimo possível para um funcionário de uma empresa.
//Sabe-se:
//Cargo	% do salário
//Diretoria	30%
//Gerência	25%
//Operacional	20%


public class Grupo02Ex14 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qual o setor em que trabalha em letras minusculas e sem acento");
		String setor = sc.nextLine();
		
		System.out.println("Digite: salario");
		double sal = sc.nextInt();
		
		double porcent = 0;
		
		switch (setor) {
		case "diretoria":
			porcent = 30.0/100.0;
			break;
		case "gerencia":
			porcent = 25.0/100.0;
			break;
		case "operacional":
			porcent = 20.0/100.0;		
			break;
		default:
			System.out.println("Setor inválido, reinicie o programa");
			break;
		}
		
		double emprest = sal * porcent;
		
		if (emprest > 0) {	
			System.out.printf("Emprestimo aprovado no valor de R$ %.2f%n", emprest);
		}
		else if (emprest < 0){
			System.out.println("Salario inválido, reinicie o programa");
		}	
		sc.close();
	}	
}