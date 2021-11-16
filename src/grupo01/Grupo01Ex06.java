package grupo01;

import java.util.Locale;
import java.util.Scanner;

//6.	Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros. 
//A área de um círculo é ¶ multiplicado pelo raio elevado ao quadrado. 
//Em Java o valor de ¶ está disponível em Math.PI   

public class Grupo01Ex06 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo:");
		double r = sc.nextDouble();
		
		double area = Math.PI * Math.pow(r, 2.0);
		
		System.out.printf("Area do circulo = %.2f m²%n", area);	
		
		sc.close();
	}	
}