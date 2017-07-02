package patrones.diseño.creacionales.builder.ejemplo1;

public class FordBuilder extends AutoBuilder{

	@Override
	public void buildMotor() {
	Motor  motor = new Motor();
	motor.setNumero(9876);
	motor.setPotencia("20 HP");
		
	}

	@Override
	public void buildModelo() {
		auto.setModelo("Focus");
	}

	@Override
	public void buildMarca() {
		auto.setMarca("Ford");		
	}

	@Override
	public void buildPuestas() {
		auto.setCantidadDePuestas(4);
		
	}
	
	
}
