package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;
import java.util.List;

public class HotelResultModel implements Serializable{

	private static final long serialVersionUID = 2099023100127429382L;
	
	private HotelModel hotelBuscado;
	
	private List<HotelModel> listHotelModel;
	
	private HotelBusquedaParametrosModel hotelBusquedaParametrosModel;
	
	private List<HotelCategoryModel> listaHotelesXEstrella;
	
	private List<PrecioCategoryModel> listaCategoriasPrecio;
	
	private List<CurrencyCategoryModel> listadoCurrencys;
	
	private DetalleRespuestaModel detalleRespuesta;

	private List<HotelAtributoModel> listaCategoriasAtributo;
	
	private List<HotelCategoryTripAdvisorModel> listaCategoriasTripAdvisor;

	private boolean tieneEtiquetaRecomendado;

	private List<HotelBoardModel> listadoBoard;
	
	/*atributos para google analitys*/
	private String hotelTipoError;
	private String hotelPaginaError;
	
	/*muestra descuento o no para argentina + banner*/
	private boolean descuento;
	private boolean bannerCyber;
	
	/*se agrega la distribuccion de los parametros para la nueva ficha*/
	private String distribuccionNuevaFicha;
	
	
	
	
	public boolean isBannerCyber() {
		return bannerCyber;
	}
	public void setBannerCyber(boolean bannerCyber) {
		this.bannerCyber = bannerCyber;
	}
	public boolean isDescuento() {
		return descuento;
	}
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}
	public String getHotelTipoError() {
		return hotelTipoError;
	}
	public void setHotelTipoError(String hotelTipoError) {
		this.hotelTipoError = hotelTipoError;
	}
	public String getHotelPaginaError() {
		return hotelPaginaError;
	}
	public void setHotelPaginaError(String hotelPaginaError) {
		this.hotelPaginaError = hotelPaginaError;
	}
	

	public List<HotelModel> getListHotelModel() {
		return listHotelModel;
	}

	public void setListHotelModel(List<HotelModel> listHotelModel) {
		this.listHotelModel = listHotelModel;
	}

	public HotelBusquedaParametrosModel getHotelBusquedaParametrosModel() {
		return hotelBusquedaParametrosModel;
	}

	public void setHotelBusquedaParametrosModel(HotelBusquedaParametrosModel hotelBusquedaParametrosModel) {
		this.hotelBusquedaParametrosModel = hotelBusquedaParametrosModel;
	}

	public List<HotelCategoryModel> getListaHotelesXEstrella() {
		return listaHotelesXEstrella;
	}

	public void setListaHotelesXEstrella(List<HotelCategoryModel> listaHotelesXEstrella) {
		this.listaHotelesXEstrella = listaHotelesXEstrella;
	}

	public List<PrecioCategoryModel> getListaCategoriasPrecio() {
		return listaCategoriasPrecio;
	}

	public void setListaCategoriasPrecio(List<PrecioCategoryModel> listaCategoriasPrecio) {
		this.listaCategoriasPrecio = listaCategoriasPrecio;
	}

	public List<CurrencyCategoryModel> getListadoCurrencys() {
		return listadoCurrencys;
	}

	public void setListadoCurrencys(List<CurrencyCategoryModel> listadoCurrencys) {
		this.listadoCurrencys = listadoCurrencys;
	}

	public DetalleRespuestaModel getDetalleRespuesta() {
		return detalleRespuesta;
	}

	public void setDetalleRespuesta(DetalleRespuestaModel detalleRespuesta) {
		this.detalleRespuesta = detalleRespuesta;
	}

	public void setListaCategoriaAtributo(
			List<HotelAtributoModel> listadoAtributo) {
	this.listaCategoriasAtributo = listadoAtributo;
		
	}

	public List<HotelAtributoModel> getListaCategoriasAtributo() {
		return listaCategoriasAtributo;
	}

	public HotelModel getHotelBuscado() {
		return hotelBuscado;
	}

	public void setHotelBuscado(HotelModel hotelBuscado) {
		this.hotelBuscado = hotelBuscado;
	}

	public void setTieneEtiquetaRecomendado(boolean tieneEtiquetaRecomendado) {
		this.tieneEtiquetaRecomendado = tieneEtiquetaRecomendado;
		
	}
	public boolean getTieneEtiquetaRecomendado(){
		return this.tieneEtiquetaRecomendado;
	}

	public void setListaCategoriasTripAdvisor(
			List<HotelCategoryTripAdvisorModel> listaCategoriasTripAdvisor) {
		this.listaCategoriasTripAdvisor = listaCategoriasTripAdvisor;
	}
	
	public List<HotelCategoryTripAdvisorModel> getListaCategoriasTripAdvisor(){
		return this.listaCategoriasTripAdvisor;
	}

	public void setListaBoard(List<HotelBoardModel> listadoBoard) {
		this.listadoBoard = listadoBoard;
		
	}
	
	public List<HotelBoardModel> getListaBoard() {
		return this.listadoBoard;
		
	}
	public String getDistribuccionNuevaFicha() {
		return distribuccionNuevaFicha;
	}
	public void setDistribuccionNuevaFicha(String distribuccionNuevaFicha) {
		this.distribuccionNuevaFicha = distribuccionNuevaFicha;
	}

	
	
	
	
	
}
