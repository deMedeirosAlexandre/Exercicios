package grupo02;

import java.util.Locale;
import java.util.Scanner;

//9.	Verifique se o usuário é maior de idade ou não.

public class Grupo02Ex02 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: idade do usuario");
		int idade = sc.nextInt();	
				
		if(idade < 18) {
			System.out.println("Usuario menor de idade");
		}
		else {			
			System.out.println("Usuario maior de idade");				
		}		
		sc.close();
	}	
}