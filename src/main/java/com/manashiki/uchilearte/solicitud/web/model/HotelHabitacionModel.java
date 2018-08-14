package com.manashiki.uchilearte.solicitud.web.model;

import java.io.Serializable;
import java.util.List;

public class HotelHabitacionModel implements Serializable{

	private static final long serialVersionUID = 3684484601764444264L;
	
	private int cantidadAdultos;
	
	private int cantidadInfantes;
	
	private List<PasajeroModel> lstPasajeroModel;

	public int getCantidadAdultos() {
		return cantidadAdultos;
	}

	public void setCantidadAdultos(int cantidadAdultos) {
		this.cantidadAdultos = cantidadAdultos;
	}

	public int getCantidadInfantes() {
		return cantidadInfantes;
	}

	public void setCantidadInfantes(int cantidadInfantes) {
		this.cantidadInfantes = cantidadInfantes;
	}

	public List<PasajeroModel> getLstPasajeroModel() {
		return lstPasajeroModel;
	}

	public void setLstPasajeroModel(List<PasajeroModel> lstPasajeroModel) {
		this.lstPasajeroModel = lstPasajeroModel;
	}
	
	@Override
	public String toString() {
		return "HotelHabitacionModel [cantidadAdultos=" + cantidadAdultos + ", cantidadInfantes=" + cantidadInfantes
				+ ", lstPasajeroModel" + lstPasajeroModel + "]";
	}

}
