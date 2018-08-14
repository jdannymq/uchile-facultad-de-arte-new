package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class HotelAtributoModel implements Serializable{

	private static final long serialVersionUID = -2096501056931784309L;
	
	private String idAtributo;	
	private String descripcionAtributo;
	private String imagenAtributo;
	private int value;
	
	public String getIdAtributo() {
		return idAtributo;
	}
	public void setIdAtributo(String idAtributo) {
		this.idAtributo = idAtributo;
	}
	public String getDescripcionAtributo() {
		return descripcionAtributo;
	}
	public void setDescripcionAtributo(String descripcionAtributo) {
		this.descripcionAtributo = descripcionAtributo;
	}
	public String getImagenAtributo() {
		return imagenAtributo;
	}
	public void setImagenAtributo(String imagenAtributo) {
		this.imagenAtributo = imagenAtributo;
	}

	@Override
	public String toString() {
		return "HotelAtributoModel [idAtributo=" + idAtributo + ", descripcionAtributo=" + descripcionAtributo + 
				", imagenAtributo=" + imagenAtributo + "]";
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
