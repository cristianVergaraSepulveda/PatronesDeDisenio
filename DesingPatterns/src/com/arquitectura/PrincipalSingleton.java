package com.arquitectura;

import com.arquitectura.singleton.SingletonProperties;

public class PrincipalSingleton {
	public static void main(String[] args) {		 
		SingletonProperties sp=SingletonProperties.getInstancia();
		System.out.println(sp.getPropiedad("url"));		 
	}
}
