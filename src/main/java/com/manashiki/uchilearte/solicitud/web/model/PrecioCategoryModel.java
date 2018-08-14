package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PrecioCategoryModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String code;	
	private int value;
	private String descripcion;
	private String descripcionUSD;
	private BigDecimal desde;
	private BigDecimal hasta;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcionUSD() {
		return descripcionUSD;
	}
	public void setDescripcionUSD(String descripcionUSD) {
		this.descripcionUSD = descripcionUSD;
	}
	public BigDecimal getDesde() {
		return desde;
	}
	public void setDesde(BigDecimal desde) {
		this.desde = desde;
	}
	public BigDecimal getHasta() {
		return hasta;
	}
	public void setHasta(BigDecimal hasta) {
		this.hasta = hasta;
	}
	@Override
	public String toString() {
		return "PrecioCategoryModel [code=" + code + ", value=" + value 
				+ ", descripcion=" + descripcion + ", descripcionUSD=" + descripcionUSD 
				+ ", desde" + desde + ", hasta" + hasta
				+ "]";
	}
	
	
	
	

}
