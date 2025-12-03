package entities;

import java.time.LocalDate;

import entities.enums.StatusTarefa;

public class Tarefas {

	private Integer id;
	private String nome;
	private String descricao;
	private StatusTarefa status;
	private LocalDate dataLimite;

	public Tarefas(Integer id, String nome, String descricao, StatusTarefa status, LocalDate dataLimite) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
		this.dataLimite = dataLimite;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public StatusTarefa getStatus() {
		return status;
	}

	public LocalDate getDataLimite() {
		return dataLimite;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setStatus(StatusTarefa status) {
		this.status = status;
	}

	public void setDataLimite(LocalDate dataLimite) {
		this.dataLimite = dataLimite;
	}
	
	public String toString() {
		return "-------------------------------"
			 + "\nId: " + id
			 + "\n - Título: " + nome
			 + "\n - Descrição: " + descricao
			 + "\n - Status: " + status
			 + "\n - Data Limite: " + dataLimite
			 + "\n------------------------------";
	}

	
	
}
