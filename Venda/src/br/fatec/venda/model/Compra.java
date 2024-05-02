package br.fatec.venda.model;

public class Compra {
	private String data_compra;
	private String nome_prod;
	private double valor;
	private Cupom cupom;
	private double valorDesc;
	
	
	
	public Compra(String data_compra, String nome_prod, double valor, Cupom cupom) {
		super();
		this.data_compra = data_compra;
		this.nome_prod = nome_prod;
		this.valor = valor;
		this.cupom = cupom;
	}

	
	public String getData_compra() {
		return data_compra;
	}



	public void setData_compra(String data_compra) {
		this.data_compra = data_compra;
	}



	public String getNome_prod() {
		return nome_prod;
	}



	public void setNome_prod(String nome_prod) {
		this.nome_prod = nome_prod;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Cupom getCupom() {
		return cupom;
	}


	public void setCupom(Cupom cupom) {
		this.cupom = cupom;
	}

	public double calcDesconto(Cupom cupom) {
		this.cupom = cupom;
		double desconto = this.valor -  ((cupom.getDesc()/100) * this.valor);
		return desconto;
		
	}
	
}
