package grupo03;

public class ClasseParaOexercicio25 {
	
	private Double planoMensalEmReais;
	private String tipoDeOperacao;
	private Integer quantidadeDeMinutosParaOutrasOperadoras;
	private Integer quantidadeDeMinutosParaOperadoraVaiVai;
	private Integer quantidadeDeMinutosParaTelefonesFixos;
	private Integer saldoEmMinutos;
	private Integer saldoEmMinutosVavai;
	private Integer saldoEmMinutosFixo;
	
	
	public ClasseParaOexercicio25 (Double planoMensalEmReais, String tipoDeOperacao, 
			Integer quantidadeDeMinutosParaOutrasOperadoras, Integer quantidadeDeMinutosParaOperadoraVaiVai, 
			Integer quantidadeDeMinutosParaTelefonesFixos, Integer saldoEmMinutos, Integer saldoEmMinutosVavai, 
			Integer saldoEmMinutosFixo) {
		this.planoMensalEmReais = planoMensalEmReais;
		this.tipoDeOperacao = tipoDeOperacao;
		this.quantidadeDeMinutosParaOutrasOperadoras = quantidadeDeMinutosParaOutrasOperadoras;
		this.quantidadeDeMinutosParaOperadoraVaiVai = quantidadeDeMinutosParaOperadoraVaiVai;
		this.quantidadeDeMinutosParaTelefonesFixos = quantidadeDeMinutosParaTelefonesFixos;
		this.saldoEmMinutos = saldoEmMinutos;
		this.saldoEmMinutosVavai = saldoEmMinutosVavai;
		this.saldoEmMinutosFixo = saldoEmMinutosFixo;		
	}


	
	public Integer getSaldoEmMinutos() {
		return saldoEmMinutos;
	}


	public void setSaldoEmMinutos(Integer saldoEmMinutos) {
		this.saldoEmMinutos = saldoEmMinutos;
	}


	public Integer getSaldoEmMinutosVavai() {
		return saldoEmMinutosVavai;
	}


	public void setSaldoEmMinutosVavai(Integer saldoEmMinutosVavai) {
		this.saldoEmMinutosVavai = saldoEmMinutosVavai;
	}


	public Integer getSaldoEmMinutosFixo() {
		return saldoEmMinutosFixo;
	}


	public void setSaldoEmMinutosFixo(Integer saldoEmMinutosFixo) {
		this.saldoEmMinutosFixo = saldoEmMinutosFixo;
	}
	

	public Integer calcularMinutosEvalorDaFaturaParaOutrasOperadoras() {
		
		return  saldoEmMinutos = saldoEmMinutos - quantidadeDeMinutosParaOutrasOperadoras;		
		 
	}


	public Integer calcularMinutosEvalorDaFaturaParaOperadoraVaiVai() {
		return saldoEmMinutosVavai = saldoEmMinutosVavai - quantidadeDeMinutosParaOperadoraVaiVai;
		
	}


	public Integer calcularMinutosEvalorDaFaturaParaTelefoneFixo() {
		return saldoEmMinutosFixo = saldoEmMinutosFixo - quantidadeDeMinutosParaTelefonesFixos;
		
	}


	public void imprimirMinutosEvalorDaFatura() {
		if(tipoDeOperacao.equals("O")) {
			if(saldoEmMinutos > 0) {
				System.out.println("Seu saldo em minutos é " + saldoEmMinutos);
				System.out.println("Valor a pagar: R$ " + planoMensalEmReais);
			}
			else {					
				System.out.println("Valor a pagar: R$ " + (planoMensalEmReais = (Double) ((saldoEmMinutos * -1) * 0.65) + planoMensalEmReais));
			}
		}
		
		if(tipoDeOperacao.equals("V")) {
			if(saldoEmMinutosVavai > 0) {
				System.out.println("Seu saldo em minutos é " + saldoEmMinutosVavai);
				System.out.println("Valor a pagar: R$ " + planoMensalEmReais);
			}
			else {					
				planoMensalEmReais = (double) saldoEmMinutosVavai * (-0.20) + planoMensalEmReais ;
				System.out.println("Valor a pagar: R$ " + planoMensalEmReais);
			}
		}
		
		if(tipoDeOperacao.equals("F")) {
			if(saldoEmMinutosFixo > 0) {
				System.out.println("Seu saldo em minutos é " + saldoEmMinutosFixo);
				System.out.println("Valor a pagar: R$ " + planoMensalEmReais);
			}
			else {
				System.out.println("Valor a pagar: R$ " + planoMensalEmReais);			
			}
		}
		
		if(saldoEmMinutos <= 0 || saldoEmMinutosVavai <= 0 || saldoEmMinutosFixo <= 0) {
		System.out.println("Seus minutos promocionais terminaram");	
		}
		
	}		
}