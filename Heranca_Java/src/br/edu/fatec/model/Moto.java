package br.edu.fatec.model;

public class Moto extends Veiculo{
	private int qtdCc;
	private boolean vel_digital;
	
	public Moto(String placa, String marca, String modelo, int qtdCc, boolean vel_digital) {
        super(placa, marca, modelo);
        this.qtdCc = qtdCc;
        this.vel_digital = vel_digital;
    }
	
	public void grau() {
		System.out.println("Sua moto modelo: "+ getModelo() +" Chamou no grau!");
	}
	
	 public String toString() {
	        return "\n -------MOTO------- \n"
	                + "Placa:		"+ this.getPlaca() +"\n"
	                + "Marca:		"+ this.getMarca() +"\n"
	                + "Modelo:		"+ this.getModelo() +"\n"
	                + "Cilindradas:	" + this.qtdCc + "Cc \n"
	                + "Vel Digital:	" + (this.vel_digital == true ? "Possui \n" : "Nao Possui \n")
	        		+"-------------------";

    }

}
