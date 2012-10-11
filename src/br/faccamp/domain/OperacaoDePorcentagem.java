package br.faccamp.domain;

public class OperacaoDePorcentagem extends Operacoes {

	public OperacaoDePorcentagem(String primeiroOperador) {
		super(primeiroOperador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String calcula(String segundoOperador) {
		Double primeiro = new Double(getPrimeiroOperador());
		Double segundo = new Double(segundoOperador);
		return (primeiro*segundo)/100+"";
	}
	
	

}
