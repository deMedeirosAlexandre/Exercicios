package grupo03;

import java.math.BigInteger;

//52.	A hist�ria do rei que e tornou pobre: ap�s perder uma aposta com um s�dito, ele teve que pagar uma 
//quantia muito grande em sacos de arroz. A aposta feita anteriormente era que se o s�dito ganhasse o rei teria
//que pagar um gr�o de arroz colocado na primeira casa de um tabuleiro de xadrez. Na segunda casa teria que 
//pagar o dobro, ou seja, dois gr�os de arroz, e assim sucessivamente at� a casa n�mero 64. 
//Exiba quantos gr�os de arroz este s�dito teria que ganhar, somando todas as 64 casas.  
//Depois tente exibir a quantia de sacos de arroz?

public class Grupo03Ex22 {
	
	public static void main (String[] args) {
	
		
		BigInteger quantidadeDeGrao = BigInteger.valueOf(1L);
		BigInteger divisao = BigInteger.valueOf(250000L);
		
		
	for(int i = 0; i <= 64; i++) {
		
	
		quantidadeDeGrao = quantidadeDeGrao.multiply(BigInteger.valueOf(2L));
		
		
		System.out.println(quantidadeDeGrao);
		
	}
	//A estimativa � que cada saco de 5Kg de arroz contenha em m�dia 250000 gr�os.
	quantidadeDeGrao = quantidadeDeGrao.divide(divisao);
		
	System.out.println("O rei deve ao s�dito " + quantidadeDeGrao + " sacos de arros de 5 Kg.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
