package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class PuntosInteresModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String idPuntoInteres;
	private String nombrePuntosInteres;
	private String distancia;
	
	
	public String getIdPuntoInteres() {
		return idPuntoInteres;
	}
	public void setIdPuntoInteres(String idPuntoInteres) {
		this.idPuntoInteres = idPuntoInteres;
	}
	public String getNombrePuntosInteres() {
		return nombrePuntosInteres;
	}
	public void setNombrePuntosInteres(String nombrePuntosInteres) {
		this.nombrePuntosInteres = nombrePuntosInteres;
	}
	public String getDistancia() {
		return distancia;
	}
	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}
	
	@Override
	public String toString() {
		return "PuntosInteresModel [nombrePuntosInteres=" + nombrePuntosInteres + 
				", distancia=" + distancia + ", idPuntoInteres=" + idPuntoInteres + "]";
	}

	
}
