package patrones.diseño.comportamiento.observer;

import java.util.Observable;
import java.util.Observer;

public class ObservadorDeConsola implements Observer{
	
	@Override
	public void update(Observable observable, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("la nueva taza del dolar es:" +
		((TasaDelDolar)observable).getTasaDelDolar());	
	}
}
