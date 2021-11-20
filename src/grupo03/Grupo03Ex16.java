package grupo03;

import java.util.Scanner;

//46.	Determine a quantidade de homens e mulheres (separadamente) 
//que são maiores de idade, baseado numa lista de 200 pessoas.

public class Grupo03Ex16 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][]  listaHomensEmulheres = new int [2][100];
		int somaHomens = 0;
		int somaMulheres = 0;
		
		System.out.println("Digite idade dos homens e em seguida a idade das mulheres:");
		
		for(int i = 0; i <= 1; i++) {			
			
			for(int j = 0; j <= 99; j++) {				
				listaHomensEmulheres[i][j] = sc.nextInt();								
			}			
		}
		
		for(int i = 0; i < 1; i++) {			
			
			for(int j = 0; j <= 99; j++) {				
				if(listaHomensEmulheres[i][j] >= 18) {
					somaHomens = somaHomens + 1;
				}			
			}		
		}
		
		for(int i = 1; i <= 1; i++) {			
		
			for(int j = 0; j <= 99; j++) {		
				if(listaHomensEmulheres[i][j] >= 18) {
					somaMulheres = somaMulheres + 1;
				}		
			}
		}		
		sc.close();
		System.out.println("Quantidade de homens com 18 anos ou mais: " + somaHomens);
		System.out.println("Quantidade de mulheres com 18 anos ou mais: " + somaMulheres);		
	}
}