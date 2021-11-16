package grupo02;

import java.util.Locale;
import java.util.Scanner;

//11.A partir da idade informada de um cidad�o diga se ele n�o pode votar (idade inferior a 16),
//ou se o voto � facultativo (idade menor ou igual a 16, ou maior ou igual a 65), 
//ou ainda se o voto � obrigat�rio.  

public class Grupo02Ex04 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: idade");
		int idade = sc.nextInt();	
				
		if(idade < 16) {
			System.out.println("Voto proibitivo");
		}
		else {
			if(idade < 18 && idade >= 16 || idade >= 65) {
			System.out.println("Voto facultativo");
			}
			else {
				if(idade >= 18 && idade < 65) {
					System.out.println("Voto obrigatorio");
				}
			}
		}		
		
		sc.close();
	}	
}