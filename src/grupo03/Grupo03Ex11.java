package grupo03;

import java.util.Random;
import java.util.Scanner;

//41.	Crie um jogo para o usu�rio descobrir um n�mero sorteado de 1 a 100. 
//A cada tentativa dele, forne�a uma dica falando se o n�mero � maior ou menor. 
//Quando ele descobrir exiba uma mensagem de parab�ns e mostre em quantas tentativas ele conseguiu.

public class Grupo03Ex11 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		int Nsorteado = aleatorio.nextInt(100) + 1;
	
		
		for(int i = 1; i <= 100; i++) {
			
			System.out.println("Digite um n�mero entre 1 e 100 e tente descobrir qual o n�mero sorteado");
			int x = sc.nextInt();
			
			if(x == Nsorteado){
				System.out.println("Parab�ns!");
				System.out.println("N�mero de tentativas: " + i);	
				i = i + (101 - i);
			}
			else if(x > Nsorteado){
					System.out.println("O n�mero sorteado � MENOR do que o n�mero digitado");
				}
				else {
					System.out.println("O n�mero sorteado � MAIOR do que o n�mero digitado");
				}					
		}
		sc.close();	
	}
}