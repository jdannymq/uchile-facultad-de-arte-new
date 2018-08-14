package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class ReglasModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer desde;
	private Integer hasta;
	private String fechaDesde;
	private String horaDesde;
	private String fechaHasta;
	private String horaHasta;
	private String tipo;
	private Double precioAjustado;
	private Double porcentajePrecio;
	private Double precioPrimeraNoche;
	private Integer numeroNoches;
	private Integer duracionEstadiaDesde;
	private Integer duracionEstadiaHasta;
	private String tipoNocheAplicacion;
	
	public Integer getDesde() {
		return desde;
	}
	public void setDesde(Integer desde) {
		this.desde = desde;
	}
	public Integer getHasta() {
		return hasta;
	}
	public void setHasta(Integer hasta) {
		this.hasta = hasta;
	}
	public String getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public String getHoraDesde() {
		return horaDesde;
	}
	public void setHoraDesde(String horaDesde) {
		this.horaDesde = horaDesde;
	}
	public String getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(String fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public String getHoraHasta() {
		return horaHasta;
	}
	public void setHoraHasta(String horaHasta) {
		this.horaHasta = horaHasta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getPrecioAjustado() {
		return precioAjustado;
	}
	public void setPrecioAjustado(Double precioAjustado) {
		this.precioAjustado = precioAjustado;
	}
	public Double getPorcentajePrecio() {
		return porcentajePrecio;
	}
	public void setPorcentajePrecio(Double porcentajePrecio) {
		this.porcentajePrecio = porcentajePrecio;
	}
	public Double getPrecioPrimeraNoche() {
		return precioPrimeraNoche;
	}
	public void setPrecioPrimeraNoche(Double precioPrimeraNoche) {
		this.precioPrimeraNoche = precioPrimeraNoche;
	}
	public Integer getNumeroNoches() {
		return numeroNoches;
	}
	public void setNumeroNoches(Integer numeroNoches) {
		this.numeroNoches = numeroNoches;
	}
	public Integer getDuracionEstadiaDesde() {
		return duracionEstadiaDesde;
	}
	public void setDuracionEstadiaDesde(Integer duracionEstadiaDesde) {
		this.duracionEstadiaDesde = duracionEstadiaDesde;
	}
	public Integer getDuracionEstadiaHasta() {
		return duracionEstadiaHasta;
	}
	public void setDuracionEstadiaHasta(Integer duracionEstadiaHasta) {
		this.duracionEstadiaHasta = duracionEstadiaHasta;
	}
	public String getTipoNocheAplicacion() {
		return tipoNocheAplicacion;
	}
	public void setTipoNocheAplicacion(String tipoNocheAplicacion) {
		this.tipoNocheAplicacion = tipoNocheAplicacion;
	}
	
	@Override
	public String toString() {
		
		return "ReglasModel [desde=" + desde + ", hasta=" + hasta + ", fechaDesde=" + fechaDesde +
				", horaDesde=" + horaDesde + ", fechaHasta" + fechaHasta + ", horaHasta" + horaHasta +
				", tipo=" + tipo + ", precioAjustado=" + precioAjustado + ", porcentajePrecio=" + porcentajePrecio +
				", precioPrimeraNoche=" + precioPrimeraNoche + ", numeroNoches=" + numeroNoches + 
				", duracionEstadiaDesde=" + duracionEstadiaDesde + ", duracionEstadiaHasta=" + duracionEstadiaHasta + 
				", tipoNocheAplicacion=" + tipoNocheAplicacion + "]";
	}
	
}
