package grupo02;

import java.util.Locale;
import java.util.Scanner;

//14.	Receba do usuário o nome de um mês. Exiba o número equivalente. 
//Obs.: para comparar Strings em Java deve-se usar o método equals ou equalsIgnoreCase, 
//mas nunca o operador “==”.  Por exemplo, para comparar a variável nome com “Maria” deve-se 
//usar: if(nome.equals(“Maria”) ...


public class Grupo02Ex07 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o mes em letras minusculas:");
		String mes = sc.nextLine();	
		int numero = 0;
		
		switch (mes) {
			case "janeiro":
				numero = 1;
				System.out.println("Mes: " + numero);
				break;
			case "fevereiro":
				numero = 2;
				System.out.println("Mes: " + numero);
				break;
			case "março":
				numero = 3;
				System.out.println("Mes: " + numero);
				break;	
			case "abril":
				numero = 4;
				System.out.println("Mes: " + numero);
				break;	
			case "maio":
				numero = 5;
				System.out.println("Mes: " + numero);
				break;
			case "junho":
				numero = 6;
				System.out.println("Mes: " + numero);
				break;
			case "julho":
				numero = 7;
				System.out.println("Mes: " + numero);
				break;
			case "agosto":
				numero = 8;
				System.out.println("Mes: " + numero);
				break;	
			case "setembro":
				numero = 9;
				System.out.println("Mes: " + numero);
				break;
			case "outubro":
				numero = 10;
				System.out.println("Mes: " + numero);
				break;
			case "novembro":
				numero = 11;
				System.out.println("Mes: " + numero);
				break;
			case "dezembro":
				numero = 12;
				System.out.println("Mes: " + numero);
				break;	
			default:
				System.out.println("Mes invalido");
				break;		
		}		
		sc.close();
	}	
}