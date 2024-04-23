package br.edu.fatec.main;
 
import br.edu.fatec.model.*;
 
public class Principal {
 
    public static void main(String[] args) {
    	
        //instanciando novo obj Carro//
        Carro meu_carro = new Carro("fff3030", "Volkswagen", "UP Tsi", 2, true);
        System.out.println(meu_carro);
        meu_carro.ligar();
        meu_carro.drift();
        
        //instanciando novo obj Moto//
        Moto minha_moto = new Moto ("abc1234g", "Kawasaki", "Ninja", 800, true);
        System.out.println(minha_moto);
        minha_moto.grau();
        
        //instanciando novo obj Caminhão//
        
        Caminhao meu_caminhao = new Caminhao ("asdfj182", "Mercedes-Benz", "ABC123", 4, "correios");
        Caminhao meu_caminhao2 = new Caminhao ("asdfj182", "Volkswagen", "XYZ987", 3, "carga");
        
        System.out.println(meu_caminhao);
        meu_caminhao.carregar_carga();
        System.out.println(meu_caminhao2);
        meu_caminhao2.carregar_carga();
    }
 
}