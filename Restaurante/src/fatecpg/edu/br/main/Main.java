package fatecpg.edu.br.main;

import java.util.ArrayList;
import java.util.List;

import fatecpg.edu.br.model.ListaPedido;
import fatecpg.edu.br.model.Pedido;


public class Main {

	public static void main(String[] args) {

		List<String> itens1 = new ArrayList<>();
		itens1.add("Lanche");
		itens1.add("Refrigerante");
		itens1.add("Pizza");
		itens1.add("Cerveja");
		
		List<String> itens2 = new ArrayList<>();
		itens2.add("Suco");
		itens2.add("Coxinha");
		itens2.add("Esfiha");
		itens2.add("Cerveja");
		
		List<String> itens3 = new ArrayList<>();
		itens3.add("Refrigerante");
		itens3.add("Pizza");
		itens3.add("Esfiha");

		
		Pedido pedido1 = new Pedido(1, itens1);
		Pedido pedido2 = new Pedido(2, itens2);
		Pedido pedido3 = new Pedido(3, itens3);
		
		//criando uma lista com todos os pedidos registrados
		ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
		listaPedidos.add(pedido1);
		listaPedidos.add(pedido2);
		listaPedidos.add(pedido3);
		listaPedidos.add(pedido3);
		listaPedidos.add(pedido3);
		
		//instanciando novo objeto da ListaPedido e populando com a lista criada anteriormente
		ListaPedido lista1 = new ListaPedido(listaPedidos);
		
		//removendo pedido da lista
		listaPedidos.remove(pedido2);
		
		//alterando status para "Entregue"
		pedido3.setStatus(true);
		
		//imprimindo somente pedidos em andamento
		lista1.pedidosAndamento();
		
		//imprimindo todos os pedidos
		System.out.println(lista1);
		
	}

}
