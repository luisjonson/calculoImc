package cursojava.exercutavel;

import java.text.DecimalFormat;

public class CalcularImc {
	DecimalFormat formato = new DecimalFormat("0.00");

	private double imc;
	
	public double calcularMassa(double peso, double altura) {

		imc = peso / (altura * altura);
		
		double formantandoVigula = Double.valueOf(formato.format(imc).replace(".", ",").replace(",", "."));
	
		if (imc < 16.00) {
			System.out.println("Baixo do peso grau III " + formantandoVigula);
		} else if (imc >= 16.00 && imc <= 16.99) {

			System.out.println(
					"Baixo do peso grau II " + formantandoVigula);
		} else if (imc >= 17.00 && imc <= 18.49) {
			System.out.println(
					"Baixo do peso grau I " + formantandoVigula);

		} else if (imc >= 18.50 && imc <= 24.99) {
			System.out.println("Peso ideal " + formantandoVigula);

		} else if (imc >= 25.00 && imc <= 29.99) {
			System.out
					.println("Sobre o peso " + formantandoVigula);

		} else if (imc >= 30.00 && imc <= 34.99) {
			System.out.println(
					"Obesidade grau I " + formantandoVigula);

		} else if (imc >= 35.00 && imc <= 39.99) {
			System.out.println(
					"Obesidade grau II " + formantandoVigula);

		} else if (imc >= 40.00) {
			System.out.println(
					"Obesidade grau III" + formantandoVigula);

		}

		return formantandoVigula;
	}
}
