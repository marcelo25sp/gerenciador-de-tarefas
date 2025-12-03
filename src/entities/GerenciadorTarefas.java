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

	public boolean removerTarefa(int id) {
		for (Tarefas x : tarefas) {
			if (x.getId() == id) {
				tarefas.remove(x);
				return true;
			}
		}
		return false;
	}

	public void listarTarefas() {
		if (tarefas.isEmpty()) { 
			System.out.println("Nenhuma tarefa cadastrada!");
		} else {
			for (Tarefas x : tarefas) {
				System.out.println(x);
			}
		}
	}

	public void listarPorStatus(StatusTarefa status) {
		boolean encontrado = false;
		
		for (Tarefas x : tarefas) {
			if (x.getStatus() == status) {
				System.out.println(x);
				encontrado = true;
			}
			
			if(!encontrado) {
				System.out.println("Nenhuma tarefa encontrada com o status mencionado!");
			}
		}

	}

}
