package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;
import java.util.List;

import com.manashiki.uchilearte.solicitud.dto.ErrorDto;
import com.manashiki.uchilearte.solicitud.web.type.BusquedaType;

public class HotelBusquedaParametrosModel implements Serializable{
	
	private static final long serialVersionUID = -414163785003351894L;

	private String fechaInicio;
	
	private String fechaFin;
	
	private String codigoPortal;
	
	private String ciudadHotelBusqueda;
	
	private String codigoBusqueda; //este mantener Fijo.
	
	private int cantidadDias;
	
	private int cantidadHoteles;
	
	private int cantidadTotalHabitaciones;
	
	private int cantidadTotalAdultos;
	
	private int cantidadTotalNinios;
	
	private int filtroEstrellas;
	
	private int idConversionSeleccionada;
	
	private BusquedaType tipoBusqueda;
	
	private ZonaModel zonaModel; //Busqueda de Codigo de Zona Siempre debe ser este
	
	private List<HotelHabitacionModel> lstHotelHabitacionModel;
	
	private String filtroRegimen;
	
	private ErrorDto respuestaError;
	
	private boolean todasOpciones;
	
	private String distribucion;
	
	private String llamado;
	

	public boolean isTodasOpciones() {
		return todasOpciones;
	}

	public void setTodasOpciones(boolean todasOpciones) {
		this.todasOpciones = todasOpciones;
	}

	public ErrorDto getRespuestaError() {
		return respuestaError;
	}

	public void setRespuestaError(ErrorDto respuestaError) {
		this.respuestaError = respuestaError;
	}

	public String getFiltroRegimen() {
		return filtroRegimen;
	}

	public void setFiltroRegimen(String filtroRegimen) {
		this.filtroRegimen = filtroRegimen;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getCodigoPortal() {
		return codigoPortal;
	}

	public void setCodigoPortal(String codigoPortal) {
		this.codigoPortal = codigoPortal;
	}

	public String getCiudadHotelBusqueda() {
		return ciudadHotelBusqueda;
	}

	public void setCiudadHotelBusqueda(String ciudadHotelBusqueda) {
		this.ciudadHotelBusqueda = ciudadHotelBusqueda;
	}

	public String getCodigoBusqueda() {
		return codigoBusqueda;
	}

	public void setCodigoBusqueda(String codigoBusqueda) {
		this.codigoBusqueda = codigoBusqueda;
	}

	public int getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	public int getCantidadHoteles() {
		return cantidadHoteles;
	}

	public void setCantidadHoteles(int cantidadHoteles) {
		this.cantidadHoteles = cantidadHoteles;
	}

	public int getCantidadTotalHabitaciones() {
		return cantidadTotalHabitaciones;
	}

	public void setCantidadTotalHabitaciones(int cantidadTotalHabitaciones) {
		this.cantidadTotalHabitaciones = cantidadTotalHabitaciones;
	}

	public int getCantidadTotalAdultos() {
		return cantidadTotalAdultos;
	}

	public void setCantidadTotalAdultos(int cantidadTotalAdultos) {
		this.cantidadTotalAdultos = cantidadTotalAdultos;
	}

	public int getCantidadTotalNinios() {
		return cantidadTotalNinios;
	}

	public void setCantidadTotalNinios(int cantidadTotalNinios) {
		this.cantidadTotalNinios = cantidadTotalNinios;
	}
	
	public int getFiltroEstrellas() {
		return filtroEstrellas;
	}

	public void setFiltroEstrellas(int filtroEstrellas) {
		this.filtroEstrellas = filtroEstrellas;
	}

	public BusquedaType getTipoBusqueda() {
		return tipoBusqueda;
	}

	public void setTipoBusqueda(BusquedaType tipoBusqueda) {
		this.tipoBusqueda = tipoBusqueda;
	}

	public ZonaModel getZonaModel() {
		return zonaModel;
	}

	public void setZonaModel(ZonaModel zonaModel) {
		this.zonaModel = zonaModel;
	}

	public List<HotelHabitacionModel> getLstHotelHabitacionModel() {
		return lstHotelHabitacionModel;
	}

	public void setLstHotelHabitacionModel(List<HotelHabitacionModel> lstHotelHabitacionModel) {
		this.lstHotelHabitacionModel = lstHotelHabitacionModel;
	}

	@Override
	public String toString() {
		return "HotelBusquedaParametrosModel [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", ciudadHotelBusqueda=" + ciudadHotelBusqueda + ", cantidadDias=" + cantidadDias  
				+ ", codigoBusqueda=" + codigoBusqueda
				+ ", cantidadHoteles=" + cantidadHoteles + ", cantidadTotalHabitaciones=" + cantidadTotalHabitaciones 
				+ ", cantidadTotalAdultos=" + cantidadTotalAdultos + ", cantidadTotalNinios=" + cantidadTotalNinios
				+ ", zonaModel=" + zonaModel + ", lstHotelHabitacionModel=" + lstHotelHabitacionModel 
				+ "]";
	}

	public int getIdConversionSeleccionada() {
		return idConversionSeleccionada;
	}

	public void setIdConversionSeleccionada(int idConversionSeleccionada) {
		this.idConversionSeleccionada = idConversionSeleccionada;
	}

	/**
	 * @return the distribucion
	 */
	public String getDistribucion() {
		return distribucion;
	}

	/**
	 * @param distribucion the distribucion to set
	 */
	public void setDistribucion(String distribucion) {
		this.distribucion = distribucion;
	}
	
	/**
	 * @param llamado the llamado to get
	 */
	public String getLlamado() {
		return llamado;
	}

	/**
	 * @param llamado the llamado to set
	 */
	public void setLlamado(String llamado) {
		this.llamado = llamado;
	}
	
	
	

}
