package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class AutoCompleteModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String displayName;
	private String name;
	private String codigo;
	private String tipo;
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
