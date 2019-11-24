package com.compra;

import java.util.ArrayList;
import java.util.List;

public class CasaLista {

	private String nome;

	List<Produlto> produltos = new ArrayList<Produlto>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produlto> getProdultos() {
		return produltos;
	}

	public void setProdultos(List<Produlto> produltos) {
		this.produltos = produltos;
	}

}
