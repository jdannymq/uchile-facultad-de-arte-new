package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class HotelOpcionHabitacionModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nombreHabitacion;
	private String descripcionHabitacion;
	private String unidadesHabitacion;
	private String sourceHabitacion;
	
	public String getNombreHabitacion() {
		return nombreHabitacion;
	}
	public void setNombreHabitacion(String nombreHabitacion) {
		this.nombreHabitacion = nombreHabitacion;
	}
	public String getDescripcionHabitacion() {
		return descripcionHabitacion;
	}
	public void setDescripcionHabitacion(String descripcionHabitacion) {
		this.descripcionHabitacion = descripcionHabitacion;
	}
	public String getUnidadesHabitacion() {
		return unidadesHabitacion;
	}
	public void setUnidadesHabitacion(String unidadesHabitacion) {
		this.unidadesHabitacion = unidadesHabitacion;
	}
	public String getSourceHabitacion() {
		return sourceHabitacion;
	}
	public void setSourceHabitacion(String sourceHabitacion) {
		this.sourceHabitacion = sourceHabitacion;
	}
	
	@Override
	public String toString() {
		return "HotelOpcionHabitacionModel [nombreHabitacion=" + nombreHabitacion + ", descripcionHabitacion=" + descripcionHabitacion + 
				", unidadesHabitacion=" + unidadesHabitacion + ", sourceHabitacion=" + sourceHabitacion +
				"]";
	}

}
