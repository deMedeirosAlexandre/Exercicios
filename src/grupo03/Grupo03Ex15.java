package grupo03;

import java.util.Arrays;
import java.util.Scanner;

//45.	Determine o maior valor de uma lista de 100 números fornecidos 
//pelo usuário.

public class Grupo03Ex15 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System. in);
		System.out.println("Digite 100 números");
		
		int [] lista = new int [100];		
		
		for(int i = 0; i <= 99; i++) {			
			lista [i] = sc.nextInt();						
		}
		
		sc.close();		
		Arrays.sort(lista);		
		System.out.println(lista[9]);		
	}
}
