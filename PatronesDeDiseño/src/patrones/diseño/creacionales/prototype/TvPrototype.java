package patrones.diseño.creacionales.prototype;

import java.util.HashMap;

public class TvPrototype {
	private HashMap<String, TV> prototipos = new HashMap<String, TV>();
	
	public TvPrototype(){
		Plasma plasma = new Plasma("Sony",21, "Plateado", 399.99, 90, 0.05);
		LCD lcd = new LCD("Panasonic", 42,"plateado", 599.99, 20,0.1);
		
		// lo ideal es crear 2 metodos para agregae  y quitar prototipos
		
		prototipos.put("Plasma", plasma);
		prototipos.put("LCD", lcd);
		
		
	}
	public Object prototipos (String tipo) throws CloneNotSupportedException{
		return prototipos.get(tipo).clone();
	}
}
