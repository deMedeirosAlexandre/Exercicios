package grupo03;

public class ClasseParaOexercicio10 {
	
	private Integer idade;
	private Integer quantidadeDePessoas;
	private Integer [] armazenagem;
	
	public ClasseParaOexercicio10 (Integer quantidadeDePessoas, Integer idade, Integer[] armazenagem) {
		this.quantidadeDePessoas = quantidadeDePessoas;
		this.idade = idade;		
		this.armazenagem = armazenagem;
	}	
	
	
	public void imprimirResultadosDoExercicio40() {
		
		System.out.println("Média das idades: " + calcularMediaDeIdade());
		System.out.println("Maior idade: " + selecionarAmaiorIdadeDigitada());
		System.out.println("Menor idade: " + selecionarAmenorIdadeDigitada());
		System.out.println("Pessoas com mais de 18 anos: " + selecionarQuantasPessoasPossuemMaisDe18Anos());		
		
	}	
	
	public Double calcularMediaDeIdade() {
		
		Double soma = 0.0;		
		Double mediaIdade = 0.0;
		for(int i = 0;i < quantidadeDePessoas; i++) {
			
			soma = soma  + armazenagem [i];	
			mediaIdade = (soma / quantidadeDePessoas);	
		}
		
		return mediaIdade;
	}	
	
	
	public Integer selecionarAmaiorIdadeDigitada() {
		Integer maior = 0;
		
		for(int i = 0;i < quantidadeDePessoas; i++) {			
			if (armazenagem [i] >= maior) {				
			maior = armazenagem [i];
			}		
		}
		return maior;		
	}
	
	
	public Integer selecionarAmenorIdadeDigitada() {
		Integer menor = 1000;
		for(int i = 0;i < quantidadeDePessoas; i++) {	
			if(armazenagem [i] <= menor) {				
				menor = armazenagem [i];
			}			
		}
		return menor;
	}
	
	
	public Integer selecionarQuantasPessoasPossuemMaisDe18Anos() {
		
		int maiorDeIdade = 0;
		
		for(int i = 0;i < quantidadeDePessoas; i++) {		
			if(armazenagem[i] > 18) {
				maiorDeIdade = maiorDeIdade + 1;
			}		
		}
		return maiorDeIdade;	
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}