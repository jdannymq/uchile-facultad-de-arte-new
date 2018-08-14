package com.manashiki.uchilearte.solicitud.exceptions;

public class SinDisponibilidadException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public SinDisponibilidadException(String message){
		super(message);
	}
	
	public SinDisponibilidadException(String message, Throwable cause)
    {
        super(message);
        if(cause != null)
        {
            initCause(cause);
        }
    }
}
