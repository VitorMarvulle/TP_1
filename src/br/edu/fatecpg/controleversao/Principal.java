package br.edu.fatecpg.controleversao;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		int op;
		double num1, num2, res=0;
		Scanner scan = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		Porcentagem porcento = new Porcentagem();
		
		while(true) {
		System.out.println("Digite a opera��o desejada: \n 1 - SOMA" + "\n 2 - SUBTRA��O" + "\n 3 - MULTIPLICA��O" + "\n 4 - DIVIS�O" + "\n 5 - SAIR");
		op = scan.nextInt();
		if (op==5) {
			break;
		}
		
		
		System.out.println("Digite o primeiro valor: ");
		num1= scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		num2= scan.nextDouble();
		
		switch(op) {
		case 1:
			res=calc.soma(num1,num2);
		break;
		case 2:
			res=calc.sub(num1,num2);
		break;
		case 3:
			res=calc.mult(num1,num2);
		break;
		case 4:
			res=calc.div(num1,num2);
		break;
		
		} 
		
		System.out.println(res);
		

		
		}
		System.out.println(porcento.regraDeTres(100, 50, 50));
	}

}
