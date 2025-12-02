package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.StatusTarefa;

public class GerenciadorTarefas {

	private List<Tarefas> tarefas = new ArrayList<>();

	public void adicionarTarefa(Tarefas tarefa) {
		tarefas.add(tarefa);
		System.out.println("Tarefa cadastrada!");
	}

	public void removerTarefa(Tarefas tarefa) {
		tarefas.remove(tarefa);
	}

	public void listarTarefas() {
		for(Tarefas x : tarefas) {
			System.out.println(x);
		}

	}

	public void listarPorStatus(StatusTarefa status) {

	}

}
