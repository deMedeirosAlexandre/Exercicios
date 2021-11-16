package grupo02;

import java.util.Locale;
import java.util.Scanner;

//15.	Verifique a validade de uma data de aniversário (solicite apenas o número do dia e do mês).  
//Além de falar se a data está ok, informe também o nome do mês.
//Dica: meses com 30 dias: abril, junho, setembro e novembro.



public class Grupo02Ex08 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia:");
		int dia = sc.nextInt();	
		
		System.out.println("Digite o numero do mes:");
		int mes = sc.nextInt();	
		
		if(dia < 1 || dia > 31 || mes < 1 || mes > 12) {
			System.out.println("Data invalida");
		}
		else if(mes == 1 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Janeiro");
		}
		else if(mes == 2 && dia >= 1 && dia <= 28) {
			System.out.println("Data valida");
			System.out.println("Mes: Fevereiro");
		}
		else if(mes == 3 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Março");
		}
		else if(mes == 4 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Abril");
		}
		else if(mes == 5 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Maio");
		}
		else if(mes == 6 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Junho");
		}
		else if(mes == 7 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Julho");
		}
		else if(mes == 8 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Agosto");
		}
		else if(mes == 9 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Setembro");
		}
		else if(mes == 10 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Outubro");
		}
		else if(mes == 11 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Novembro");
		}
		else if(mes == 12 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Dezembro");
		}
		else {
			System.out.println("Data invalida");
		}
		
		sc.close();
	}	
}