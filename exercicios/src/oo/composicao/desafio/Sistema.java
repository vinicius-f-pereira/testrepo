package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem("Notebook", 2000, 2);
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("Caderno", 10, 10);
		compra1.adicionarItem("Impressora", 1000, 1);
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}

}
