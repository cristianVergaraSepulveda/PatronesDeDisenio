package patrones.diseño.creacionales.prototype;

public class Main {

	public static void main(String[] args) throws Exception{
		TvPrototype tvp = new TvPrototype();
		TV tv = (TV)tvp.prototipos("plasma");
		System.out.println(tv.getMarca());
		System.out.println(tv.getPrecio());
	}
}
