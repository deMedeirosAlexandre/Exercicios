package grupo03;

//32.Exiba todos os números de 1 a 500, um ao lado do outro com um espaço em branco de separação.

public class Grupo03Ex02 {
	
	public static void main (String [] args) {	
	
		int soma = 0;		
		
		for(int i = 1; i <= 500; i++) {			
			soma = soma + 1;
			System.out.print(soma + " ");
		}	
	}	
}