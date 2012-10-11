package br.faccamp.domain;

public class OperacaodeDivisao extends Operacoes {

	public OperacaodeDivisao(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		Double primeiro = new Double(getPrimeiroOperador());
		Double segundo = new Double(segundoOperador);
		if (segundo==0){
			return ("Erro! Impossivel divisão por 0");
		} else {
			return (primeiro/segundo)+"";
		}		
	}
}
