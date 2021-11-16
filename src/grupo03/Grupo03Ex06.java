package grupo03;

import java.util.Locale;
import java.util.Scanner;

//36.	Exiba todos os números ímpares existentes entre dois números informados pelo usuário. 
//Dica: use o operador % para calcular o resto da divisão entre dois números. 

public class Grupo03Ex06 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");		
		int N1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero");		
		int N2 = sc.nextInt();
		
		int numeroMaior, numeroMenor;
		
		if(N1 > N2) {
			numeroMaior = N1;
			numeroMenor = N2;			
		}
		else {
			numeroMaior = N2;
			numeroMenor = N1;	
		}
		
		for(int i = 1; i <= numeroMaior; i++) {
			numeroMenor = numeroMenor + 1;
			
			if(numeroMenor % 2 != 0 && numeroMenor <= numeroMaior) {
				System.out.print(numeroMenor + " ");
			}			
		}	
		sc.close();
	}	
}