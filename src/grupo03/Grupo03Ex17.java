package grupo03;

import java.util.ArrayList;
import java.util.List;
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
		List<Paciente> pacientes = preencherListaPacientes();
		exibeRelatorio(pacientes);		
	}
	
	public static void exibeRelatorio(List<Paciente> pacientes) {
		
		System.out.println("Relatório de pacientes da clínica: ");
		System.out.println("Total de pacientes cadastrados na clínica: " + pacientes.size());
		System.out.println("Média de idade dos homens: " + calcularMediaIdadeHomens(pacientes));
		System.out.println("Mulheres com altura entre 1.60 e 1.70 e peso acima de 70 Kg: " 
		+ calculoDaAlturaEpesoDasMulheresQueEstaoEntre160E170CentimetrosDeAlturaEpesoAcimaDe70Quilos(pacientes));
		System.out.println("Paciente mais velho: " + metodoParaEncontrarPacienteMaisVelhoDentroDaLista(pacientes));
		System.out.println("Mulher com menor estatura: " + metodoParaEncontrarAmulherComMenorEstaturaDentroDaLista(pacientes));
		System.out.printf("IMC de cada paciente: " + nomeDeCadaPacienteDocalculoDoIndiceDeMassaCorporeaDosPacientesCadastradosNaClinica(pacientes) + "%n" +
		calculoDoIndiceDeMassaCorporeaDosPacientesCadastradosNaClinica(pacientes));		
	}	
	
	public static List<Paciente> preencherListaPacientes(){
		Scanner sc = new Scanner (System. in);
		
		List<Paciente> pacientes = new ArrayList<>();
		while(true) {
			
			Paciente paciente = new Paciente();
			System.out.println("Digite o nome do paciente: ");
			String nome = sc.next();
			if(nome.equals("fim")) break;
			paciente.nome = nome;
			System.out.println("Digite o sexo do paciente (F - Feminino, M - Masculino): ");
			paciente.sexo = sc.next();
			System.out.println("Digite o peso do paciente: ");
			paciente.peso = sc.nextDouble();
			System.out.println("Digite a altura do paciente em centimetros: ");
			paciente.altura = sc.nextInt();
			System.out.println("Digite a idade do paciente: ");
			paciente.idade = sc.nextInt();
			pacientes.add(paciente);
			System.out.println("Paciente " + nome + " cadastrado com sucesso");			
		}		
		sc.close();
		return pacientes;	
	}
			
	public static double calcularMediaIdadeHomens(List<Paciente> pacientes) {
		
		
		double contadorHomens = 0.0;
		double somaIdadeHomens = 0.0;
		
		for(Paciente p: pacientes) {
			if(p.sexo.equals("M")) {
				contadorHomens ++;
				somaIdadeHomens = somaIdadeHomens + p.idade;
			}			
		}
		return somaIdadeHomens / contadorHomens;		
	}
		
	public static int calculoDaAlturaEpesoDasMulheresQueEstaoEntre160E170CentimetrosDeAlturaEpesoAcimaDe70Quilos(List<Paciente> pacientes) {
		int contadorMulheres = 0;
		for(Paciente p: pacientes) {
			if(p.sexo.equals("F")) {				
				if(p.altura > 160 && p.altura < 170 && p.peso > 70) {
					contadorMulheres = contadorMulheres + 1;					
				}			
			}		
		}			
		return contadorMulheres;		
	}
		
	public static String metodoParaEncontrarPacienteMaisVelhoDentroDaLista(List<Paciente> pacientes) {
		
		Integer idadeDoMaisVelho = 0;
		String nomeDoMaisVelho = null;
		for(Paciente p: pacientes) {
			if(p.idade > idadeDoMaisVelho) {
				idadeDoMaisVelho =  p.idade;
				nomeDoMaisVelho = p.nome;
				
			}			
		}
		return nomeDoMaisVelho;
	}
			
	public static String metodoParaEncontrarAmulherComMenorEstaturaDentroDaLista(List<Paciente> pacientes) {
		
		String nomeDaMenorMulher = null;
		Integer menorAltura = 1000;	
		for(Paciente p: pacientes) {						
			if(p.sexo.equals("F")) {
				if(p.altura < menorAltura) {
					menorAltura = p.altura;
					nomeDaMenorMulher = p.nome;					
				}				
			}				
		}		
		return nomeDaMenorMulher;
	}
					
	public static List<Double> calculoDoIndiceDeMassaCorporeaDosPacientesCadastradosNaClinica(List<Paciente> pacientes) {
		
		double imc = 0;
		
		List<Double> listaDeImc = new ArrayList<>();
		for(Paciente p: pacientes) {
			
		double altura = p.altura;
		double peso = p.altura;			
			
			imc = (altura*altura) / peso;	
			
			listaDeImc.add(imc);
						
		}
		return listaDeImc;		
		
	}
	
	public static List<String> nomeDeCadaPacienteDocalculoDoIndiceDeMassaCorporeaDosPacientesCadastradosNaClinica(List<Paciente> pacientes) {
		List<String> nomeDosPacientesImc = new ArrayList<>();
		for(Paciente p: pacientes) {
			
		String nome = p.nome;			
		nomeDosPacientesImc.add(nome);
						
		}
		return nomeDosPacientesImc;		
	}
		
}