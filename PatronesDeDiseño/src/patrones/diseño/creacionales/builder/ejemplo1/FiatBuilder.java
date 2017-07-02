package patrones.diseño.creacionales.builder.ejemplo1;

public class FiatBuilder extends AutoBuilder{

	public void buildMarca(){
		auto.setMarca("Fiat");
	}
	
	public void buildModelo(){
		auto.setModelo("palio");
	}
	
	public void buildMotor(){
		Motor motor= new Motor();
		motor.setNumero(1235);
		motor.setPotencia("23 HP");
		auto.setMotor(motor);
	}
	
	public void buildPuestas(){
		auto.setCantidadDePuestas(2);
	}
}
