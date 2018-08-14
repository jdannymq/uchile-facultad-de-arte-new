package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class TripAdvisorComentarioModel implements Serializable{

	private static final long serialVersionUID = 7369810522298605182L;
	private Integer tripAdvisorReviewId;
	private String hotelCode;
	private String publishedDate;
	private String lang;
	private String rating;
	private Integer helpfulVotes;
	private String ratingImageUrl;
	private String tripType;
	private String travelDate;
	private String text;
	private String username;
	private String usernameLocation;
	private String title;
	
	public Integer getTripAdvisorReviewId() {
		return tripAdvisorReviewId;
	}
	public void setTripAdvisorReviewId(Integer tripAdvisorReviewId) {
		this.tripAdvisorReviewId = tripAdvisorReviewId;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Integer getHelpfulVotes() {
		return helpfulVotes;
	}
	public void setHelpfulVotes(Integer helpfulVotes) {
		this.helpfulVotes = helpfulVotes;
	}
	public String getRatingImageUrl() {
		return ratingImageUrl;
	}
	public void setRatingImageUrl(String ratingImageUrl) {
		this.ratingImageUrl = ratingImageUrl;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsernameLocation() {
		return usernameLocation;
	}
	public void setUsernameLocation(String usernameLocation) {
		this.usernameLocation = usernameLocation;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
