package grupo02;

import java.util.Locale;
import java.util.Scanner;

//20.	Solicite o nome e a idade de duas pessoas. Em seguida exiba o nome da pessoa mais velha
//e o nome da pessoa mais nova.

public class Grupo02Ex13 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da primeira pessoa:");
		String nome1 = sc.nextLine();
		
		System.out.println("Digite a idade da primeira pessoa:");
		int x1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Digite o nome da segunda pessoa:");
		String nome2 = sc.nextLine();
				
		System.out.println("Digite a idade da segunda pessoa:");
		int x2 = sc.nextInt();	
		
		String p1;
		String p2;			
		
		if(x1 > x2) {
			p1 = nome1;
			p2 = nome2;
		}
		else {
			p1 = nome2;
			p2 = nome1;			
		}
		
		System.out.println(p1 + " , " + p2);	
	
		sc.close();
	}	
}