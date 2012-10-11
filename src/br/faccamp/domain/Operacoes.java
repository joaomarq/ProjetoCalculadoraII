package br.faccamp.domain;

public abstract class Operacoes {

	private String primeiroOperador;

	public abstract String calcula(String conteudo) ;

	public Operacoes(String primeiroOperador) {
		this.primeiroOperador = primeiroOperador;
	}
	
	public String getPrimeiroOperador() {
		return primeiroOperador;
	}

	public void setPrimeiroOperador(String primeiroOperador) {
		this.primeiroOperador = primeiroOperador;
	}
	
	
}
