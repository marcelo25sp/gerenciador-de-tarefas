package application;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entities.GerenciadorTarefas;
import entities.Tarefas;
import entities.enums.StatusTarefa;

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

			opcao = sc.nextInt();
			System.out.println();

			switch (opcao) {
			case 1:
				System.out.println("===Cadastrar tarefa===");
				System.out.println();

				System.out.print("Id: ");
				int id = sc.nextInt();
				sc.nextLine(); // consumindo a quebra de linha
				
				System.out.print("Título: ");
				String titulo = sc.nextLine();
				
				System.out.print("Descrição: ");
				String descricao = sc.nextLine();
				
				System.out.print("Status (PENDENTE/EM_ANDAMENTO/CONCLUIDO): ");
				String statusStr = sc.nextLine();
				StatusTarefa status = StatusTarefa.valueOf(statusStr);

				LocalDate dataLimite = null;
				while (dataLimite == null) {
					System.out.print("Data limite:(AAAA/MM/DD) ");
					String dataStr = sc.nextLine().trim();
					try {
						dataLimite = LocalDate.parse(dataStr);
					} catch (Exception e) {
						System.out.println("Formato inválido: Tente novamente!");
					}
				}

				Tarefas novaTarefa = new Tarefas(id, titulo, descricao, status, dataLimite);
				gerenciador.adicionarTarefa(novaTarefa);

				System.out.println();
				break;
				
			case 2:
				System.out.println("===Remover tarefa===");
				System.out.println();
				
				System.out.print("Entre com o Id da tarefa a ser removida: ");
				int idRemover = sc.nextInt();
				sc.nextLine();
				
				boolean removido = gerenciador.removerTarefa(idRemover); 
				
				if(removido) {
					System.out.println("Tarefa removida com sucesso!");
				}else {
					System.out.println("Tarefa não encontrada!");
				}
				
				System.out.println();
				break;

			}

		}

		sc.close();

	}

}
