package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class HotelCategoryModel implements Serializable{
	
	private static final long serialVersionUID = 1148968377439684149L;

	private String code;	
	private int value;
	private String descripcion;

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
	
	@Override
	public String toString() {
		return "HotelCategoryModel [code=" + code + ", value=" + value + "]";
	}
	
}
