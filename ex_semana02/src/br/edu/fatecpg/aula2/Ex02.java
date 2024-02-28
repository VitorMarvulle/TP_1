package br.edu.fatecpg.aula2;

public class Ex02 {

	public static void main(String[] args) {
		String[][] matriz1 = new String[6][2];
		String login = "Vitor";
		String senha = "java123";
		boolean check = false;
		
		OperacoesMatriz.addMatriz_stg(matriz1, 1);
		check = OperacoesMatriz.verificaMatriz(matriz1, login, senha);
		OperacoesMatriz.printMatriz(matriz1);
		
		if (check) {
			System.out.println("Login e Senha corretos!");
		}else {
			System.out.println("Login e Senha Inválidos!");
		}
		
		
	}

}
