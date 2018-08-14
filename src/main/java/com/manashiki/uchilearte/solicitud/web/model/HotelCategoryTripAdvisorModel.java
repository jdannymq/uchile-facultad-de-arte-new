package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class HotelCategoryTripAdvisorModel implements Serializable{
	
	private static final long serialVersionUID = 1148968377439684149L;

	
	private float value;
	private String urlImagen;
	private int cantidadHoteles;
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	/**
	 * @return the cantidadHoteles
	 */
	public int getCantidadHoteles() {
		return cantidadHoteles;
	}
	/**
	 * @param cantidadHoteles the cantidadHoteles to set
	 */
	public void setCantidadHoteles(int cantidadHoteles) {
		this.cantidadHoteles = cantidadHoteles;
	}

	
}
