package grupo03;

import java.util.Locale;
import java.util.Scanner;

//54.	Apresente uma tabela de convers�o de reais em d�lares. Ela deve ser totalmente configur�vel, 
//ou seja o usu�rio pode informar o valor inicial e final, o valor de incremento e o valor de 1 d�lar. 
//Apresente os n�meros no formato monet�rio com duas casas decimais.


public class Grupo03Ex24 {
	
	public static void main (String [] args) {
		
	System.out.println("Conversor de d�lar, digite conforme o caso:");
	System.out.println("Digite 1 para converter Real para D�lar, 2 para converter D�lar para Real");	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	Integer menu = sc.nextInt();	
	
	switch (menu) {
	case 2:
		System.out.println("Digite o valor a ser convertido: ");
		Double valorEmDolar = sc.nextDouble();
		System.out.println("Digite o valor de 1 d�lar: ");
		Double incrementoDolar = sc.nextDouble();
		Double resultadoDaConversao = valorEmDolar * incrementoDolar;
		System.out.printf("Valor convertido: R$ %.2f", resultadoDaConversao);
		break;
	case 1:
		System.out.println("Digite o valor a ser convertido: ");
		Double valorEmReal = sc.nextDouble();
		System.out.println("Digite o valor de 1 d�lar: ");
		incrementoDolar = sc.nextDouble();
		resultadoDaConversao = valorEmReal / incrementoDolar;
		System.out.printf("Valor convertido: $ %.2f", resultadoDaConversao);
		break;
	default:	
	}
	sc.close();		
	}
}
