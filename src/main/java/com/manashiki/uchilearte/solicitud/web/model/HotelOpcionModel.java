package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;
import java.util.List;

public class HotelOpcionModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String ratePlanCode;
	private String boardHabitacion;
	private String tipoBoardHabitacion;
	private String bookingCode;
	private String statusBookingCode;
	private String expiracionBookingCode;
	private boolean seleccionada;
	private PoliticaCancelacionModel politicasCancelacion;
	private List<PrecioHotelModel> lstPrecioHotelModel;
	private List<HotelOpcionHabitacionModel> lstOpcionHabitacionModel;
	private List<FeatureModel> lstFeatureHabitacionModel;
	private List<String> comments;
	private boolean loading;
	private String textoPoliticaCancelacion;	

	public String getRatePlanCode() {
		return ratePlanCode;
	}
	public String getTextoPoliticaCancelacion() {
		return textoPoliticaCancelacion;
	}
	public void setTextoPoliticaCancelacion(String textoPoliticaCancelacion) {
		this.textoPoliticaCancelacion = textoPoliticaCancelacion;
	}
	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}
	public String getBoardHabitacion() {
		return boardHabitacion;
	}
	public void setBoardHabitacion(String boardHabitacion) {
		this.boardHabitacion = boardHabitacion;
	}
	public String getTipoBoardHabitacion() {
		return tipoBoardHabitacion;
	}
	public void setTipoBoardHabitacion(String tipoBoardHabitacion) {
		this.tipoBoardHabitacion = tipoBoardHabitacion;
	}
	public String getBookingCode() {
		return bookingCode;
	}
	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}
	public String getStatusBookingCode() {
		return statusBookingCode;
	}
	public void setStatusBookingCode(String statusBookingCode) {
		this.statusBookingCode = statusBookingCode;
	}
	public String getExpiracionBookingCode() {
		return expiracionBookingCode;
	}
	public void setExpiracionBookingCode(String expiracionBookingCode) {
		this.expiracionBookingCode = expiracionBookingCode;
	}
	public boolean isSeleccionada() {
		return seleccionada;
	}
	public void setSeleccionada(boolean seleccionada) {
		this.seleccionada = seleccionada;
	}
	public PoliticaCancelacionModel getPoliticasCancelacion() {
		return politicasCancelacion;
	}
	public void setPoliticasCancelacion(PoliticaCancelacionModel politicasCancelacion) {
		this.politicasCancelacion = politicasCancelacion;
	}
	public List<PrecioHotelModel> getLstPrecioHotelModel() {
		return lstPrecioHotelModel;
	}
	public void setLstPrecioHotelModel(List<PrecioHotelModel> lstPrecioHotelModel) {
		this.lstPrecioHotelModel = lstPrecioHotelModel;
	}
	public List<HotelOpcionHabitacionModel> getLstOpcionHabitacionModel() {
		return lstOpcionHabitacionModel;
	}
	public void setLstOpcionHabitacionModel(List<HotelOpcionHabitacionModel> lstOpcionHabitacionModel) {
		this.lstOpcionHabitacionModel = lstOpcionHabitacionModel;
	}
	public boolean isLoading() {
		return loading;
	}
	public void setLoading(boolean loading) {
		this.loading = loading;
	}
	
	public List<FeatureModel> getLstFeatureHabitacionModel() {
		return lstFeatureHabitacionModel;
	}
	public void setLstFeatureHabitacionModel(
			List<FeatureModel> lstFeatureHabitacionModel) {
		this.lstFeatureHabitacionModel = lstFeatureHabitacionModel;
	}
	@Override
	public String toString() {
		return "HotelOpcionModel [boardHabitacion=" + boardHabitacion + ", tipoBoardHabitacion=" + tipoBoardHabitacion + 
				", bookingCode=" + bookingCode + ", statusBookingCode=" + statusBookingCode +
				", expiracionBookingCode=" + expiracionBookingCode + ", ratePlanCode=" + ratePlanCode + 
				", seleccionada=" + seleccionada + ", loading=" + loading + "]";
	}
	/**
	 * @return the comments
	 */
	public List<String> getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	
}
