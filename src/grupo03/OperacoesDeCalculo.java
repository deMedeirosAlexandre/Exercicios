package grupo03;



public class OperacoesDeCalculo {	
	
	private Integer primeiroNumero;
	private Integer segundoNumero;
	private String operador;
	
	
	
	//respeitar ordem no construtor e qualquer parametro -- sempre nome da classe e ao construir um objeto com parametros indispensaveis
	public OperacoesDeCalculo (Integer primeiroNumero, Integer segundoNumero, String operador) {
		this.segundoNumero = segundoNumero;
		this.primeiroNumero = primeiroNumero;		
		this.operador = operador;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
		
	//	switch (operador){			
		//case "+":			
		//	resultado = (double) primeiroNumero + segundoNumero;							
		//	break;			
	//}	
	//	return resultado;
	//}	
	
		//if(operador.equals("+")) {			
			
		return (double) primeiroNumero + segundoNumero;			
		//}
		
	}
	
	
	public Double calcularSubtracao() {		
		//switch (operador){			
		//case "-":	
			
		return (double) primeiroNumero - segundoNumero;						
			//break;				
	//}	
		
	}
	
	
	public Double calcularMultiplicacao() {		
		//switch (operador){			
		//case "*":				
		return (double) primeiroNumero * segundoNumero;						
			//break;				
	//}	
			
	}	
	
	
	public Double calcularDivisao() {		
		//switch (operador){			
		//case "/":				
		return (double) primeiroNumero / segundoNumero;						
		//	break;				
	//}		
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