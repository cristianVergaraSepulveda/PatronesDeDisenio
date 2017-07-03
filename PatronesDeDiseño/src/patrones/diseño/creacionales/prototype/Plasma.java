package patrones.diseño.creacionales.prototype;

public class Plasma extends TV{
	private double anguloVisual;
	private double tiempoRespuesta;
	
	
	
	public Plasma(String marca, int pulgadas, String color, double precio, double anguloVisual,
			double tiempoRespuesta) {
		super(marca, pulgadas, color, precio);
		setAnguloVisual(anguloVisual);
		setTiempoRespuesta(tiempoRespuesta);
	}
	public double getAnguloVisual() {
		return anguloVisual;
	}
	public void setAnguloVisual(double anguloVisual) {
		this.anguloVisual = anguloVisual;
	}
	public double getTiempoRespuesta() {
		return tiempoRespuesta;
	}
	public void setTiempoRespuesta(double tiempoRespuesta) {
		this.tiempoRespuesta = tiempoRespuesta;
	}
	
	
	
	
	
	
}
