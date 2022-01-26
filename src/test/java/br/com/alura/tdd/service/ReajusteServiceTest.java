package br.com.alura.tdd.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	private ReajusteService service;
	private Funcionario funcionario;
	
	//método do jUnit que chama automatica, antes de cada um dos metodos eu chamo inicializar
	@BeforeEach
	public void inicializar() {
		System.out.println("Inicializa");
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Ana",LocalDate.now(), new BigDecimal("1000.00"));
	}

	//após importar o afterEach executar cada método jUnit chama esse método
	@AfterEach 
	public void finalizar() {
		System.out.println("Fim");
	}
	
	@Test
	public void resjusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario, Desempenhho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
		
	}

	@Test
	public void resjusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {	
		service.concederReajuste(funcionario, Desempenhho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
		
	}
	
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("Antes de Todos");
	}
	
	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("Depois de Todos");
	}

	@Test
	public void resjusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {		
		service.concederReajuste(funcionario, Desempenhho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
		
	}
	

}
