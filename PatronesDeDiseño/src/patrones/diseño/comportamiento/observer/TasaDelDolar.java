package patrones.diseño.comportamiento.observer;

import java.util.Observable;

public class TasaDelDolar extends Observable{
	
	private double tasaDelDolar;

	public double getTasaDelDolar() {
		return tasaDelDolar;
	}

	public void setTasaDelDolar(double tasaDelDolar) {
		this.tasaDelDolar = tasaDelDolar;
		setChanged();
	}
	
}
