package grupo02;

import java.util.Locale;
import java.util.Scanner;

//10.	Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu salário 
//liquido.  Receba o valor do salário bruto, o valor dos descontos e o valor do possível 
//empréstimo de um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.  

public class Grupo02Ex03 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: salario bruto");
		double salBrut = sc.nextDouble();	
		
		System.out.println("Digite: descontos na folha de pagamento");
		double desconto = sc.nextDouble();	
		
		System.out.println("Digite: emprestimo solicitado");
		double empSol = sc.nextDouble();
		
		
		double empMax = (salBrut - desconto) * 0.3;
		
		if(empMax < empSol) {
			System.out.println("Emprestimo nao aprovado");
		}
		else {
			System.out.printf("Emprestimo concedido%n");
		}		
		
		sc.close();
	}	
}