package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class CostosCancelacionPrimerDiaModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String dateValue;
	private String strHour;
	
	public String getDateValue() {
		return dateValue;
	}
	public void setDateValue(String dateValue) {
		this.dateValue = dateValue;
	}
	public String getStrHour() {
		return strHour;
	}
	public void setStrHour(String strHour) {
		this.strHour = strHour;
	}
	
	@Override
	public String toString() {
		
		return "CostosCancelacionPrimerDiaModel [dateValue=" + dateValue + ", strHour=" + strHour + "]";
	}
}
