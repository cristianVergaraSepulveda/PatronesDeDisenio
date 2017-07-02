package patrones.diseño.creacionales.builder.ejemplo1;

public class AutoDirector {
	
	private AutoBuilder autoBuilder;
	
	public void constructorAuto(){
		autoBuilder.crearAuto();
		autoBuilder.buildMarca();
		autoBuilder.buildModelo();
		autoBuilder.buildMotor();
		autoBuilder.buildPuestas();
	}
	
	public void setAutoBuilder(AutoBuilder ab){
		autoBuilder = ab;
	} 
	
	public Auto getAuto(){
		return autoBuilder.getAuto();
	}
}
