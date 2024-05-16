package fatecpg.edu.br.main;

import java.util.ArrayList;
import java.util.List;

import fatecpg.edu.br.model.ListaTarefa;
import fatecpg.edu.br.model.Tarefa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tarefa tarefa1 = new Tarefa(001, "Estudar Java", false);
		Tarefa tarefa2 = new Tarefa(002, "Correr na praia", false);
		Tarefa tarefa3 = new Tarefa(003, "Estudar PHP", false);
		
		//criando a lista de tarefas e adicionando um por vez
		List<Tarefa> tarefas = new ArrayList<>();
		tarefas.add(tarefa1);
		tarefas.add(tarefa2);
		tarefas.add(tarefa3);
		
		//instanciando objeto lista1 para receber a lista criada anteriormente ^
		ListaTarefa lista1 = new ListaTarefa(tarefas); 
		
		//lista1.addTarefa(tarefas); //método que adiciona todos os elementos na classe ListaTarefa
		
		tarefa1.setConcluida(true); //marcar tarefa como concluída
		lista1.printTarefas();
		
		//removendo uma tarefa da lista
		tarefas.remove(tarefa1); 
		
		lista1.printTarefas();
		
	}

}
