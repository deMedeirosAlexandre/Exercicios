package grupo03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

//47.	Leia uma rela��o de pacientes de uma cl�nica, cada um com
// o nome, o sexo, o peso,
// a idade e a altura.
// Para sinalizar o fim da lista ser� fornecido �fim� no nome do �ltimo
//paciente.

//Exiba um relat�rio contendo:
//i.    a quantidade de pacientes.
//ii.   a m�dia de idade dos homens.
//iii.  a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
//iv.  a quantidade de pessoas com idade entre 18 e 25.
//v.   o nome do paciente mais velho.
//vi.  o nome da mulher mais baixa.
//vii. � neste item, voc� cria uma situa��o interessante constr�i o algoritmo correspondente.   

public class Grupo03Ex17 {

	public static void main (String[] args) {
		List<Paciente> pacientes = preencherListaPacientes();
		exibeRelatorio(pacientes);
	}

	public static void exibeRelatorio(List<Paciente> pacientes){
		System.out.println("Relátorio de pacientes da clinica: ");
		System.out.println("Total de pacientes: " + pacientes.size());
		System.out.println("Media de idade dos homens: " + calcularMediaIdadeHomens(pacientes));
		//i.    a quantidade de pacientes.
//ii.   a m�dia de idade dos homens.
//iii.  a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
//iv.  a quantidade de pessoas com idade entre 18 e 25.
//v.   o nome do paciente mais velho.
//vi.  o nome da mulher mais baixa.
//vii. exibir o maior e o menor imc dos pacientes na lista.
	}

	public static List<Paciente> preencherListaPacientes(){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System. in);
		List<Paciente> pacientes = new ArrayList<>();

		while(true){
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
			System.out.println("Paciente " + nome + " adicionado a lista da clínica");
		}
		sc.close();
		return pacientes;
	}

	public static double calcularMediaIdadeHomens(List<Paciente> pacientes){
		double contadorHomens = 0.0;
		double somaIdadeHomens = 0.0;
		for (Paciente p : pacientes) {
			if(p.sexo.equals("m")){
				contadorHomens++;
				somaIdadeHomens += p.idade;
			}
		}
		return somaIdadeHomens/contadorHomens;
	}


}
