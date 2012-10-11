package br.faccamp.domain;

public class OperacaoProcessaMM extends Operacoes{

	public OperacaoProcessaMM(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		Boolean aux = new Boolean(getPrimeiroOperador());
		if (aux==true){
			Double primeiro = new Double(getPrimeiroOperador());
			return (primeiro*(-1))+"";
		}else{
			Double segundo = new Double(segundoOperador);
			return (segundo*(-1))+"";
		}		
	}
}
