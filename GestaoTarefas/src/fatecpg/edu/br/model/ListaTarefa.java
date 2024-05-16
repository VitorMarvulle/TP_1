package fatecpg.edu.br.model;

import fatecpg.edu.br.model.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> tarefas = new ArrayList<>();
	
	public ListaTarefa() {
		
	}
	
	//construtor que recebe como parâmetro uma lista da classe Tarefa
	public ListaTarefa(List<Tarefa> listaTarefas) {
		this.tarefas = listaTarefas;
	}
	
	//método que adiciona uma tarefa na lista
	public void addTarefa(Tarefa tarefa) { 
		this.tarefas.add(tarefa);
	}
	
	//método que adiciona a lista toda
	public void addTarefa(List<Tarefa> tarefas) {
		this.tarefas.addAll(tarefas);
	}
	
	public void printTarefas() {
		System.out.println("***GERENCIADOR DE TAREFAS*** \n");
		this.tarefas.forEach(t -> System.out.println( "Tarefa nº " + (tarefas.indexOf(t)+1) + t ));
	}

	@Override
	public String toString() {
		return "ListaTarefa [tarefas=" + tarefas + "]";
	}

}
