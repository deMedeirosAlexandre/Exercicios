package grupo03;

public class Paciente {
	
	private String nome;
	private String sexo;
	private Double peso;
	private Integer altura;
	private Integer idade;
	
	public String toString() {		
		return "Paciente [nome: " + nome + " sexo " + sexo + " peso " + peso + " altura " + altura +
			" idade " + idade + "]";		
	}
	
	public Paciente (String nome, String sexo, Double peso, Integer altura, Integer idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.idade = altura;	
	}
	
	
	
	
	
	
	
	
	
	
	public Double getImc () {
		
		Double imc; 
		
		imc = peso / ((altura*altura)/10000.0);
		
		return imc;
	}
	
	public boolean isMasculino () {
		
		boolean masculino;
		masculino = sexo.equals("M");
		
		
		
		return masculino;
	}
	
	
	
public boolean isFeminino () {
		
		
		boolean feminino = sexo.equals("F");		
		
		
		return feminino;
	}



public Integer getIdade() {
	return idade;
}


public void setIdade(Integer idade) {
	this.idade = idade;
	
}



public String getNome() {
return nome;	
}

public void setNome(String nome) {
	this.nome = nome;	
}


public void setSexo(String sexo) {	
	this.sexo = sexo;		
}

public String getSexo() {
	return sexo;
}


public Double getPeso() {
	return peso;
}

public void setPeso(Double peso) {
	this.peso = peso;
}


public Integer getAltura() {
	return altura;
}

public void setAltura(Integer altura) {
	this.altura = altura;
}




















	
	

}
