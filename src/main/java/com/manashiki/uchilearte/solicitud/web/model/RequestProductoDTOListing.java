package com.manashiki.uchilearte.solicitud.web.model;

import com.producto.dto.model.request.RequestProductoDTO;

public class RequestProductoDTOListing extends RequestProductoDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fechaInicialStr;
	private String fechaFinalStr;
	/**
	 * @return the fechaFinalStr
	 */
	public String getFechaFinalStr() {
		return fechaFinalStr;
	}
	/**
	 * @param fechaFinalStr the fechaFinalStr to set
	 */
	public void setFechaFinalStr(String fechaFinalStr) {
		this.fechaFinalStr = fechaFinalStr;
	}
	/**
	 * @return the fechaInicialStr
	 */
	public String getFechaInicialStr() {
		return fechaInicialStr;
	}
	/**
	 * @param fechaInicialStr the fechaInicialStr to set
	 */
	public void setFechaInicialStr(String fechaInicialStr) {
		this.fechaInicialStr = fechaInicialStr;
	}
}
