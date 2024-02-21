package br.edu.fatecpg.aula1;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double num1,num2,res=0;
        int valor;
        Scanner ler = new Scanner(System.in);
        String menu = """ 
                ***************************
                Entre com uma das opções:
                1 - Área do Quadrado;
                2 - Área do círculo;
                ***************************
                """;

        System.out.println(menu);
        valor = ler.nextInt();        
        switch(valor) {
        case 1:
            System.out.println("Digite o valor da altura: ");
            num1 = ler.nextDouble();
            
            System.out.println("Digite o valor da largura: ");
            num2 = ler.nextDouble();
            
            res = num1*num2;
            System.out.println("A área do quadrado é: " +res);   
        break;
        
        case 2:
            System.out.println("Digite o raio do círculo: ");
            num1 = ler.nextDouble();

            res = num1*(Math.pow(Math.PI, 2));
            System.out.println("A área do círculo é: " +res); 
        break;

        default:
            System.out.println("Valor não corresponde as opções");
        break;
        
        }
        
	}

}
