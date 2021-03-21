package com.dizzy.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String titulo;

	@Column(nullable = false)
	private String autor;

	@Column
	private Long numeroPaginas;
	
	@Column
	private Long anoPublicacao;
	
	@Column
	private String editora;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Long getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Long numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public Long getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Long anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
