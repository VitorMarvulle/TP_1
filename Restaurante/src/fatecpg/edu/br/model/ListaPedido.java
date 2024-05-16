package fatecpg.edu.br.model;

import java.util.ArrayList;
import java.util.List;


public class ListaPedido {
	

	private List<Pedido> pedidos = new ArrayList<>();
	
	public ListaPedido() {}
	
	public ListaPedido(List<Pedido> listaPedidos) {
		this.pedidos = listaPedidos;
	}
	
	public void addPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public void addPedido(List<Pedido> listaPedidos) {
		this.pedidos.addAll(listaPedidos);
	}
	
	
	public void pedidosAndamento(){
		for (Pedido t : this.pedidos) {
			if (t.getStatus().equals("Em Andamento")) {
				System.out.println(t);
		    }
		}	
	}
	

	@Override
	public String toString() {
		return "ListaPedido [pedidos=" + pedidos;
	}
	
	
	
	
}
