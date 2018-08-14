package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class TripAdvisorPremioModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String tipoPremio;
	private Integer ano;
	private String imagenDiminuta;
	private String imagenChica;
	private String imagenGrande;
	private String nombre;
	public String getTipoPremio() {
		return tipoPremio;
	}
	public void setTipoPremio(String tipoPremio) {
		this.tipoPremio = tipoPremio;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getImagenDiminuta() {
		return imagenDiminuta;
	}
	public void setImagenDiminuta(String imagenDiminuta) {
		this.imagenDiminuta = imagenDiminuta;
	}
	public String getImagenChica() {
		return imagenChica;
	}
	public void setImagenChica(String imagenChica) {
		this.imagenChica = imagenChica;
	}
	public String getImagenGrande() {
		return imagenGrande;
	}
	public void setImagenGrande(String imagenGrande) {
		this.imagenGrande = imagenGrande;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
