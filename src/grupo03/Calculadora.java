package grupo03;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	
	public static void main (String[] args) {		
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Digite o primeiro n�mero + space + o operador matem�tico(+,-,* ou /) e em seguida o segundo n�mero");
		
		
		
		
		Integer primeiroNumero = sc.nextInt();
		//operacoesDeCalculo.setPrimeiroNumero(primeiroNumero);
		String operador = sc.next();
		// operacoesDeCalculo.setOperador(operador);
		Integer segundoNumero = sc.nextInt();
		//operacoesDeCalculo.setSegundoNumero(segundoNumero);
		sc.close();		
		
		OperacoesDeCalculo operacoesDeCalculo = new OperacoesDeCalculo(primeiroNumero,segundoNumero, operador);
		
		
		operacoesDeCalculo.imprimirResultado();		
	}		
}