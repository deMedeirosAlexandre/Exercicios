package grupo03;

import java.util.Locale;
import java.util.Scanner;

//55.	A operadora de celular Vai-Vai possui um plano com o valor mensal de 50,00 que permite 100 minutos 
//por m�s para qualquer n�mero. Al�m disso, ela oferece 50 minutos a mais para liga��es destinadas a um n�mero 
//da pr�pria Vai-Vai. Ainda neste plano ela tem uma promo��o onde cada minuto gasto para telefone fixo consome 
//somente a metade. O valor do minuto excedente para outras operadoras � de 0.65, e para a pr�pria Vai-Vai 
//� 0.20. Fa�a um programa que permita ao usu�rio entrar com o tipo de liga��o 
//(�o� = outras operadoras, �v� = a pr�pria Vai-Vai, ou �f� = telefone fixo) e  a quantidade de minutos. 
//A cada entrada, deve-se informar o quanto que ele tem de saldo e o valor a pagar. Fa�a isto enquanto ele 
//indicar que existem mais liga��es a serem digitadas.

public class Grupo03Ex25 {
	public static void main (String [] args) {
		
		ClasseParaOexercicio25 classeParaOexercicio25;
		
		
		do {		
			classeParaOexercicio25 = preencherMinutos();
			
			classeParaOexercicio25.setSaldoEmMinutos(classeParaOexercicio25.calcularMinutosEvalorDaFaturaParaOutrasOperadoras());
			classeParaOexercicio25.setSaldoEmMinutosVavai(classeParaOexercicio25.calcularMinutosEvalorDaFaturaParaOperadoraVaiVai());
			classeParaOexercicio25.setSaldoEmMinutosFixo(classeParaOexercicio25.calcularMinutosEvalorDaFaturaParaTelefoneFixo());
			
			classeParaOexercicio25.imprimirMinutosEvalorDaFatura();
			
		} while(classeParaOexercicio25.getSaldoEmMinutos() > 0 
			&& classeParaOexercicio25.getSaldoEmMinutosVavai() > 0 
			&& classeParaOexercicio25.getSaldoEmMinutosFixo() > 0 );
	}
	
	
		public static ClasseParaOexercicio25 preencherMinutos() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Informar o tipo de liga��o que foi realizada: O = outras operadoras,"
				+ "V = operadora VAI-VAI ou F = telefone fixo");
		String tipoDeOperacao = sc.next();
		Double planoMensalEmReais = 50.0;		
		Integer quantidadeDeMinutosParaOutrasOperadoras = 0;
		Integer quantidadeDeMinutosParaOperadoraVaiVai = 0;
		Integer quantidadeDeMinutosParaTelefonesFixos = 0;
		
		Integer saldoEmMinutos = 100;	
		Integer saldoEmMinutosVavai = 150;
		Integer saldoEmMinutosFixo = 200;
		
		switch (tipoDeOperacao) {
		
		case "O":
			System.out.println("Digite a quantidade de minutos em liga��es realizadas para outras operadoras");
			quantidadeDeMinutosParaOutrasOperadoras = sc.nextInt();
										
		break;
		case "V":
			System.out.println("Digite a quantidade de minutos em liga��es realizadas para operadora VAI-VAI");
			quantidadeDeMinutosParaOperadoraVaiVai = sc.nextInt();
							
		break;
		case"F"	:
			System.out.println("Digite a quantidade de minutos em liga��es realizadas para telefones fixos");
			quantidadeDeMinutosParaTelefonesFixos = sc.nextInt();		
		break;
		default:			
		}		
		ClasseParaOexercicio25 classeParaOexercicio25 = new ClasseParaOexercicio25(planoMensalEmReais, 
			tipoDeOperacao, quantidadeDeMinutosParaOutrasOperadoras, quantidadeDeMinutosParaOperadoraVaiVai, 
			quantidadeDeMinutosParaTelefonesFixos, saldoEmMinutos, saldoEmMinutosVavai, saldoEmMinutosFixo);		
		
		return classeParaOexercicio25;
		}		
	}