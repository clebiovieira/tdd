package com.clebio.tdd.salario;

public class CalculadoraSalario {
	public double calculaSalario(Funcionario funcionario){		
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}
}
