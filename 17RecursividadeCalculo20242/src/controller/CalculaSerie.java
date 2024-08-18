package controller;

public class CalculaSerie {

	public CalculaSerie() {
		super();
	}
	public double calculaSerie(double serie) {
		//Comando de parada
		if(serie == 1) {
			return 1;
		} else {
			return 1/(fatorial(serie)) + calculaSerie(serie - 1); //Chamada de função 
		}
	}
	public double fatorial(double serie) {
		//Comando de parada
		if(serie == 1) {
			return 1;
		} else {
			return serie * (fatorial(serie-1)); //Chamada de função
		}
	}
	

}
