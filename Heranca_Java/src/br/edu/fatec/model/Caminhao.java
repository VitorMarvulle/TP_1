package br.edu.fatec.model;

public class Caminhao extends Veiculo{
	private int qtdEixos;
	private String tipo;
	
    public Caminhao(String placa, String marca, String modelo, int qtdEixos, String tipo) {
        super(placa, marca, modelo);
        this.qtdEixos = qtdEixos;
        this.tipo = tipo;
    }
    public void carregar_carga() {
    	if (this.tipo == "correios") {
    		System.out.println("Seu caminhão "+ getMarca() +" "+ getModelo() +" está chegando com sua encomenda! ");
    	}else {
    		System.out.println("O caminhão "+ getMarca() +" "+ getModelo() +" vai carregar no porto e pegar estrada! ");
    	}
    }
        
    public String toString() {
        return "\n -------CAMINHÃO------- \n"
                + "Placa:		"+ this.getPlaca() +"\n"
                + "Marca:		"+ this.getMarca() +"\n"
                + "Modelo:		"+ this.getModelo() +"\n"
                + "Qtd Eixos:	"+ this.qtdEixos + "\n"
                + "Tipo de caminhão:	" + (this.tipo + "\n")
        		+"----------------------";

    }
}
