package com.manashiki.uchilearte.solicitud.rest;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import com.google.gson.Gson;


@Path("/SolicitudCertificadoService")
public class SolicitudCertificadoService {
	
	private static final Logger logger = Logger.getLogger(SolicitudCertificadoService.class);
	
	@POST
    @Path("/obtenerDataCertificado")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public String obtenerListadoHoteles(
    									@FormParam("requestJson") String jsonParametrosBusquedaRequest,
    									@Context HttpServletResponse servletResponse) throws IOException {
		logger.info("Inicio obtencion listado de Hoteles.");
		logger.info(jsonParametrosBusquedaRequest);
		Gson g = new Gson();
		try {
			
			

		} catch (Exception e) {
			logger.error("Exception: "+e.getMessage(), e);

		}finally{

		}
		
		
		logger.info("Fin obtencion listado de Hoteles.");

		try{



		}catch(Exception e){
			logger.error("Exception No fue posible guardar en grafana.: "+e.getMessage(), e);
		}
        return "";
    }
	

	@POST
    @Path("/levantarFicha")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public String levantarFichaHotel(
    									@FormParam("requestJson") String jsonParametrosRequest,
    									@FormParam("hotelJson") String jsonHotelRequest,
    									@Context HttpServletResponse servletResponse) {
		logger.info("Levantando Ficha.");
		logger.info(jsonParametrosRequest);
		
		try {
			logger.info("LLamar persistir paso 2: ");
			
		} catch (Exception e) {
			logger.error("Exception: "+e.getMessage(), e);

		}
		
		logger.info("Fin Levantando Ficha");
		
        return "";
    }
	
	@POST
    @Path("/obtenerDetalleHotel")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public String obtenerDetalleHotel(
    									@FormParam("requestJson") String jsonParametrosRequest,
    									@FormParam("hotelJson") String jsonHotelRequest,
    									@Context HttpServletResponse servletResponse) {
		logger.info("Levantando Ficha.");
		logger.info(jsonParametrosRequest);
		
		try {
	
			
	
				
		} catch (Exception e) {
			logger.error("Exception: "+e.getMessage(), e);
			
		}
		
		logger.info("Fin Levantando Ficha");
		
        return "";
    }
	
}
