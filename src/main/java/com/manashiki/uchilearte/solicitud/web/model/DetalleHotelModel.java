package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class DetalleHotelModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String fuenteDescripcionCorta;
	private String fuenteDescripcionLarga;
	private String fuenteImagenes;
	private String fuenteFeatureHOT;
	private String fuenteFeatureROO;
	private String fuentePOI;
	private String proveedor;
	private boolean optimo;
	private int idProducto;
	private int idBusqueda;
	private int idNegocio;
	private int idDetalle;
	
	public String getFuenteDescripcionCorta() {
		return fuenteDescripcionCorta;
	}
	public void setFuenteDescripcionCorta(String fuenteDescripcionCorta) {
		this.fuenteDescripcionCorta = fuenteDescripcionCorta;
	}
	public String getFuenteDescripcionLarga() {
		return fuenteDescripcionLarga;
	}
	public void setFuenteDescripcionLarga(String fuenteDescripcionLarga) {
		this.fuenteDescripcionLarga = fuenteDescripcionLarga;
	}
	public String getFuenteImagenes() {
		return fuenteImagenes;
	}
	public void setFuenteImagenes(String fuenteImagenes) {
		this.fuenteImagenes = fuenteImagenes;
	}
	public String getFuenteFeatureHOT() {
		return fuenteFeatureHOT;
	}
	public void setFuenteFeatureHOT(String fuenteFeatureHOT) {
		this.fuenteFeatureHOT = fuenteFeatureHOT;
	}
	public String getFuenteFeatureROO() {
		return fuenteFeatureROO;
	}
	public void setFuenteFeatureROO(String fuenteFeatureROO) {
		this.fuenteFeatureROO = fuenteFeatureROO;
	}
	public String getFuentePOI() {
		return fuentePOI;
	}
	public void setFuentePOI(String fuentePOI) {
		this.fuentePOI = fuentePOI;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public boolean isOptimo() {
		return optimo;
	}
	public void setOptimo(boolean optimo) {
		this.optimo = optimo;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getIdBusqueda() {
		return idBusqueda;
	}
	public void setIdBusqueda(int idBusqueda) {
		this.idBusqueda = idBusqueda;
	}
	public int getIdNegocio() {
		return idNegocio;
	}
	public void setIdNegocio(int idNegocio) {
		this.idNegocio = idNegocio;
	}
	public int getIdDetalle() {
		return idDetalle;
	}
	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}
	@Override
	public String toString() {
		
		return "DetalleHotelModel [fuenteDescripcionCorta=" + fuenteDescripcionCorta + ", fuenteDescripcionLarga=" + fuenteDescripcionLarga + 
				", fuenteFeatureHOT=" + fuenteFeatureHOT + ", fuenteFeatureROO" + fuenteFeatureROO + ", fuenteImagenes" + fuenteImagenes +
				", fuentePOI=" + fuentePOI + ", proveedor=" + proveedor + ", optimo=" + optimo + 
				", idProducto=" + idProducto + ", idBusqueda=" + idBusqueda + ", idNegocio=" + idNegocio + 
				", idDetalle=" + idDetalle + "]";
	}
	
	
	
}
