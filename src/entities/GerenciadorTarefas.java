package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.StatusTarefa;

/*
 * Classe responsável por gerenciar a lista de tarefas (CRUD básico)
 */

public class GerenciadorTarefas {

	private List<Tarefas> tarefas = new ArrayList<>();

	// o usuário adiciona uma tarefa na lista
	public void adicionarTarefa(Tarefas tarefa) {
		tarefas.add(tarefa);
		System.out.println("Tarefa cadastrada!");
	}

	// remove uma tarefa da lista através do Id solicitado pelo usuário
	public boolean removerTarefa(int id) {
		for (Tarefas x : tarefas) {
			if (x.getId() == id) {
				tarefas.remove(x);
				return true;
			}
		}
		return false;
	}

	//método que retorna o número de tarefas cadastradas
	public int getTotalTarefas() {
		return tarefas.size();
	}

	// método que retorna a lista de tarefas cadastradas 
	public void listarTarefas() {
		if (tarefas.isEmpty()) { // essa instrução verifica se a lista está vazia
			System.out.println("Nenhuma tarefa cadastrada!");
		} else {
			System.out.println("===Todas as tarefas cadastradas===");
			System.out.println("==================================");
			for (Tarefas x : tarefas) {
				System.out.println(x);
			}
		}
	}

	/*
	 * Esse método filtra e exibe as tarefas definidas pelo status informado pelo usuário
	 * Caso nenhuma tarefa for encontrada, será exibido uma mensagem ao usuário
	 */	
	public void listarPorStatus(StatusTarefa status) {
		boolean encontrado = false;

		System.out.println("===Tarefas com status: " + status + " ===");
		System.out.println("=========================================");

		for (Tarefas x : tarefas) {
			if (x.getStatus() == status) {
				System.out.println(x);
				encontrado = true;
			}

		}

		if (!encontrado) {
			System.out.println("Nenhuma tarefa encontrada com o status mencionado!");
		}

	}

}
