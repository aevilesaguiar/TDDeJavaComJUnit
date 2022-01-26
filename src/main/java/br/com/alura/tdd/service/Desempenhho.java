package br.com.alura.tdd.service;

import java.math.BigDecimal;

public enum Desempenhho{
	A_DESEJAR {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.03");
		}
	},
	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.15");
		}
	},
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.20");
		}
	};
	
	//usei o abstract por que quero que cada constante seja feito uma implementação
	public abstract BigDecimal percentualReajuste();
}