package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class DetalleRespuestaModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String mensaje;
	private String urlRestDisponibilidad;
	private String urlRestPoliticas;
	private String urlRestBusqueda;
	private String urlRestAutocomplete;
	private String urlRestComparador;
	private String urlListado;
	private String urlFicha;
	private String urlPago;
	private String urlRestPago;
	private String urlRestFicha;
	private String urlHeader;
	private String urlFooter;
	private boolean exito;
	private String idProducto;
	private Integer idNegocioTransaccional;
	private String urlRedireccinFicha;
	
	private String urlRedireccionNuevaFicha;
	private boolean habilitarUrlNueva; 
	
	
	private String textoFinanciacion;

	private boolean bookingHabilitado;

	private String textoAgotado;

	private String urlFinanciacion;

	private String urlWebCallback;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getUrlRestDisponibilidad() {
		return urlRestDisponibilidad;
	}
	public void setUrlRestDisponibilidad(String urlRestDisponibilidad) {
		this.urlRestDisponibilidad = urlRestDisponibilidad;
	}
	public String getUrlRestPoliticas() {
		return urlRestPoliticas;
	}
	public void setUrlRestPoliticas(String urlRestPoliticas) {
		this.urlRestPoliticas = urlRestPoliticas;
	}
	public String getUrlRestBusqueda() {
		return urlRestBusqueda;
	}
	public void setUrlRestBusqueda(String urlRestBusqueda) {
		this.urlRestBusqueda = urlRestBusqueda;
	}
	public String getUrlRestAutocomplete() {
		return urlRestAutocomplete;
	}
	public void setUrlRestAutocomplete(String urlRestAutocomplete) {
		this.urlRestAutocomplete = urlRestAutocomplete;
	}
	public String getUrlRestComparador() {
		return urlRestComparador;
	}
	public void setUrlRestComparador(String urlRestComparador) {
		this.urlRestComparador = urlRestComparador;
	}
	public String getUrlListado() {
		return urlListado;
	}
	public void setUrlListado(String urlListado) {
		this.urlListado = urlListado;
	}
	public String getUrlFicha() {
		return urlFicha;
	}
	public void setUrlFicha(String urlFicha) {
		this.urlFicha = urlFicha;
	}
	public String getUrlPago() {
		return urlPago;
	}
	public void setUrlPago(String urlPago) {
		this.urlPago = urlPago;
	}
	public String getUrlRestPago() {
		return urlRestPago;
	}
	public void setUrlRestPago(String urlRestPago) {
		this.urlRestPago = urlRestPago;
	}
	public String getUrlRestFicha() {
		return urlRestFicha;
	}
	public void setUrlRestFicha(String urlRestFicha) {
		this.urlRestFicha = urlRestFicha;
	}
	public String getUrlHeader() {
		return urlHeader;
	}
	public void setUrlHeader(String urlHeader) {
		this.urlHeader = urlHeader;
	}
	public String getUrlFooter() {
		return urlFooter;
	}
	public void setUrlFooter(String urlFooter) {
		this.urlFooter = urlFooter;
	}
	public boolean isExito() {
		return exito;
	}
	public void setExito(boolean exito) {
		this.exito = exito;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getIdNegocioTransaccional() {
		return idNegocioTransaccional;
	}
	public void setIdNegocioTransaccional(Integer idNegocioTransaccional) {
		this.idNegocioTransaccional = idNegocioTransaccional;
	}
	public void setTextoFinanciacion(String textoFinanciacion) {
		this.textoFinanciacion = textoFinanciacion;
		
	}
	public String getTextoFinanciacion(){
		return this.textoFinanciacion;
	}
	public void setBookingHabilitado(boolean bookingHabilitado) {
		this.bookingHabilitado = bookingHabilitado;
		
	}
	public boolean isBookingHabilitado() {
		return bookingHabilitado;
	}
	public void setTextoAgotado(String textoAgotado) {
		this.textoAgotado = textoAgotado;
		
	}
	public String getTextoAgotado() {
		return textoAgotado;
	}
	public void setUrlFinanciacion(String urlFinanciacion) {
		this.urlFinanciacion = urlFinanciacion;
		
	}
	public String getUrlFinanciacion() {
		return urlFinanciacion;
	}
	public void setUrlWebCallback(String urlWebCallback) {
		this.urlWebCallback = urlWebCallback;
		
	}
	
	public String getUrlWebCallback() {
		return urlWebCallback;
	}

	public String getUrlRedireccinFicha() {
		return urlRedireccinFicha;
	}
	public void setUrlRedireccinFicha(String urlRedireccinFicha) {
		this.urlRedireccinFicha = urlRedireccinFicha;
	}
	public String getUrlRedireccionNuevaFicha() {
		return urlRedireccionNuevaFicha;
	}
	public void setUrlRedireccionNuevaFicha(String urlRedirecionNuevaFicha) {
		this.urlRedireccionNuevaFicha = urlRedirecionNuevaFicha;
	}
	public boolean isHabilitarUrlNueva() {
		return habilitarUrlNueva;
	}
	public void setHabilitarUrlNueva(boolean habilitarUrlNueva) {
		this.habilitarUrlNueva = habilitarUrlNueva;
	}
	
	
	

}
