package grupo01;

import java.util.Locale;
import java.util.Scanner;

// 1.	Determine qual � a idade que o usu�rio faz no ano atual. 
//Para isso solicite o seu ano de nascimento e o ano atual. 

public class Grupo01Ex01 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: Ano de nascimento");
		int nasc = sc.nextInt();
		System.out.println("Digite: Ano atual");
		int anoAtual = sc.nextInt();
		int idade;		
		
		idade = Math.abs(anoAtual) - Math.abs(nasc);
		
		System.out.printf("O usu�rio fez %d ano(s) no ano de %d", idade, anoAtual);	
		
		sc.close();
	}	
}