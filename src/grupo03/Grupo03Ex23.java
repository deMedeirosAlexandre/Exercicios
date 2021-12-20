package grupo03;

import java.util.Locale;
import java.util.Scanner;

// 53.	Exiba a tabuada de um número fornecido pelo usuário. Por exemplo se ele digitar o número 5, 
//então será mostrado:    
//5	x	1	=	5
//5	x	2	=	10
//5	x	3	=	15
//5	x	4	=	20
//5	x	5	=	25
//5	x	6	=	30
//5	x	7	=	35
//5	x	8	=	40
//5	x	9	=	45
//5	x	10	=	50


public class Grupo03Ex23 {
	public static void main (String[] args) {
	
		
	System.out.println("Digite a tabuada que deseja calcular: ");	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Integer numeroDaTabuada = sc.nextInt();	
	sc.close();	
	
	for(int i = 1; i <= 10; i++) {
		
		Integer resultadoDaTaboada = i * numeroDaTabuada;	
		
		System.out.println(numeroDaTabuada + " x " + i + " = " + resultadoDaTaboada);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
