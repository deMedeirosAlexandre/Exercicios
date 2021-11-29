package grupo03;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//47.	Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, 
//a idade e a altura.  Para sinalizar o fim da lista será fornecido “fim” no nome do último
//paciente.

//Exiba um relatório contendo:
//i.    a quantidade de pacientes.
//ii.   a média de idade dos homens.
//iii.  a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
//iv.  a quantidade de pessoas com idade entre 18 e 25.
//v.   o nome do paciente mais velho. 
//vi.  o nome da mulher mais baixa.
//vii. – neste item, você cria uma situação interessante constrói o algoritmo correspondente.   

public class Grupo03Ex17 {
	

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System. in);
		
		
		int somaIdadeHomens = 0;
		int somaAlturaEpeso = 0;
		int somaIdade18A25 = 0;
		int IdadeDoMaisVelho = 0;
		
		ArrayList <String> nomes = new ArrayList<String>();
		ArrayList <String> sexo = new ArrayList<>();
		ArrayList <Double> peso = new ArrayList<Double>();
		ArrayList <Integer> idade = new ArrayList<Integer>();
		ArrayList <Double> altura = new ArrayList<Double>();		
		
		for(int i = 0; i <= nomes.size(); i++ ) {		
		
			System.out.println("Digite o nome");	
			String inicio = sc.next();			
						
			if(inicio.equals("fim")) {
				
			i = i + 1 ;
				
			}
			else {
				
				nomes.add(i,inicio);	
			
				System.out.println("Digite o sexo");
				String sexoInicio = sc.next();
				sexo.add(i,sexoInicio);
			
				System.out.println("Digite o peso");
				double pesoInicio = sc.nextDouble();
				peso.add(i,pesoInicio);
			
				System.out.println("Digite a idade");
				int idadeInicio = sc.nextInt();
						
				idade.add(i,idadeInicio);			
			
				System.out.println("Digite a altura");
				double alturaInicio = sc.nextDouble();
				altura.add(i,alturaInicio);			
			
				if(sexoInicio.equals("M")) {				
					somaIdadeHomens = somaIdadeHomens + idadeInicio;
					double mediaDeIdadeHomens = somaIdadeHomens / idade.size();	
				
				}
			
				
			
				if(idadeInicio > 18 && idadeInicio < 25) {
					somaIdade18A25 = somaIdade18A25 + 1; 
				
				}			
			}			
		}
		
		
		
		for(int i = 0; i <= nomes.size(); i++ ) {				
			
				int comparador = idade.get(i);
				
				if(comparador > IdadeDoMaisVelho) {
					IdadeDoMaisVelho = comparador;					
				}				
			}
			
		
		
		
		
		
		
		
		System.out.println("Quantidade de pacientes: " + sexo.size());
		System.out.println("Média de idade dos homens: " + (somaIdadeHomens / idade.size()));
		System.out.println("quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " );
		System.out.println("Pessoas entre 18 e 25 anos: " + somaIdade18A25);
		System.out.println("O nome do paciente mais velho " + nomes.indexOf(IdadeDoMaisVelho));
		System.out.println(sexo.indexOf("F"));
			
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
