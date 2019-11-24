package com.compra;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Produlto produlto = new Produlto();
		CasaLista casaLista = new CasaLista();

		String opcao = JOptionPane.showInputDialog("Digite qualquer coisa para entra ou digite 'sair' para finalizar.");

		if(opcao == "sair") {

			String nomePessoa = JOptionPane.showInputDialog("Digite seu Nome. ");

			String nomeProdulto = JOptionPane.showInputDialog("Adicione um produlto.");
			String valorProdulto = JOptionPane.showInputDialog("Digite o valor R$.");
			String qunatidadeProdulto = JOptionPane.showInputDialog("quantidade do produlto. ");

			casaLista.setNome(nomePessoa);
			produlto.setProdulto(nomeProdulto);
			produlto.setValorProdulto(Double.valueOf(valorProdulto));
			produlto.setQuantidadeProduto(Integer.valueOf(qunatidadeProdulto));

			casaLista.getProdultos().add(produlto);
			
			System.out.println(casaLista.getNome());
			System.out.println(produlto);

		}else {
			System.out.println("Fim ");
		}

		

	}

}
