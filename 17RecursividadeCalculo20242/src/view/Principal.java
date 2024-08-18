package view;

import controller.CalculaSerie;

public class Principal {

	public static void main(String[] args) {
		CalculaSerie calc = new CalculaSerie();
		double serie = 10;
		double resultado = calc.calculaSerie(serie);
		System.out.println(resultado);
	}

}
