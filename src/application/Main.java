package application;

import java.util.Locale;
import java.util.Scanner;

import entities.GerenciadorTarefas;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		GerenciadorTarefas gerenciador = new GerenciadorTarefas();
		
		sc.close();

	}

}
