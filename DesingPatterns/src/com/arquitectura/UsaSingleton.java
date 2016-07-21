package com.arquitectura;

import com.arquitectura.singleton.Configurador;

public class UsaSingleton {
	public static void main(String[] args) {

		 Configurador c= Configurador.getConfigurador("miurl", "mibaseDatos");

		 System.out.println(c.getUrl());

		 System.out.println(c.getBaseDatos());

		}
}
