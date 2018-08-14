package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.producto.dto.model.hoteles.HotelEtiquetaViewDTO;
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String codigoHotel;
	private String nombreHotel;
	private String descripcionCortaHotel;
	private String descripcionLargaHotel;
	private String direccionHotel;
	private String latitudGeograficaHotel;
	private String longitudGeograficaHotel;
	private String categoriaHotel;
	private String categoriaPrecio;
	private Double precioTotal;
	private List<String> listaImagenes;
	private String cantidadAdultos;
	private String cantidadNinhos;
	private String inicioEstadia;
	private String finEstadia;
	private String noches;
	private String proveedor;
	private TripAdvisorModel tripAdvisorModel;
	private DetalleHotelModel detalleHotelModel;
	private List<HotelOpcionModel> lstHotelOpcionModel;
	private List<HotelAtributoModel> lstHotelAtributoModel;
	private List<PuntosInteresModel> lstPuntosInteresModel;
	private List<FeatureModel> lstFeatureModel;
//	private List<FeatureModel> lstFeatureHabitacionModel;
	private List<CanjePuntosDineroModel> lstCanjePuntosDineroModel;
	private boolean comparar;
	private boolean compararAdvertencia;
	private boolean nacional;
	private boolean buscado;
	private String opciones;
	private String registroPoliticaCancelacion;
	private List<HotelEtiquetaViewDTO> listaEtiquetas;


	private boolean resultadoTieneEtiqueta;

	private boolean tieneEtiquetaRecomendado;
	
	/*atributos para google analitys*/
	private String hotelTipoError;
	private String hotelPaginaError;
	
	/*varible de descuendo para argentina*/
	private boolean descuento;

	/*varible de banner cyber para argentina*/
	private boolean bannerCyber;
	
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
	public String getRegistroPoliticaCancelacion() {
		return registroPoliticaCancelacion;
	}
	public void setRegistroPoliticaCancelacion(String registroPoliticaCancelacion) {
		this.registroPoliticaCancelacion = registroPoliticaCancelacion;
	}
	
	public String getCodigoHotel() {
		return codigoHotel;
	}
	public void setCodigoHotel(String codigoHotel) {
		this.codigoHotel = codigoHotel;
	}
	public String getNombreHotel() {
		return nombreHotel;
	}
	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}
	public String getDescripcionCortaHotel() {
		return descripcionCortaHotel;
	}
	public void setDescripcionCortaHotel(String descripcionCortaHotel) {
		this.descripcionCortaHotel = descripcionCortaHotel;
	}
	public String getDescripcionLargaHotel() {
		return descripcionLargaHotel;
	}
	public void setDescripcionLargaHotel(String descripcionLargaHotel) {
		this.descripcionLargaHotel = descripcionLargaHotel;
	}
	public String getDireccionHotel() {
		return direccionHotel;
	}
	public void setDireccionHotel(String direccionHotel) {
		this.direccionHotel = direccionHotel;
	}
	public String getLatitudGeograficaHotel() {
		return latitudGeograficaHotel;
	}
	public void setLatitudGeograficaHotel(String latitudGeograficaHotel) {
		this.latitudGeograficaHotel = latitudGeograficaHotel;
	}
	public String getLongitudGeograficaHotel() {
		return longitudGeograficaHotel;
	}
	public void setLongitudGeograficaHotel(String longitudGeograficaHotel) {
		this.longitudGeograficaHotel = longitudGeograficaHotel;
	}
	public String getCategoriaHotel() {
		return categoriaHotel;
	}
	public void setCategoriaHotel(String categoriaHotel) {
		this.categoriaHotel = categoriaHotel;
	}
	public String getCategoriaPrecio() {
		return categoriaPrecio;
	}
	public void setCategoriaPrecio(String categoriaPrecio) {
		this.categoriaPrecio = categoriaPrecio;
	}
	public List<String> getListaImagenes() {
		return listaImagenes;
	}
	public void setListaImagenes(List<String> listaImagenes) {
		this.listaImagenes = listaImagenes;
	}
	public String getCantidadAdultos() {
		return cantidadAdultos;
	}
	public void setCantidadAdultos(String cantidadAdultos) {
		this.cantidadAdultos = cantidadAdultos;
	}
	public String getCantidadNinhos() {
		return cantidadNinhos;
	}
	public void setCantidadNinhos(String cantidadNinhos) {
		this.cantidadNinhos = cantidadNinhos;
	}
	public String getInicioEstadia() {
		return inicioEstadia;
	}
	public void setInicioEstadia(String inicioEstadia) {
		this.inicioEstadia = inicioEstadia;
	}
	public String getFinEstadia() {
		return finEstadia;
	}
	public void setFinEstadia(String finEstadia) {
		this.finEstadia = finEstadia;
	}
	public String getNoches() {
		return noches;
	}
	public void setNoches(String noches) {
		this.noches = noches;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public Double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}	
	public TripAdvisorModel getTripAdvisorModel() {
		return tripAdvisorModel;
	}
	public void setTripAdvisorModel(TripAdvisorModel tripAdvisorModel) {
		this.tripAdvisorModel = tripAdvisorModel;
	}
	public DetalleHotelModel getDetalleHotelModel() {
		return detalleHotelModel;
	}	
	public void setDetalleHotelModel(DetalleHotelModel detalleHotelModel) {
		this.detalleHotelModel = detalleHotelModel;
	}	
	public List<HotelOpcionModel> getLstHotelOpcionModel() {
		return lstHotelOpcionModel;
	}
	public void setLstHotelOpcionModel(List<HotelOpcionModel> lstHotelOpcionModel) {
		this.lstHotelOpcionModel = lstHotelOpcionModel;
	}
	public List<HotelAtributoModel> getLstHotelAtributoModel() {
		return lstHotelAtributoModel;
	}
	public void setLstHotelAtributoModel(List<HotelAtributoModel> lstHotelAtributoModel) {
		this.lstHotelAtributoModel = lstHotelAtributoModel;
	}
	public List<PuntosInteresModel> getLstPuntosInteresModel() {
		return lstPuntosInteresModel;
	}
	public void setLstPuntosInteresModel(List<PuntosInteresModel> lstPuntosInteresModel) {
		this.lstPuntosInteresModel = lstPuntosInteresModel;
	}
	public List<FeatureModel> getLstFeatureModel() {
		return lstFeatureModel;
	}
	public void setLstFeatureModel(List<FeatureModel> lstFeatureModel) {
		this.lstFeatureModel = lstFeatureModel;
	}
