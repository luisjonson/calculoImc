package com.compra;

public class Produlto {

	private String produlto;
	private double valorProdulto;
	private int quantidadeProduto;

	public String getProdulto() {
		return produlto;
	}

	public void setProdulto(String produlto) {
		this.produlto = produlto;
	}

	public double getValorProdulto() {
		return valorProdulto;
	}

	public void setValorProdulto(double valorProdulto) {
		this.valorProdulto = valorProdulto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	@Override
	public String toString() {
		return "Produlto [produlto=" + produlto + ", valorProdulto=" + valorProdulto + ", quantidadeProduto="
				+ quantidadeProduto + "]";
	}
	
	

}
