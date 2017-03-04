package com.clebio.tdd.salario;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVinteDesconto()),
	DBA(new QuinzeOuVinteCincoDesconto()),
	TESTADOR(new QuinzeOuVinteCincoDesconto());
	
	private final RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra(){
		return this.regra;
	}
}
