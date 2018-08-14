package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;
import java.util.List;

public class PrecioHotelModel implements Serializable {

	private static final long serialVersionUID = 1L;
	/****NOTA DE DISCULPA, COLOQUE LOS ATRIBUTOS, SOLO PARA SACARLA D:****/
	/****VALE POR UN SUPER 8 ****/
	private String precioTotal;
	private Double precioTotalDouble;
	private String currency;
	private String simboloCurrency;
	private String precioPorNoche;
	private String precioPorNocheDecimal;
	private String acumulacionCrmPuntos;
	private String descripcionPromocion;
	private String precioAntes;
	private String precioImpuestoNeto;
	private Double precioImpuestoNetoDouble;
	private String precioTotalNeto;
	private Double precioTotalNetoDouble;
	private String precioTotalNetoNuevo;
	private String strPrecioTotalDecimales;
	private String strPrecioTotalFinalDecimales;
	
	private List<ConversionPuntosCMRModel> listaConversionPuntosCMRModel;
	private ConversionPuntosCMRModel conversionSeleccionada;
	
	/***********************/
	private Double precioAntesTotalDouble;
    private String precioAntesNetoHotel;
    private Double precioAntesNetoDouble;
    private String precioAntesCmrPuntosHotel;
    private Double precioAntesCmrPuntosDouble;
    private Double precioPorNocheTotalDouble;
    private String precioPorNocheNetoHotel;
    private Double precioPorNocheNetoDouble;
    private String precioPorNocheCmrPuntosHotel;
    private Double precioPorNocheCmrPuntosDouble;
    private String precioAntesPorNocheTotalHotel;
    private Double precioAntesPorNocheTotalDouble;
    private String precioAntesPorNocheNetoHotel;
    private Double precioAntesPorNocheNetoDouble;
    private String precioAntesPorNocheCmrPuntosHotel;
    private Double precioAntesPorNocheCmrPuntosDouble;
    /************************/
	

	private String precioAntesNeto;

	private String precioAntesPorNoche;

	private String precioAntesPorNocheNeto;

	private String precioPorNocheNeto;
	
