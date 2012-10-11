package br.faccamp.domain;

public class OperacaoDeSubtracao extends Operacoes {

	public OperacaoDeSubtracao(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		Integer primeiro = new Integer(getPrimeiroOperador());
		Integer segundo = new Integer(segundoOperador);
		return (primeiro-segundo)+"";
	}	
}
