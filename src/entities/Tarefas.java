package entities;

import java.time.LocalDate;

import entities.enums.StatusTarefa;

public class Tarefas {
	
	private Integer id;
	private String nome;
	private String descricao;
	private StatusTarefa status;
	private LocalDate dataCriacao;
	private LocalDate dataLimite;
	

}
