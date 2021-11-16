package grupo03;

import java.util.Scanner;

//40.	Solicite ao usuário a idade de cada um componente de um grupo de pessoas. 
//A quantidade de pessoas também será determinada por ele. 
//Após o término da entrada, apresente: 
//a.	a média das idades,
//b.	a maior idade,
//c.	a menor idade,
//d.	a quantidade de pessoas maior de idade.


public class Grupo03Ex10 {
	
	public static void main (String [] args) {		
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um número de pessoas");
		int N = sc.nextInt();	
		System.out.println("Digite a idade de cada pessoa");
		int[] idade = new int [N];
		int soma = 0;
		int mediaIdade = 0;
		int maior = 0;
		int menor = 0;
		int maiorDeIdade = 0;
				
		for(int i = 0; i < N; i++) {
			idade[i] = sc.nextInt();
			
			soma = soma  + idade [i];
			mediaIdade = soma / N;			
			
			if (idade [i] >= maior) {				
				maior = idade [i];
			}
			if(idade [i] <= idade[0]) {				
				menor = idade [i];
			}			
			if(idade[i] > 18) {
				maiorDeIdade = maiorDeIdade + 1;
			}			
		}		
		sc.close();		
		System.out.println("Média das idades: " + mediaIdade);
		System.out.println("Maior idade: " + maior);
		System.out.println("Menor idade: " + menor);
		System.out.println("Pessoas com mais de 18 anos: " + maiorDeIdade);			
	}	
}