package grupo03;

import java.util.Locale;
import java.util.Scanner;

//51.	Exiba os n primeiros termos da seq��ncia de Tribonacci (soma dos tr�s anteriores). Inicia com 1,1 e 2.

public class Grupo03Ex21 {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		long sequenciaDeTribonacci;
		long a = 1;
		long b = 1;
		long c = 2;
		
		Locale.setDefault(Locale.US);		
		System.out.println("Digite o n-�zimo termo da sequ�ncia de Fibonacci");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n == 1) {
		System.out.println("1� n�mero: " + a);
		}
		else if(n == 2) {
		System.out.println("1� n�mero: " + a);
		System.out.println("2� n�mero: " + b);
		}
		else {
		System.out.println("1� n�mero: " + a);
		System.out.println("2� n�mero: " + b);	
		System.out.println("3� n�mero: " + c);
		}
		
		for(int i = 4; i <= n; i++) {		
			sequenciaDeTribonacci = a + b + c;
			a = b;
			b = c;
			c = sequenciaDeTribonacci;			
			System.out.println(i + "� n�mero: " + sequenciaDeTribonacci);
		}				
	}
}