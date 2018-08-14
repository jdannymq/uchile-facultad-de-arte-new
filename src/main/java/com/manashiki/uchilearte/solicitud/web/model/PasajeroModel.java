package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class PasajeroModel  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "PasajeroModel [edad=" + edad +  "]";
	}
	
}
