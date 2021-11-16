package grupo02;

import java.util.Locale;
import java.util.Scanner;

//22.	Verifique se duas datas de aniversário (dia e mês) são iguais.


public class Grupo02Ex15 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira data de aniversário no formato: dia mês");
		int dia1 = sc.nextInt();
		int mes1 = sc.nextInt();
				
		System.out.println("Digite a segunda data de aniversário no formato: dia mês");
		int dia2 = sc.nextInt();
		int mes2 = sc.nextInt();
		
		
		if(dia1 == dia2 && mes1 == mes2) {
			System.out.println("Datas de aniversário iguais.");
		}	
		else {
			System.out.println("Datas de aniversário diferentes.");
		}
		
		sc.close();
	}	
}