package grupo03;

//32.Exiba todos os n�meros de 1 a 500, um ao lado do outro com um espa�o em branco de separa��o.

public class Grupo03Ex02 {
	
	public static void main (String [] args) {	
	
		int soma = 0;		
		
		for(int i = 1; i <= 500; i++) {			
			soma = soma + 1;
			System.out.print(soma + " ");
		}	
	}	
}