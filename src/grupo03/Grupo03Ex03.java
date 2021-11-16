package grupo03;

//33.	Exiba todos os números pares de 10 a 200.

public class Grupo03Ex03 {
	
	public static void main (String [] args) {	
		
		int soma = 8;		
		
		for(int i = 1; i <= 192; i++) {			
			soma = soma + 1;	
			
			if(soma % 2 == 0) {				
				System.out.print(soma + " ");	
			}		
		}	
	}	
}