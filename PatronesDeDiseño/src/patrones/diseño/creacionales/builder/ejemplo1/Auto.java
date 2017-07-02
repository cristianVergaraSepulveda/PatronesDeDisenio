package patrones.diseño.creacionales.builder.ejemplo1;

public class Auto {
	
	private int cantidadDePuestas;
	private String modelo;
	private String marca;
	private Motor motor;
	public int getCantidadDePuestas() {
		return cantidadDePuestas;
	}
	public void setCantidadDePuestas(int cantidadDePuestas) {
		this.cantidadDePuestas = cantidadDePuestas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
}
