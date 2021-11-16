package grupo01;

import java.util.Locale;
import java.util.Scanner;

//6.	Calcule e exiba �rea ocupada por um c�rculo cujo raio mede 5 metros. 
//A �rea de um c�rculo � � multiplicado pelo raio elevado ao quadrado. 
//Em Java o valor de � est� dispon�vel em Math.PI   

public class Grupo01Ex06 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo:");
		double r = sc.nextDouble();
		
		double area = Math.PI * Math.pow(r, 2.0);
		
		System.out.printf("Area do circulo = %.2f m�%n", area);	
		
		sc.close();
	}	
}