package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;

public class HotelBoardModel implements Serializable{

	private static final long serialVersionUID = -2096501056931784309L;
	
	private String idBoard;	
	private String descripcionBoard;
	private int value;
	

	public String getIdBoard() {
		return idBoard;
	}
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
	public String getDescripcionBoard() {
		return descripcionBoard;
	}
	public void setDescripcionBoard(String descripcionBoard) {
		this.descripcionBoard = descripcionBoard;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
