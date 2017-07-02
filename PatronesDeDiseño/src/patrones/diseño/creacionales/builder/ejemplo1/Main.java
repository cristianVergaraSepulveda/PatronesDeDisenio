package patrones.diseño.creacionales.builder.ejemplo1;

public class Main {
	public static void main(String[] args ){
		AutoDirector fabric = new AutoDirector();
		fabric.setAutoBuilder(new FiatBuilder());
		fabric.constructorAuto();
		Auto auto = fabric.getAuto();
		
		System.out.println(auto.getMarca());
		System.out.println(auto.getModelo());
	}
}
