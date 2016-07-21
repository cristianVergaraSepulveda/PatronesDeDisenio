package patrones.diseño.comportamiento.observer;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

public class ObservadorGrafico implements Observer{
	
	@Override
	public void update(Observable observable, Object arg) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"la nueva taza del dolar es:" +
		((TasaDelDolar)observable).getTasaDelDolar());	
	}
}
