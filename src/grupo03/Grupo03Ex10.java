package grupo03;

import java.util.Locale;
import java.util.Scanner;

//40.	Solicite ao usu�rio a idade de cada um componente de um grupo de pessoas. 
//A quantidade de pessoas tamb�m ser� determinada por ele. 
//Ap�s o t�rmino da entrada, apresente: 
//a.	a m�dia das idades,
//b.	a maior idade,
//c.	a menor idade,
//d.	a quantidade de pessoas maior de idade.


public class Grupo03Ex10 {
	
	public static void main (String [] args) {		
			
		ClasseParaOexercicio10 classe = (ClasseParaOexercicio10) preencherValores();	
		classe.imprimirResultadosDoExercicio40();
	}

	private static Object preencherValores() {			
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero de pessoas");
		Integer quantidadeDePessoas;	
		
		Integer [] armazenagem = new Integer [quantidadeDePessoas = sc.nextInt()];		
		
		Integer idade = null;
		ClasseParaOexercicio10 classe = new ClasseParaOexercicio10(quantidadeDePessoas, idade, armazenagem);		
		
		for(int i = 0;i < quantidadeDePessoas; i++) {			
			
			System.out.println("Digite a idade de cada pessoa");
			idade = sc.nextInt();
			
			classe.setIdade(idade);			
			armazenagem [i] = classe.getIdade();			
		}		
		sc.close();		
		return classe;
	}	
}