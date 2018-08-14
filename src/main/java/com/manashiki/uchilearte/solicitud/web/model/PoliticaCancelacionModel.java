package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;
import java.util.List;

public class PoliticaCancelacionModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String currencyCode;
	private String descripcion;
	private CostosCancelacionPrimerDiaModel primerDiaCostosCancelacion;
	private List<ReglasModel> reglas;
	private List<DescripcionPoliticaCancelacionModel> lstDescripcionPoliticaCancelacion;
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public CostosCancelacionPrimerDiaModel getPrimerDiaCostosCancelacion() {
		return primerDiaCostosCancelacion;
	}
	public void setPrimerDiaCostosCancelacion(CostosCancelacionPrimerDiaModel primerDiaCostosCancelacion) {
		this.primerDiaCostosCancelacion = primerDiaCostosCancelacion;
	}
	public List<ReglasModel> getReglas() {
		return reglas;
	}
	public void setReglas(List<ReglasModel> reglas) {
		this.reglas = reglas;
	}
	public List<DescripcionPoliticaCancelacionModel> getLstDescripcionPoliticaCancelacion() {
		return lstDescripcionPoliticaCancelacion;
	}
	public void setLstDescripcionPoliticaCancelacion(
			List<DescripcionPoliticaCancelacionModel> lstDescripcionPoliticaCancelacion) {
		this.lstDescripcionPoliticaCancelacion = lstDescripcionPoliticaCancelacion;
	}

	@Override
	public String toString() {
		return "PoliticaCancelacionModel [currencyCode=" + currencyCode +  
				", descripcion" + descripcion + "]";
	}

}
