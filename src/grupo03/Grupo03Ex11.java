package grupo03;

import java.util.Random;
import java.util.Scanner;

//41.	Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. 
//A cada tentativa dele, forneça uma dica falando se o número é maior ou menor. 
//Quando ele descobrir exiba uma mensagem de parabéns e mostre em quantas tentativas ele conseguiu.

public class Grupo03Ex11 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		int Nsorteado = aleatorio.nextInt(100) + 1;
	
		
		for(int i = 1; i <= 100; i++) {
			
			System.out.println("Digite um número entre 1 e 100 e tente descobrir qual o número sorteado");
			int x = sc.nextInt();
			
			if(x == Nsorteado){
				System.out.println("Parabéns!");
				System.out.println("Número de tentativas: " + i);	
				i = i + (101 - i);
			}
			else if(x > Nsorteado){
					System.out.println("O número sorteado é MENOR do que o número digitado");
				}
				else {
					System.out.println("O número sorteado é MAIOR do que o número digitado");
				}					
		}
		sc.close();	
	}
}