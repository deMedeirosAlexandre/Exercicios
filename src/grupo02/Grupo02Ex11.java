package grupo02;

import java.util.Locale;
import java.util.Scanner;

//18.	Inclua no exercício anterior a solicitação do ano de nascimento e também da data de hoje.
//A partir destas informações, apresente a idade atual desta pessoa. 

public class Grupo02Ex11 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia de nascimento:");
		int dia = sc.nextInt();	
		
		System.out.println("Digite o numero do mes de nascimento:");
		int mes = sc.nextInt();	
		
		System.out.println("Digite o ano de nascimento:");
		int ano = sc.nextInt();	
		
		System.out.println("Digite a data de hoje no formato: dia mes ano ");
		int diaAtual = sc.nextInt();	
		int mesAtual = sc.nextInt();
		int anoAtual = sc.nextInt();
		
		int idade = anoAtual - ano;
		
		if (mes > mesAtual) {
			idade = idade -1;
		}
		else if (mes == mesAtual && dia > diaAtual) {
			idade = idade -1;
		}
		System.out.println("Idade: " + idade);		
		
		if(dia < 1 || dia > 31 || mes < 1 || mes > 12) {
			System.out.println("Data invalida");
		}
		else if(mes == 1 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Janeiro");
			System.out.println("Nasceu no 1° trimestre");
		}
		else if(mes == 2 && dia >= 1 && dia <= 28) {
			System.out.println("Data valida");
			System.out.println("Mes: Fevereiro");
			System.out.println("Nasceu no 1° trimestre");
		}
		else if(mes == 3 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Março");
			System.out.println("Nasceu no 1° trimestre");
		}
		else if(mes == 4 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Abril");
			System.out.println("Nasceu no 2° trimestre");
		}
		else if(mes == 5 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Maio");
			System.out.println("Nasceu no 2° trimestre");
		}
		else if(mes == 6 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Junho");
			System.out.println("Nasceu no 2° trimestre");
		}
		else if(mes == 7 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Julho");
			System.out.println("Nasceu no 3° trimestre");
		}
		else if(mes == 8 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Agosto");
			System.out.println("Nasceu no 3° trimestre");
		}
		else if(mes == 9 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Setembro");
			System.out.println("Nasceu no 3° trimestre");
		}
		else if(mes == 10 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Outubro");
			System.out.println("Nasceu no 4° trimestre");
		}
		else if(mes == 11 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Novembro");
			System.out.println("Nasceu no 4° trimestre");
		}
		else if(mes == 12 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Dezembro");
			System.out.println("Nasceu no 4° trimestre");
		}
		else {
			System.out.println("Data invalida");
		}		
		if(mes == 3 && dia >= 21 && dia <= 31 || mes == 4 && dia >= 1 && dia <= 20 ) {
			System.out.println("Signo: Áries");
		}
		else if(mes == 4 && dia >= 21 && dia <= 30 || mes == 5 && dia >= 1 && dia <= 20) {
			System.out.println("Signo: Touro");
		}
		else if(mes == 5 && dia >= 21 && dia <= 31 || mes == 6 && dia >= 1 && dia <= 20) {
			System.out.println("Signo: Gêmeos");
		}
		else if(mes == 6 && dia >= 21 && dia <= 30 || mes == 7 && dia >= 1 && dia <= 22) {
			System.out.println("Signo: Câncer");
		}
		else if(mes == 7 && dia >= 23 && dia <= 31 || mes == 8 && dia >= 1 && dia <= 22) {
			System.out.println("Signo: Leão");
		}
		else if(mes == 8 && dia >= 23 && dia <= 31 || mes == 9 && dia >= 1 && dia <= 22) {
			System.out.println("Signo: Virgem");
		}
		else if(mes == 9 && dia >= 23 && dia <= 30 || mes == 10 && dia >= 1 && dia <= 22) {
			System.out.println("Signo: Libra");
		}
		else if(mes == 10 && dia >= 23 && dia <= 31 || mes == 11 && dia >= 1 && dia <= 21) {
			System.out.println("Signo: Escorpião");
		}
		else if(mes == 11 && dia >= 22 && dia <= 30 || mes == 12 && dia >= 1 && dia <= 21) {
			System.out.println("Signo: Sagitário");
		}
		else if(mes == 12 && dia >= 22 && dia <= 31 || mes == 1 && dia >= 1 && dia <= 20) {
			System.out.println("Signo: Capricórnio");
		}
		else if (mes == 1 && dia >= 21 && dia <= 31 || mes == 2 && dia >= 1 && dia <= 18) {
			System.out.println("Signo: Aquário");
		}
		else if (mes == 2 && dia >= 19 && dia <= 28 || mes == 3 && dia >= 1 && dia <= 20) {
			System.out.println("Signo: Peixes");
		}	
		
		sc.close();
	}	
}