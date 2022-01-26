package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenhho desempenho) {
		
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
			funcionario.reajustarSalario(reajuste);
		
	}

}
