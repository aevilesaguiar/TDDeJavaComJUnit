package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	//regra de neg�cio
	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));//Bonus � 10% do valor do salario
		if (valor.compareTo(new BigDecimal("1000")) > 0) {//se o bonus for acima de 1000 ele n�o recebe
			throw new IllegalArgumentException("Funcion�rio com sal�rio maior que R$10.000,00 n�o pode receber b�nus");
		}
		return valor.setScale(2,RoundingMode.HALF_UP);//SEMPRE VAI APARECER COM DUAS CASAS DECIMAIS

}
}
