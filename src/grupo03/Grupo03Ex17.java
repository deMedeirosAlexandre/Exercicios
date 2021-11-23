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
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner (System. in);
		Locale.setDefault(Locale.US);
		
		
		
		ArrayList <String> nomes = new ArrayList<String>();
		ArrayList <String> sexo = new ArrayList<>();
		ArrayList <Double> peso = new ArrayList<Double>();
		ArrayList <Integer> idade = new ArrayList<Integer>();
		ArrayList <Double> altura = new ArrayList<Double>();		
		

		
		
		
		
		
		for(int i = 0; i <= nomes.size(); i++ ) {
		
		
			System.out.println("Digite o nome");
			nomes.add(i, sc.next());
						
			if(nomes.equals("fim")) {
				
			i = i + 1 ;
				
			}
			else {
			
			System.out.println("Digite o sexo");
			sexo.add(i,sc.next());
			
			System.out.println("Digite o peso");
			peso.add(i,sc.nextDouble());
			
			System.out.println("Digite a idade");
			idade.add(i,sc.nextInt());
			
			System.out.println("Digite a altura");
			altura.add(i,sc.nextDouble());
			}
			
		}
			
			
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
