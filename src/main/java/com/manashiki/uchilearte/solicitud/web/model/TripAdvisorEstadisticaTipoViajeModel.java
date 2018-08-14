package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class TripAdvisorEstadisticaTipoViajeModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer ratingStadisticsId;
	private String hotelCode;
	private String name;
	private String value;
	private String localizedName;
	private String imageUrl;
	
	public Integer getRatingStadisticsId() {
		return ratingStadisticsId;
	}
	public void setRatingStadisticsId(Integer ratingStadisticsId) {
		this.ratingStadisticsId = ratingStadisticsId;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getLocalizedName() {
		return localizedName;
	}
	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	
}
