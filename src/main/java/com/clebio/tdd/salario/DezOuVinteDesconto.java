package com.clebio.tdd.salario;

public class DezOuVinteDesconto implements RegraDeCalculo{
	
	public double calcula(Funcionario funcionario){
		if(funcionario.getSalario() <= 3500){
			return funcionario.getSalario() * .9;
		} else {
			return funcionario.getSalario() * .8;
		}
	}
}
