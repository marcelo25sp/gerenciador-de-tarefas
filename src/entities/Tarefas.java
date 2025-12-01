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

	public Tarefas(Integer id, String nome, String descricao, StatusTarefa status, LocalDate dataCriacao,
			LocalDate dataLimite) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
		this.dataCriacao = dataCriacao;
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

	public LocalDate getDataCriacao() {
		return dataCriacao;
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

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public void setDataLimite(LocalDate dataLimite) {
		this.dataLimite = dataLimite;
	}

}
