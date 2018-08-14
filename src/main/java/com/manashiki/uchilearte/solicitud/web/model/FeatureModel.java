package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class FeatureModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idFeature;
	private String tipoFeature;
	private String descripcionFeature;
	private String imageFeature;
	
	
	public String getIdFeature() {
		return idFeature;
	}
	public void setIdFeature(String idFeature) {
		this.idFeature = idFeature;
	}
	public String getTipoFeature() {
		return tipoFeature;
	}
	public void setTipoFeature(String tipoFeature) {
		this.tipoFeature = tipoFeature;
	}
	public String getDescripcionFeature() {
		return descripcionFeature;
	}
	public void setDescripcionFeature(String descripcionFeature) {
		this.descripcionFeature = descripcionFeature;
	}
	public String getImageFeature() {
		return imageFeature;
	}
	public void setImageFeature(String imageFeature) {
		this.imageFeature = imageFeature;
	}
	
	@Override
	public String toString() {
		return "FeatureModel [idFeature=" + idFeature + ", tipoFeature=" + tipoFeature + 
				", descripcionFeature=" + descripcionFeature + 
				", imageFeature=" + imageFeature + "]";
	}
	
	
}
