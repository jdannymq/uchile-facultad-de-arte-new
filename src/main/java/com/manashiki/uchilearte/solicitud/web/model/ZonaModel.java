package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class ZonaModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String zoneCode;
	private String name;
	private Boolean nacional;
	
	public String getZoneCode() {
		return zoneCode;
	}
	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ZonaModel [zoneCode=" + zoneCode + ", name=" + name + "]";
	}
	/**
	 * @return the nacional
	 */
	public Boolean getNacional() {
		return nacional;
	}
	/**
	 * @param nacional the nacional to set
	 */
	public void setNacional(Boolean nacional) {
		this.nacional = nacional;
	}
	
	
	

}
