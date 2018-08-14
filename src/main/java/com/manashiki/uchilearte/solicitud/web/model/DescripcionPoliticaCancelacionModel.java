package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class DescripcionPoliticaCancelacionModel implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private int ordenDescripcionRegla;
	private boolean reglaNueva; 
	private String descripcionCancelacion;
	
	public int getOrdenDescripcionRegla() {
		return ordenDescripcionRegla;
	}
	public void setOrdenDescripcionRegla(int ordenDescripcionRegla) {
		this.ordenDescripcionRegla = ordenDescripcionRegla;
	}
	public boolean isReglaNueva() {
		return reglaNueva;
	}
	public void setReglaNueva(boolean reglaNueva) {
		this.reglaNueva = reglaNueva;
	}
	public String getDescripcionCancelacion() {
		return descripcionCancelacion;
	}
	public void setDescripcionCancelacion(String descripcionCancelacion) {
		this.descripcionCancelacion = descripcionCancelacion;
	}
	
	@Override
	public String toString() {
		
		return "DescripcionPoliticaCancelacionModel [ordenDescripcionRegla=" + ordenDescripcionRegla + 
				", reglaNueva=" + reglaNueva + ", descripcionCancelacion=" + descripcionCancelacion + "]";
	}
}
