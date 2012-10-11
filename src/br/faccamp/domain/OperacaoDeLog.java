package br.faccamp.domain;

public class OperacaoDeLog extends Operacoes{

	public OperacaoDeLog(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String primeiroOperador) {
		Integer primeiro = new Integer(primeiroOperador);
		return Math.log10(primeiro)+"";
	}
}
