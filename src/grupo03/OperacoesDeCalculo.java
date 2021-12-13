package grupo03;

public class OperacoesDeCalculo {	
	
	private Integer primeiroNumero;
	private Integer segundoNumero;
	private String operador;
	private Double resultado;	

	public void imprimirResultado() {		
		
		if(operador.equals("+")) {
		
		System.out.println(calcularSoma());
		}
		if(operador.equals("-")) {
			
			System.out.println(calcularSubtracao());
		}
		if(operador.equals("*")) {
			
			System.out.println(calcularMultiplicacao());
		}
		if(operador.equals("/")) {
			
			System.out.println(calcularDivisao());
		}		
	}	
	
	public Double calcularSoma() {	
		
		switch (operador){			
		case "+":			
			resultado = (double) primeiroNumero + segundoNumero;							
			break;			
	}	
		return resultado;
	}	
	
	
	public Double calcularSubtracao() {		
		switch (operador){			
		case "-":	
			
			resultado = (double) primeiroNumero - segundoNumero;						
			break;				
	}	
		return resultado;
	}
	
	
	public Double calcularMultiplicacao() {		
		switch (operador){			
		case "*":				
			resultado = (double) primeiroNumero * segundoNumero;						
			break;				
	}	
		return resultado;	
	}	
	
	
	public Double calcularDivisao() {		
		switch (operador){			
		case "/":				
			resultado = (double) primeiroNumero / segundoNumero;						
			break;				
	}	
		return resultado;	
	}

	
	public Integer getPrimeiroNumero() {
		return primeiroNumero;
	}


	public void setPrimeiroNumero(Integer primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}


	public Integer getSegundoNumero() {
		return segundoNumero;
	}


	public void setSegundoNumero(Integer segundoNumero) {
		this.segundoNumero = segundoNumero;
	}


	public String getOperador() {
		return operador;
	}


	public void setOperador(String operador) {
		this.operador = operador;
	}		
}