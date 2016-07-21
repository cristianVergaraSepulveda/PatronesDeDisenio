package com.arquitectura.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SingletonProperties {

	private static SingletonProperties instancia = null;
	private Properties p;

	private SingletonProperties() {

		p = new Properties();
		try {
			p.load(new FileInputStream(new File("basedatos.properties")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static SingletonProperties getInstancia() {

		if (instancia == null) {

			instancia = new SingletonProperties();
		}
		return instancia;
	}

	public String getPropiedad(String clave) {

		return p.getProperty(clave);
	}
}