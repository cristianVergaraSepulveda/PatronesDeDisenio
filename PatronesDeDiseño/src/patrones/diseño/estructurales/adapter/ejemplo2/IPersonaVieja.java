package patrones.diseño.estructurales.adapter.ejemplo2;

import java.util.Date;

public interface IPersonaVieja {
	String getNombre();
	void setNombre(String nombre);
	String getApellido();
	public void setApellido(String apellido);
	Date getFechaNacimiento();
	void setFechaNacimiento(Date fechaNacimiento);
}