	public String getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(String precioTotal) {
		this.precioTotal = precioTotal;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getSimboloCurrency() {
		return simboloCurrency;
	}
	public void setSimboloCurrency(String simboloCurrency) {
		this.simboloCurrency = simboloCurrency;
	}
	public String getPrecioPorNoche() {
		return precioPorNoche;
	}
	public void setPrecioPorNoche(String precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}
	public String getAcumulacionCrmPuntos() {
		return acumulacionCrmPuntos;
	}
	public void setAcumulacionCrmPuntos(String acumulacionCrmPuntos) {
		this.acumulacionCrmPuntos = acumulacionCrmPuntos;
	}
	public String getDescripcionPromocion() {
		return descripcionPromocion;
	}
	public void setDescripcionPromocion(String descripcionPromocion) {
		this.descripcionPromocion = descripcionPromocion;
	}
	public String getPrecioAntes() {
		return precioAntes;
	}
	public void setPrecioAntes(String precioAntes) {
		this.precioAntes = precioAntes;
	}
	public Double getPrecioTotalDouble() {
		return precioTotalDouble;
	}
	public void setPrecioTotalDouble(Double precioTotalDouble) {
		this.precioTotalDouble = precioTotalDouble;
	}
	public String getPrecioImpuestoNeto() {
		return precioImpuestoNeto;
	}
	public void setPrecioImpuestoNeto(String precioImpuestoNeto) {
		this.precioImpuestoNeto = precioImpuestoNeto;
	}
	public Double getPrecioImpuestoNetoDouble() {
		return precioImpuestoNetoDouble;
	}
	public void setPrecioImpuestoNetoDouble(Double precioImpuestoNetoDouble) {
		this.precioImpuestoNetoDouble = precioImpuestoNetoDouble;
	}
	public String getPrecioTotalNeto() {
		return precioTotalNeto;
	}
	public void setPrecioTotalNeto(String precioTotalNeto) {
		this.precioTotalNeto = precioTotalNeto;
	}
	public Double getPrecioTotalNetoDouble() {
		return precioTotalNetoDouble;
	}
	public void setPrecioTotalNetoDouble(Double precioTotalNetoDouble) {
		this.precioTotalNetoDouble = precioTotalNetoDouble;
	}
	public String toString() {
		return "PrecioHotelModel [precioTotal=" + precioTotal + ", currency=" + currency
				+ ", simboloCurrency=" + simboloCurrency + ", precioPorNoche=" + precioPorNoche + ", acumulacionCrmPuntos="
				+ acumulacionCrmPuntos + ", descripcionPromocion=" + descripcionPromocion
				+ ", precioAntes=" + precioAntes + ", precioTotalDouble=" + precioTotalDouble 
				+ ", precioImpuestoNeto=" + precioImpuestoNeto + ", precioImpuestoNetoDouble=" + precioImpuestoNetoDouble 
				+ ", precioTotalNeto=" + precioTotalNeto + ", precioTotalNetoDouble=" + precioTotalNetoDouble 
				+ "]";
	}
	public void setListaConversionPuntosCMRModel(List<ConversionPuntosCMRModel> listaConversionPuntosCMRModel) {
		this.listaConversionPuntosCMRModel = listaConversionPuntosCMRModel;
	}
	public List<ConversionPuntosCMRModel> getListaConversionPuntosCMRModel(){
		return this.listaConversionPuntosCMRModel;
	}
	public ConversionPuntosCMRModel getConversionSeleccionada() {
		return conversionSeleccionada;
	}
	public void setConversionSeleccionada(ConversionPuntosCMRModel conversionSeleccionada) {
		this.conversionSeleccionada = conversionSeleccionada;
	}
	public void setPrecioAntesNeto(String precioAntesNeto) {
		this.precioAntesNeto = precioAntesNeto;
		
	}
	public void setPrecioAntesPorNoche(String precioAntesPorNoche) {
		this.precioAntesPorNoche = precioAntesPorNoche;
		
	}
	public void setPrecioAntesPorNocheNeto(String precioAntesPorNocheNeto) {
		this.precioAntesPorNocheNeto = precioAntesPorNocheNeto;
		
	}
	public void setPrecioPorNocheNeto(String precioPorNocheNeto) {
		this.precioPorNocheNeto = precioPorNocheNeto;
		
	}
	public String getPrecioAntesNeto() {
		return precioAntesNeto;
	}
	public String getPrecioAntesPorNoche() {
		return precioAntesPorNoche;
	}
	public String getPrecioAntesPorNocheNeto() {
		return precioAntesPorNocheNeto;
	}
	public String getPrecioPorNocheNeto() {
		return precioPorNocheNeto;
	}
	/******** Booking Argentina ***************/
	/******** Booking Argentina ***************/
	public Double getPrecioAntesTotalDouble() {
		return precioAntesTotalDouble;
	}
	public void setPrecioAntesTotalDouble(Double precioAntesTotalDouble) {
		this.precioAntesTotalDouble = precioAntesTotalDouble;
	}
	public String getPrecioAntesNetoHotel() {
		return precioAntesNetoHotel;
	}
	public void setPrecioAntesNetoHotel(String precioAntesNetoHotel) {
		this.precioAntesNetoHotel = precioAntesNetoHotel;
	}
	public Double getPrecioAntesNetoDouble() {
		return precioAntesNetoDouble;
	}
	public void setPrecioAntesNetoDouble(Double precioAntesNetoDouble) {
		this.precioAntesNetoDouble = precioAntesNetoDouble;
	}
	public String getPrecioAntesCmrPuntosHotel() {
		return precioAntesCmrPuntosHotel;
	}
	public void setPrecioAntesCmrPuntosHotel(String precioAntesCmrPuntosHotel) {
		this.precioAntesCmrPuntosHotel = precioAntesCmrPuntosHotel;
	}
	public Double getPrecioAntesCmrPuntosDouble() {
		return precioAntesCmrPuntosDouble;
	}
	public void setPrecioAntesCmrPuntosDouble(Double precioAntesCmrPuntosDouble) {
		this.precioAntesCmrPuntosDouble = precioAntesCmrPuntosDouble;
	}
	public Double getPrecioPorNocheTotalDouble() {
		return precioPorNocheTotalDouble;
	}
	public void setPrecioPorNocheTotalDouble(Double precioPorNocheTotalDouble) {
		this.precioPorNocheTotalDouble = precioPorNocheTotalDouble;
	}
	public String getPrecioPorNocheNetoHotel() {
		return precioPorNocheNetoHotel;
	}
	public void setPrecioPorNocheNetoHotel(String precioPorNocheNetoHotel) {
		this.precioPorNocheNetoHotel = precioPorNocheNetoHotel;
	}
	public Double getPrecioPorNocheNetoDouble() {
		return precioPorNocheNetoDouble;
	}
	public void setPrecioPorNocheNetoDouble(Double precioPorNocheNetoDouble) {
		this.precioPorNocheNetoDouble = precioPorNocheNetoDouble;
	}
	public String getPrecioPorNocheCmrPuntosHotel() {
		return precioPorNocheCmrPuntosHotel;
	}
	public void setPrecioPorNocheCmrPuntosHotel(String precioPorNocheCmrPuntosHotel) {
		this.precioPorNocheCmrPuntosHotel = precioPorNocheCmrPuntosHotel;
	}
	public Double getPrecioPorNocheCmrPuntosDouble() {
		return precioPorNocheCmrPuntosDouble;
	}
	public void setPrecioPorNocheCmrPuntosDouble(
			Double precioPorNocheCmrPuntosDouble) {
		this.precioPorNocheCmrPuntosDouble = precioPorNocheCmrPuntosDouble;
	}
	public String getPrecioAntesPorNocheTotalHotel() {
		return precioAntesPorNocheTotalHotel;
	}
	public void setPrecioAntesPorNocheTotalHotel(
			String precioAntesPorNocheTotalHotel) {
		this.precioAntesPorNocheTotalHotel = precioAntesPorNocheTotalHotel;
	}
	public Double getPrecioAntesPorNocheTotalDouble() {
		return precioAntesPorNocheTotalDouble;
	}
	public void setPrecioAntesPorNocheTotalDouble(
			Double precioAntesPorNocheTotalDouble) {
		this.precioAntesPorNocheTotalDouble = precioAntesPorNocheTotalDouble;
	}
	public String getPrecioAntesPorNocheNetoHotel() {
		return precioAntesPorNocheNetoHotel;
	}
	public void setPrecioAntesPorNocheNetoHotel(String precioAntesPorNocheNetoHotel) {
		this.precioAntesPorNocheNetoHotel = precioAntesPorNocheNetoHotel;
	}
	public Double getPrecioAntesPorNocheNetoDouble() {
		return precioAntesPorNocheNetoDouble;
	}
	public void setPrecioAntesPorNocheNetoDouble(
			Double precioAntesPorNocheNetoDouble) {
		this.precioAntesPorNocheNetoDouble = precioAntesPorNocheNetoDouble;
	}
	public String getPrecioAntesPorNocheCmrPuntosHotel() {
		return precioAntesPorNocheCmrPuntosHotel;
	}
	public void setPrecioAntesPorNocheCmrPuntosHotel(
			String precioAntesPorNocheCmrPuntosHotel) {
		this.precioAntesPorNocheCmrPuntosHotel = precioAntesPorNocheCmrPuntosHotel;
	}
	public Double getPrecioAntesPorNocheCmrPuntosDouble() {
		return precioAntesPorNocheCmrPuntosDouble;
	}
	public void setPrecioAntesPorNocheCmrPuntosDouble(
			Double precioAntesPorNocheCmrPuntosDouble) {
		this.precioAntesPorNocheCmrPuntosDouble = precioAntesPorNocheCmrPuntosDouble;
	}
	public String getStrPrecioTotalDecimales() {
		return strPrecioTotalDecimales;
	}
	public void setStrPrecioTotalDecimales(String strPrecioTotalDecimales) {
		this.strPrecioTotalDecimales = strPrecioTotalDecimales;
	}
	
	public String getStrPrecioTotalFinalDecimales() {
		return strPrecioTotalFinalDecimales;
	}
	public void setStrPrecioTotalFinalDecimales(String strPrecioTotalFinalDecimales) {
		this.strPrecioTotalFinalDecimales = strPrecioTotalFinalDecimales;
	}
	public String getPrecioTotalNetoNuevo() {
		return precioTotalNetoNuevo;
	}
	public void setPrecioTotalNetoNuevo(String precioTotalNetoNuevo) {
		this.precioTotalNetoNuevo = precioTotalNetoNuevo;
	}
	public String getPrecioPorNocheDecimal() {
		return precioPorNocheDecimal;
	}
	public void setPrecioPorNocheDecimal(String precioPorNocheDecimal) {
		this.precioPorNocheDecimal = precioPorNocheDecimal;
	}
	


}
