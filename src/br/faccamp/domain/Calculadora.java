package br.faccamp.domain;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.faccamp.view.CalculadoraGUI;

public class Calculadora  {
	
	private CalculadoraGUI gui;
	private Display display;
	private Operacoes operacoes;

	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);		
	}

	public void processaMC() {
		// TODO Auto-generated method stub
		
	}

	public void processaMR() {
		// TODO Auto-generated method stub
		
	}

	public void processaMS() {
		// TODO Auto-generated method stub
		
	}

	public void processaMMais() {
		// TODO Auto-generated method stub
		
	}

	public void processaMMenos() {
		// TODO Auto-generated method stub
	}

	public void processaCE() {
		display.limpa();
		
	}

	public void processaC() {
		display.limpa();
		operacoes. setPrimeiroOperador("");
	}

	public void processaRaiz() {
		String conteudo = display.getConteudo();
		operacoes = new OperacaoDeSqrt(display.getConteudo());
		display.limpa();
		if (conteudo.length()==0){
			display.atualiza("");
		} else{
			display.atualiza(operacoes.calcula(conteudo));
		}
	}

	public void processaMaisOuMenos() {
		String conteudo = display.getConteudo();
		operacoes = new OperacaoProcessaMM(display.getConteudo());
		display.limpa();
		display.atualiza(operacoes.calcula(conteudo));
		
	}
    
	public void processaFatorial() {
		String conteudo = display.getConteudo();
		operacoes = new OperacaoDeFatorial(display.getConteudo());
		display.limpa();
		display.atualiza(operacoes.calcula(conteudo));
	}

	public void processaSete() {
		display.atualiza("7");
		
	}

	public void processaOito() {
		display.atualiza("8");
		
	}

	public void processaNove() {
		display.atualiza("9");
		
	}

	public void processaDivisao() {
		operacoes = new OperacaodeDivisao(display.getConteudo());
		display.limpa();
		
	}

	public void processaPorcentual() {;
		operacoes = new OperacaoDePorcentagem(display.getConteudo());
		display.limpa();		
	}

	public void processaQuatro() {
		display.atualiza("4");
		
	}

	public void processaCinco() {
			display.atualiza("5");	
	}

	public void processaSeis() {
			display.atualiza("6");	
	}

	public void processaVezes() {
		operacoes = new OperacaoDeMult(display.getConteudo());
		display.limpa();
	}

	public void processaUmSobreX() {
		String conteudo = display.getConteudo();
		operacoes = new OperacaoUmSobreX(display.getConteudo());
		display.limpa();
		if (conteudo.length()==0){
			display.atualiza("");
		} else{
			display.atualiza(operacoes.calcula(conteudo));
		}
	}
		

	public void processaUm(){
		display.atualiza("1");
		
	}

	public void processaDois() {
		display.atualiza("2");
		
	}

	public void processaTres() {
		display.atualiza("3");
		
	}

	public void processaMenos() {
		operacoes = new OperacaoDeSubtracao(display.getConteudo());
		display.limpa();
	}

	public void processaXElevadoY() {
		operacoes = new OperacaoDeXElevadoY(display.getConteudo());
		display.limpa();
		
	}

	public void processaZero(){
		display.atualiza("0");
	}

	public void processaVirgula() {
		display.atualiza(".");
	}

	public void processaIgual(){
		String conteudo = display.getConteudo();
		display.limpa();
		if (conteudo.length()==0){
			display.atualiza("");
		} else{
			display.atualiza(operacoes.calcula(conteudo));
		}
	}

	public void processaLog() {
		String conteudo = display.getConteudo();
		operacoes = new OperacaoDeLog(display.getConteudo());
		display.limpa();
		display.atualiza(operacoes.calcula(conteudo));
		
	}

	public void processaMais(){
		operacoes = new OperacaoDeSoma(display.getConteudo());
		display.limpa();
	}


}
