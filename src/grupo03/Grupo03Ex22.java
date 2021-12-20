package grupo03;

import java.math.BigInteger;

//52.	A história do rei que e tornou pobre: após perder uma aposta com um súdito, ele teve que pagar uma 
//quantia muito grande em sacos de arroz. A aposta feita anteriormente era que se o súdito ganhasse o rei teria
//que pagar um grão de arroz colocado na primeira casa de um tabuleiro de xadrez. Na segunda casa teria que 
//pagar o dobro, ou seja, dois grãos de arroz, e assim sucessivamente até a casa número 64. 
//Exiba quantos grãos de arroz este súdito teria que ganhar, somando todas as 64 casas.  
//Depois tente exibir a quantia de sacos de arroz?

public class Grupo03Ex22 {
	
	public static void main (String[] args) {
	
		
		BigInteger quantidadeDeGrao = BigInteger.valueOf(1L);
		BigInteger divisao = BigInteger.valueOf(250000L);
		
		
	for(int i = 0; i <= 64; i++) {
		
	
		quantidadeDeGrao = quantidadeDeGrao.multiply(BigInteger.valueOf(2L));
		
		
		System.out.println(quantidadeDeGrao);
		
	}
	//A estimativa é que cada saco de 5Kg de arroz contenha em média 250000 grãos.
	quantidadeDeGrao = quantidadeDeGrao.divide(divisao);
		
	System.out.println("O rei deve ao súdito " + quantidadeDeGrao + " sacos de arros de 5 Kg.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
