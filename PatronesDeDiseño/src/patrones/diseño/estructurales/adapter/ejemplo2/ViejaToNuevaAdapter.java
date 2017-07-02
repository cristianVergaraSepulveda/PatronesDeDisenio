package patrones.diseño.estructurales.adapter.ejemplo2;

public class ViejaToNuevaAdapter implements IPersonaNueva{
private PersonaVieja personaVieja;

public ViejaToNuevaAdapter(PersonaVieja personaVieja) {
	super();
	this.personaVieja = personaVieja;
}

@Override
public String getNombre() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setNombre(String nombre) {
	// TODO Auto-generated method stub
	
}

@Override
public int getEdad() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void setEdad(int edad) {
	// TODO Auto-generated method stub
	
}

	
}