//	public List<FeatureModel> getLstFeatureHabitacionModel() {
//		return lstFeatureHabitacionModel;
//	}
//	public void setLstFeatureHabitacionModel(List<FeatureModel> lstFeatureHabitacionModel) {
//		this.lstFeatureHabitacionModel = lstFeatureHabitacionModel;
//	}
	public boolean isComparar() {
		return comparar;
	}
	public void setComparar(boolean comparar) {
		this.comparar = comparar;
	}
	public boolean isCompararAdvertencia() {
		return compararAdvertencia;
	}
	public void setCompararAdvertencia(boolean compararAdvertencia) {
		this.compararAdvertencia = compararAdvertencia;
	}
	public List<CanjePuntosDineroModel> getLstCanjePuntosDineroModel() {
		return lstCanjePuntosDineroModel;
	}
	public void setLstCanjePuntosDineroModel(List<CanjePuntosDineroModel> lstCanjePuntosDineroModel) {
		this.lstCanjePuntosDineroModel = lstCanjePuntosDineroModel;
	}
	
	public boolean isNacional() {
		return nacional;
	}
	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}
	public boolean isBuscado() {
		return buscado;
	}
	public void setBuscado(boolean buscado) {
		this.buscado = buscado;
	}
	@Override
	public String toString() {
		return "HotelAtributoModel [codigoHotel=" + codigoHotel + ", nombreHotel=" + nombreHotel + 
				", descripcionCortaHotel=" + descripcionCortaHotel + ", descripcionLargaHotel" + descripcionLargaHotel + 
				", direccionHotel=" + direccionHotel + 
				", latitudGeograficaHotel=" + latitudGeograficaHotel + ", longitudGeograficaHotel=" + longitudGeograficaHotel + 
				", categoriaHotel=" + categoriaHotel + ", cantidadAdultos=" + cantidadAdultos + 
				", cantidadNinhos=" + cantidadNinhos + ", inicioEstadia=" + inicioEstadia + 
				", inicioEstadia=" + inicioEstadia + ", finEstadia=" + finEstadia + 
				", noches=" + noches + "]";
	}
	public List<HotelEtiquetaViewDTO> getListaEtiquetas() {
		return listaEtiquetas;
	}
	public void setListaEtiquetas(List<HotelEtiquetaViewDTO> listaHotelEtiquetaViewDTO) {
		this.listaEtiquetas = listaHotelEtiquetaViewDTO;
	}
	public void setResultadoTieneEtiqueta(boolean estaHotelRecomendado) {
		this.resultadoTieneEtiqueta = estaHotelRecomendado;
		
	}
	public boolean getResultadoTieneEtiqueta(){
		return this.resultadoTieneEtiqueta;
	}
	public void setTieneEtiquetaRecomendado(boolean tieneEtiquetaRecomendado) {
		this.tieneEtiquetaRecomendado = tieneEtiquetaRecomendado;
		
	}
	public boolean getTieneEtiquetaRecomendado(){
		return this.tieneEtiquetaRecomendado;
	}
	/**
	 * @return the opciones
	 */
	public String getOpciones() {
		return opciones;
	}
	/**
	 * @param opciones the opciones to set
	 */
	public void setOpciones(String opciones) {
		this.opciones = opciones;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
