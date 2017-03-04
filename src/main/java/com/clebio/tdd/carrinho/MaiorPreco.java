package com.clebio.tdd.carrinho;

public class MaiorPreco {

	//Teste 3	
	public double encontra(CarrinhoDeCompras carrinho) {
		if(carrinho.getItens().size() == 0) 
			return 0;
		
		double maior = carrinho.getItens().get(0).getValorTotal();
		
		for(Item item : carrinho.getItens()) {
			if(maior < item.getValorTotal()) {
				maior = item.getValorTotal();
			}
		}		
		return maior;
	}

	//Teste 2
	//	public double encontra(CarrinhoDeCompras carrinho) {
	//		if(carrinho.getItens().size() == 0) 
	//			return 0;
	//		
	//		return carrinho.getItens().get(0).getValorTotal();
	//	}

	//Teste 1
	//	public double encontra(CarrinhoDeCompras carrinho) {
	//			return 0;
	//	}

}
