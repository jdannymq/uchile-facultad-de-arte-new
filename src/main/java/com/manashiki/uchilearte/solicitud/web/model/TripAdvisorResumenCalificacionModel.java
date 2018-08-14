package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class TripAdvisorResumenCalificacionModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer ratingCountId;
	private String hotelCode;
	private Integer starNumber;
	private Integer value;
	private String porcentaje;
	
	public Integer getRatingCountId() {
		return ratingCountId;
	}
	public void setRatingCountId(Integer ratingCountId) {
		this.ratingCountId = ratingCountId;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public Integer getStarNumber() {
		return starNumber;
	}
	public void setStarNumber(Integer starNumber) {
		this.starNumber = starNumber;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
	
	
}
