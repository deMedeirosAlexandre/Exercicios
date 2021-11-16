package grupo02;

import java.util.Locale;
import java.util.Scanner;

//17.	Acrescente no exerc�cio anterior a apresenta��o do signo do hor�scopo da pessoa. 

public class Grupo02Ex10 {
	
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
			System.out.println("Nasceu no 1� trimestre");
		}
		else if(mes == 2 && dia >= 1 && dia <= 28) {
			System.out.println("Data valida");
			System.out.println("Mes: Fevereiro");
			System.out.println("Nasceu no 1� trimestre");
		}
		else if(mes == 3 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Mar�o");
			System.out.println("Nasceu no 1� trimestre");
		}
		else if(mes == 4 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Abril");
			System.out.println("Nasceu no 2� trimestre");
		}
		else if(mes == 5 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Maio");
			System.out.println("Nasceu no 2� trimestre");
		}
		else if(mes == 6 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Junho");
			System.out.println("Nasceu no 2� trimestre");
		}
		else if(mes == 7 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Julho");
			System.out.println("Nasceu no 3� trimestre");
		}
		else if(mes == 8 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Agosto");
			System.out.println("Nasceu no 3� trimestre");
		}
		else if(mes == 9 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Setembro");
			System.out.println("Nasceu no 3� trimestre");
		}
		else if(mes == 10 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Outubro");
			System.out.println("Nasceu no 4� trimestre");
		}
		else if(mes == 11 && dia >= 1 && dia <= 30) {
			System.out.println("Data valida");
			System.out.println("Mes: Novembro");
			System.out.println("Nasceu no 4� trimestre");
		}
		else if(mes == 12 && dia >= 1 && dia <= 31) {
			System.out.println("Data valida");
			System.out.println("Mes: Dezembro");
			System.out.println("Nasceu no 4� trimestre");
		}
		else {
			System.out.println("Data invalida");
		}		
		if(mes == 3 && dia >= 21 && dia <= 31 || mes == 4 && dia >= 1 && dia <= 20 ) {
			System.out.println("Signo: �ries");
		}
		else if(mes == 4 && dia >= 21 && dia <= 30 || mes == 5 && dia >= 1 && dia <= 20) {
			System.out.println("Signo: Touro");
		}
		else if(mes == 5 && dia >= 21 && dia <= 31 || mes == 6 && dia >= 1 && dia <= 20) {
			System.out.println("Signo: G�meos");
		}
		else if(mes == 6 && dia >= 21 && dia <= 30 || mes == 7 && dia >= 1 && dia <= 22) {
			System.out.println("Signo: C�ncer");
		}
		else if(mes == 7 && dia >= 23 && dia <= 31 || mes == 8 && dia >= 1 && dia <= 22) {
			System.out.println("Signo: Le�o");
		}
		else if(mes == 8 && dia >= 23 && dia <= 31 || mes == 9 && dia >= 1 && dia <= 22) {
			System.out.println("Signo: Virgem");
		}
		else if(mes == 9 && dia >= 23 && dia <= 30 || mes == 10 && dia >= 1 && dia <= 22) {
			System.out.println("Signo: Libra");
		}
		else if(mes == 10 && dia >= 23 && dia <= 31 || mes == 11 && dia >= 1 && dia <= 21) {
			System.out.println("Signo: Escorpi�o");
		}
		else if(mes == 11 && dia >= 22 && dia <= 30 || mes == 12 && dia >= 1 && dia <= 21) {
			System.out.println("Signo: Sagit�rio");
		}
		else if(mes == 12 && dia >= 22 && dia <= 31 || mes == 1 && dia >= 1 && dia <= 20) {
			System.out.println("Signo: Capric�rnio");
		}
		else if (mes == 1 && dia >= 21 && dia <= 31 || mes == 2 && dia >= 1 && dia <= 18) {
			System.out.println("Signo: Aqu�rio");
		}
		else if (mes == 2 && dia >= 19 && dia <= 28 || mes == 3 && dia >= 1 && dia <= 20) {
			System.out.println("Signo: Peixes");
		}	
		
		sc.close();
	}	
}