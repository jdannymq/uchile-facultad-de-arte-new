package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class CanjePuntosDineroModel implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private String puntosCRM;
	private String dinero;
	private String dineroUSD;
	public String getPuntosCRM() {
		return puntosCRM;
	}
	public void setPuntosCRM(String puntosCRM) {
		this.puntosCRM = puntosCRM;
	}
	public String getDinero() {
		return dinero;
	}
	public void setDinero(String dinero) {
		this.dinero = dinero;
	}
	public String getDineroUSD() {
		return dineroUSD;
	}
	public void setDineroUSD(String dineroUSD) {
		this.dineroUSD = dineroUSD;
	}
	
	

}
