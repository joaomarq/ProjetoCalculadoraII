package br.faccamp.domain;

public class OperacaoDeFatorial extends Operacoes{

	public OperacaoDeFatorial(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String primeiroOperador) {
		Float primeiro = new Float(getPrimeiroOperador());
		return fatorial(primeiro)+"";        
	}
	
	public float fatorial(float primeiro){
		if (primeiro == 0 || primeiro == 1){
			return 1;
		}else{
			return (fatorial(primeiro-1)*primeiro);
		 }
	}
}
