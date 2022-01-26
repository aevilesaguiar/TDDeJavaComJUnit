package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	//regra de negócio
	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));//Bonus é 10% do valor do salario
		if (valor.compareTo(new BigDecimal("1000")) > 0) {//se o bonus for acima de 1000 ele não recebe
			throw new IllegalArgumentException("Funcionário com salário maior que R$10.000,00 não pode receber bônus");
		}
		return valor.setScale(2,RoundingMode.HALF_UP);//SEMPRE VAI APARECER COM DUAS CASAS DECIMAIS

}
}
