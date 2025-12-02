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

	}

	public void listarPorStatus(StatusTarefa status) {

	}

}
