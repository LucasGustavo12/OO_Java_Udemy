package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem("caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);

		Compra compra2 = new Compra();
		compra1.adicionarItem("caderno", 10, 10);
		compra1.adicionarItem(new Produto("Impressora", 998.90), 1);

		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);

		System.out.println(cliente.obterValorTotal());
		
	}
	
}
