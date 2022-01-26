package br.com.alura.tdd.service;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service= new BonusService();
				
		//assertThrows(IllegalArgumentException.class,
			//	()-> service.calcularBonus(new Funcionario("Rodrigo",LocalDate.now(), new BigDecimal("2500"))));
		
		try {
			service.calcularBonus(new Funcionario("Rodrigo",LocalDate.now(), new BigDecimal("2500")));
			fail("Não deu a exception");
		} catch (Exception e) {
			assertEquals("Funcionário com salário maior que R$10.000,00 não pode receber bônus", e.getMessage());
		}
		
	}
	
	@Test
	void bonusDeveriaSerQuinzePorCentodoSalario() {
		BonusService service= new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeExtamente10000() {
		BonusService service= new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);//só se passar de 1000 que ele não recebe
	}
	

}
