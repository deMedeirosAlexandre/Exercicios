package grupo02;

import java.util.Locale;
import java.util.Scanner;

//22.	Verifique se duas datas de anivers�rio (dia e m�s) s�o iguais.


public class Grupo02Ex15 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira data de anivers�rio no formato: dia m�s");
		int dia1 = sc.nextInt();
		int mes1 = sc.nextInt();
				
		System.out.println("Digite a segunda data de anivers�rio no formato: dia m�s");
		int dia2 = sc.nextInt();
		int mes2 = sc.nextInt();
		
		
		if(dia1 == dia2 && mes1 == mes2) {
			System.out.println("Datas de anivers�rio iguais.");
		}	
		else {
			System.out.println("Datas de anivers�rio diferentes.");
		}
		
		sc.close();
	}	
}