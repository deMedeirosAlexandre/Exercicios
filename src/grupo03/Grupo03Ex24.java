package grupo03;

import java.util.Locale;
import java.util.Scanner;

//54.	Apresente uma tabela de conversão de reais em dólares. Ela deve ser totalmente configurável, 
//ou seja o usuário pode informar o valor inicial e final, o valor de incremento e o valor de 1 dólar. 
//Apresente os números no formato monetário com duas casas decimais.


public class Grupo03Ex24 {
	
	public static void main (String [] args) {
		
	System.out.println("Conversor de dólar, digite conforme o caso:");
	System.out.println("Digite 1 para converter Real para Dólar, 2 para converter Dólar para Real");	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	Integer menu = sc.nextInt();	
	
	switch (menu) {
	case 2:
		System.out.println("Digite o valor a ser convertido: ");
		Double valorEmDolar = sc.nextDouble();
		System.out.println("Digite o valor de 1 dólar: ");
		Double incrementoDolar = sc.nextDouble();
		Double resultadoDaConversao = valorEmDolar * incrementoDolar;
		System.out.printf("Valor convertido: R$ %.2f", resultadoDaConversao);
		break;
	case 1:
		System.out.println("Digite o valor a ser convertido: ");
		Double valorEmReal = sc.nextDouble();
		System.out.println("Digite o valor de 1 dólar: ");
		incrementoDolar = sc.nextDouble();
		resultadoDaConversao = valorEmReal / incrementoDolar;
		System.out.printf("Valor convertido: $ %.2f", resultadoDaConversao);
		break;
	default:	
	}
	sc.close();		
	}
}
