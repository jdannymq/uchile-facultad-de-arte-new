package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;
import java.util.List;

public class TripAdvisorModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String rating;
	private String numReviews;
	private String ranking;
	private String ratingImageUrl;
	private String rankingOutOf;
	private String rankingString;
	
	private List<TripAdvisorComentarioModel> comentarios;
	private List<TripAdvisorEstadisticaCalificacionModel> estadisticasCalificacion;
	private List<TripAdvisorEstadisticaTipoViajeModel> estadisticasTipoViaje;
	private List<TripAdvisorPremioModel> premios;
	private List<TripAdvisorResumenCalificacionModel> resumenCalificacion;
	
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getNumReviews() {
		return numReviews;
	}
	public void setNumReviews(String numReviews) {
		this.numReviews = numReviews;
	}
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public String getRatingImageUrl() {
		return ratingImageUrl;
	}
	public void setRatingImageUrl(String ratingImageUrl) {
		this.ratingImageUrl = ratingImageUrl;
	}
	public String getRankingOutOf() {
		return rankingOutOf;
	}
	public void setRankingOutOf(String rankingOutOf) {
		this.rankingOutOf = rankingOutOf;
	}
	public String getRankingString() {
		return rankingString;
	}
	public void setRankingString(String rankingString) {
		this.rankingString = rankingString;
	}
	public List<TripAdvisorComentarioModel> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<TripAdvisorComentarioModel> comentarios) {
		this.comentarios = comentarios;
	}
	public List<TripAdvisorEstadisticaCalificacionModel> getEstadisticasCalificacion() {
		return estadisticasCalificacion;
	}
	public void setEstadisticasCalificacion(List<TripAdvisorEstadisticaCalificacionModel> estadisticasCalificacion) {
		this.estadisticasCalificacion = estadisticasCalificacion;
	}
	public List<TripAdvisorEstadisticaTipoViajeModel> getEstadisticasTipoViaje() {
		return estadisticasTipoViaje;
	}
	public void setEstadisticasTipoViaje(List<TripAdvisorEstadisticaTipoViajeModel> estadisticasTipoViaje) {
		this.estadisticasTipoViaje = estadisticasTipoViaje;
	}
	public List<TripAdvisorPremioModel> getPremios() {
		return premios;
	}
	public void setPremios(List<TripAdvisorPremioModel> premios) {
		this.premios = premios;
	}
	public List<TripAdvisorResumenCalificacionModel> getResumenCalificacion() {
		return resumenCalificacion;
	}
	public void setResumenCalificacion(List<TripAdvisorResumenCalificacionModel> resumenCalificacion) {
		this.resumenCalificacion = resumenCalificacion;
	}
	
	@Override
	public String toString() {
		return "TripAdvisorModel [rating=" + rating + ", numReviews=" + numReviews + 
				", ranking=" + ranking + ", ratingImageUrl=" + ratingImageUrl + 
				", rankingOutOf=" + rankingOutOf +
				", rankingString=" + rankingString +"]";
	}
		
}
