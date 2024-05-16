package fatecpg.edu.br.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int num;
	private List<String> itens = new ArrayList<>();
	private boolean status;
	
	public Pedido(int num, List<String> itens) {
		this.num = num;
		this.itens = itens;
		this.status = true;
	}

	public  int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public List<String> getItens() {
		return itens;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}

	public String getStatus() {
		return status ? "Em Andamento" : "Entregue";
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "\n### PEDIDO ### "
				+ "\nNúmero:	" + num 
				+ "\nItens:	" + itens 
				+ "\nStatus:	" + getStatus() + "\n";
	}

	
	
}
