package grupo01;

import java.util.Locale;
import java.util.Scanner;

//7.	Calcule e exiba a comiss�o de 10% de um gar�om num restaurante a partir do valor
//da despesa de um cliente.   

public class Grupo01Ex07 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a despesa do cliente:");
		double despesa = sc.nextDouble();
		
		double comissao = despesa * 0.1;
		
		System.out.printf("Comissao = R$ %.2f%n", comissao);	
		
		sc.close();
	}	
}