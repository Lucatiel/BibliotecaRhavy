package br.edu.ifpb;

import javax.persistence.*;

@Entity
public class Volume {
	
	@Id
	private String titulo;
	private String autores;
	private String descricao;
	private String tipovolume;
	private String num_paginas;
	private String ano;
	private String editora;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutores() {
		return autores;
	}
	
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getTipovolume() {
		return tipovolume;
	}
	
	public void setTipovolume(String tipovolume) {
		this.tipovolume = tipovolume;
	}
	
	public String getNum_paginas() {
		return num_paginas;
	}
	
	public void setNum_paginas(String num_paginas) {
		this.num_paginas = num_paginas;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String string) {
		this.ano = string;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}
