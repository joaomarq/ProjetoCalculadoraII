package br.faccamp.domain;

public class OperacaoDeSqrt extends Operacoes {

	public OperacaoDeSqrt(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String primeiroOperador) {
		Integer primeiro = new Integer(primeiroOperador);
		return Math.sqrt(primeiro)+"";
	}

}
