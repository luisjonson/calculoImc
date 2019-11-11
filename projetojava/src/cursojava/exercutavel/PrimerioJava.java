package cursojava.exercutavel;

import javax.swing.JOptionPane;

public class PrimerioJava {
	public static void main(String[] args) {

		try {
			CalcularImc imc = new CalcularImc();

			double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));

			double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));

			System.out.println("Seu peso é: " + peso + " Kg");
			System.out.println("A Sua Altura é: " + altura + " cm");

			System.out.println(" ");

			System.out.println("Resultado do calculo: " + imc.calcularMassa(peso, altura));

		} catch (Exception e) {
			e.getMessage();
		}

	}

}
