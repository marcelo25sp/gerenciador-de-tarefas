package application;

import java.util.Locale;
import java.util.Scanner;

import entities.GerenciadorTarefas;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		GerenciadorTarefas gerenciador = new GerenciadorTarefas();

		int opcao = -1; // solução provisória forçando a iniciar o bloco de repetição while

		while (opcao != 0) {
			System.out.println("=======GERENCIADOR DE TAREFAS=======");
			System.out.println();
			System.out.println("1 - Cadastrar tarefa");
			System.out.println("2 - Remover tarefa");
			System.out.println("3 - Listar tarefas");
			System.out.println("4 - Listar tarefas por status");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
		}

		sc.close();

	}

}
