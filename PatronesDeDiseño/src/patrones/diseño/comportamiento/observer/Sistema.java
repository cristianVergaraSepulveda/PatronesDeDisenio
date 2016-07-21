package patrones.diseño.comportamiento.observer;

public class Sistema {

	/**
	 * @param args
	 * @author Cristian
	 * @version 1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TasaDelDolar tasa= new TasaDelDolar();
		ObservadorDeConsola observadorDeConsola = new ObservadorDeConsola();
		ObservadorGrafico observadorGrafico =  new ObservadorGrafico();
		tasa.addObserver(observadorDeConsola);
		tasa.addObserver(observadorGrafico);
		tasa.setTasaDelDolar(36.10);
		tasa.notifyObservers();
	}

}
