package br.fatec.venda.model;

public class Cupom {
	
	private int cod;
	private double desc;
	
	
	public Cupom(int cod, double desc) {
		super();
		this.cod = cod;
		this.desc = desc;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public double getDesc() {
		return desc;
	}


	public void setDesc(double desc) {
		this.desc = desc;
	}


}


