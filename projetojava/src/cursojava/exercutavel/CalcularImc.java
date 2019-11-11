package cursojava.exercutavel;

import java.text.DecimalFormat;

public class CalcularImc {
	DecimalFormat formato = new DecimalFormat("0.00");

	public double calcularMassa(double peso, double altura) {
		double imc = 0;
		imc = peso / (altura * altura);

		if (imc < 16.00) {
			System.out.println("Baixo do peso grau III " + imc);
		} else if (imc >= 16.00 && imc <= 16.99) {

			System.out.println("Baixo do peso grau II " + imc);
		} else if (imc >= 17.00 && imc <= 18.49) {
			System.out.println("Baixo do peso grau I " + imc);

		} else if (imc >= 18.50 && imc <= 24.99) {
			System.out.println("Peso ideal " + imc);

		} else if (imc >= 25.00 && imc <= 29.99) {
			System.out.println("Sobre o peso " + imc);

		} else if (imc >= 30.00 && imc <= 34.99) {
			System.out.println("Obesidade grau I " + imc);

		} else if (imc >= 35.00 && imc <= 39.99) {
			System.out.println("Obesidade grau II " + imc);

		} else if (imc >= 40.00) {
			System.out.println("Obesidade grau III" + imc);

		}

		return imc;
	}
}
