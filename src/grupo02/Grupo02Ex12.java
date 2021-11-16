package grupo02;

import java.util.Locale;
import java.util.Scanner;

//19.	Exiba dois números fornecidos pelo usuário em ordem crescente. 

public class Grupo02Ex12 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		double x1 = sc.nextDouble();	
		
		System.out.println("Digite o segundo numero:");
		double x2 = sc.nextDouble();		
		
		double n1;
		double n2;		
		
		if(x1 > x2) {
			n1 = x1;
			n2 = x2;
		}
		else {
			n1 = x2;
			n2 = x1;			
		}
		
		System.out.println(n1 + " , " + n2);	
	
		sc.close();
	}	
}