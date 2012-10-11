package br.faccamp.domain;

public class OperacaoUmSobreX extends Operacoes {

	public OperacaoUmSobreX(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String primeiroOperador) {
		Double primeiro = new Double(primeiroOperador);
		return (1/primeiro)+"";
	}
}
