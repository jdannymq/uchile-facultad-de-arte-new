<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html ng-app="solicitudCertificado" lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>

		<title>Facultad de Artes Universidad de Chile</title>


		
		<link href="/uchile-facultad-de-arte-new/assets/css/estilos.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="/uchile-facultad-de-arte-new/assets/css/normalize.min.css">
		
		<!-- jQuery Global -->
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/lib/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/lib/jquery.mobile.custom.min.js"></script>
<!-- 		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->


		<!-- jQuery Global Angular-->
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/lib/angular-1.5.0/angular.min.js"></script>
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/lib/angular-1.5.0/i18n/angular-locale_es-cl.js"></script>
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/lib/angular-sanitize.js"></script>
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/lib/angular-aria.min.js"></script>
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/lib/angular-messages.min.js"></script>
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/lib/angular-animate.js"></script>	
		

		<!-- jQuery Global Bootstrap-->
		<link rel="stylesheet" type="text/css" href="/uchile-facultad-de-arte-new/assets/css/bootstrap/bootstrap.min.css">
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/lib/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/lib/ui-bootstrap-tpls-1.1.2.min.js"></script>

		<!-- jQuery Global Controller-->		
		<script type="text/javascript" src="/uchile-facultad-de-arte-new/main/controllers/solicitudCertificadoController.js?version=1.0.1"></script>
		
		
		<!-- JS generales de Desarrollo-->
		<script src="/uchile-facultad-de-arte-new/assets/js/swiper.min.js"></script>
		<script src="/uchile-facultad-de-arte-new/assets/js/photoswipe/photoswipe.min.js"></script>
		<script src="/uchile-facultad-de-arte-new/assets/js/photoswipe/photoswipe-ui-default.min.js"></script>
		<script src="/uchile-facultad-de-arte-new/assets/js/select2.min.js"></script>

		<!-- Core JS file -->
		<script src="/uchile-facultad-de-arte-new/assets/js/photoswipe/photoswipe.min.js"></script>

		<!-- UI JS file -->
		<script src="/uchile-facultad-de-arte-new/assets/js/photoswipe/photoswipe-ui-default.min.js"></script>

		<!-- jQuery UX -->
		<script src="/uchile-facultad-de-arte-new/assets/js/ux/utilidades.js"></script>
		<script src="/uchile-facultad-de-arte-new/assets/js/ux/listing/main.js"></script>
		<script src="/uchile-facultad-de-arte-new/assets/js/validar_es.js"></script>
		
		<script type="text/javascript">
		var jsonMensajeError = ${Error};
		var jsonListaPrograma = ${listaPrograma};
		var jsonListaTipoCertificado = ${listaTipoCertificado};
		var jsonListaFinalidadCertificado = ${listaFinalidadCertificado};
		$( document ).ready(function() {
			console.log('prueba');
	     });	

		</script>

</head>
<body ng-controller="SolicitudCertificadoController" ng-init="parsearSolicitudCertificadoJson(); data = {};" class="body">

	<div class="banner">
		<img src='/uchile-facultad-de-arte-new/administracion-solicitudes/banner_1.jpg' border='0' alt="banner 1" />
	</div>
	
	<div class="main-container">
		<div id="msg" />
		<div class="page-header">
		  <h1 style="margin: 0.1em 16px 0.2em 0;font-size: 29px;font-weight: normal;color: #333;">	Solicitud de Certificados</h1>
		</div>
		
		<div class="titulos">Bienvenido al sistema de Solicitud de 	Certificados en Línea de la Escuela de Postgrado de la Facultad de Artes de la Universidad de Chile.</div>
		
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div>
			<p>
			  <button type="button" class="btn botones-arribas" id="antecedentes" style="border: 1px solid #fcefa1">Antecedentes Personales</button>
			  <button type="button" class="btn" id="confirmacion">Confirmacion de Solicitud</button>
			</p>
		</div>
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="texto-saludate" />	
			
		<div>
		  <table class="table" cellpadding="1" cellspacing="1" border="0">
		    <thead>
		      <tr>
		        <th></th>
		        <th>Nombre</th>
		        <th>Apellido Paterno</th>
		        <th>Apellido Materno</th>
		      </tr>
		    </thead>
		    <tbody>
		      <tr>
		        <td style="font-size: 12px!important;">Nombre Completo</td>
		        <td><input type="text" class="form-control" id="nombres" > </td>
		        <td><input type="text" class="form-control" id="apellidoPaterno"></td>
		        <td><input type="text" class="form-control" id="apellidoMaterno"></td>
		      </tr>
		      
		      <tr>
		        <td style="font-size: 12px!important;">RUT</td>
		        <td><input type="text" class="form-control" id="rut" > </td>
		        <td></td>
		        <td></td>
		      </tr>
		      <tr>
		        <td style="font-size: 12px!important;">Correo Electronico</td>
		        <td><input type="text" class="form-control" id="correo" > </td>
		        <td></td>
		        <td></td>
		      </tr>		      
		      <tr>
		        <td style="font-size: 12px!important;">Programa</td>
		        <td>
					<div class="vf-selector">
						<div class="dropdown">
							<button class="btn btn-default dropdown-toggle" type="button"
								id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="true" ng-cloak>
								{{selectedPrograma}} <span class="caret"></span>
							</button>
							<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
								<li ng-repeat="programaUniversidad in jsonListaProgramaCtrl track by $index">
									<a ng-click="seleccionDePrograma(programaUniversidad)">{{programaUniversidad.nombreProgramaUniversidad}}</a>
								</li>
							</ul>
						</div>
					</div>					  
		        </td>
		        <td></td>
		        <td></td>
		      </tr>	
		      <tr>
		        <td style="font-size: 12px!important;">Año de Ingreso</td>
		        <td><input type="text" class="form-control" id="annoIngresos" > </td>
		        <td></td>
		        <td></td>
		      </tr>			      
		      	  		      
		    </tbody>
		  </table>
		</div>
		<div>
		  <table class="table" cellpadding="1" cellspacing="1" >
		    <tbody>
		      <tr>
		        <td style="font-size: 12px!important;vertical-align: center; width: 15%;">Tipo de Certificado</td>
		        <td> 
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 1</label>
					</div>
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 2</label>
					</div>
					<div class="radio disabled">
					  <label><input type="radio" name="optradio">Option 3</label>
					</div>	
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 4</label>
					</div>
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 5</label>
					</div>
					<div class="radio disabled">
					  <label><input type="radio" name="optradio">Option 6</label>
					</div>	
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 7</label>
					</div>
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 8</label>
					</div>
					<div class="radio disabled">
					  <label><input type="radio" name="optradio">Option 9</label>
					</div>	
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 10</label>
					</div>
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 11</label>
					</div>
					<div class="radio disabled">
					  <label><input type="radio" name="optradio">Option 12</label>
					</div>							
					
											        
		        </td>
		      </tr>
		    </tbody>
		  </table>		
		</div>
		<div>
		  <table class="table" cellpadding="1" cellspacing="1" >
		    <tbody>
		      <tr>
		        <td style="font-size: 12px!important; width:15%;">Fines del certificado</td>
		        <td> 
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 1</label>
					</div>
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 2</label>
					</div>
					<div class="radio disabled">
					  <label><input type="radio" name="optradio">Option 3</label>
					</div>	
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 4</label>
					</div>
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 5</label>
					</div>
					<div class="radio disabled">
					  <label><input type="radio" name="optradio">Option 6</label>
					</div>	
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 7</label>
					</div>
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 8</label>
					</div>
					<div class="radio disabled">
					  <label><input type="radio" name="optradio">Option 9</label>
					</div>	
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 10</label>
					</div>
					<div class="radio">
					  <label><input type="radio" name="optradio">Option 11</label>
					</div>
					<div class="radio disabled">
					  <label><input type="radio" name="optradio">Option 12</label>
					</div>		        
		        </td>
		      </tr>
		    </tbody>
		  </table>		
		</div>
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="left">
			<p>
			  <button type="button" class="btn botones-abajos" id="Limpiar">Limpiar</button>
			  <button type="button" class="btn botones-abajos" id="siguiente">Siguiente</button>
			</p>
		</div>		
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="texto-saludate" />
		<div class="texto-subintro">La respuesta oficial será enviada
			a su correo electrónico</div>
		<div class="texto-subintro">Consideraciones importantes:</div>
		<div class="texto-subintro">Para obtener los certificados que
			tienen costo, se debe cancelar el IMPUESTO UNIVERSITARIO. Este
			impuesto se paga en forma de "ESTAMPILLAS" las cuales se compran en
			Servicios Centrales de la Universidad de Chile, calle Diagonal
			Paraguay 265, 1er piso (Centro de Atención de Alumnos). El horario
			de atención es de Lunes a Jueves de 09:00 a 13:00 hrs. Las
			ESTAMPILLAS debes portarlas al momento de retirar tu certificado en
			nuestra Escuela de Postgrado. El tiempo de entrega de tu
			certificado es de 05 días hábiles.</div>
	
		<div class="texto-subintro">Para cualquier consulta, por favor
			dirigirse a la Secretaría de Postgrado del Programa.</div>
		<div class="texto-saludate">Saluda atentamente</div>
		<div class="texto-saludate">Escuela de Postgrado</div>
		<div class="texto-saludate">Facultad de Artes</div>
		<div class="texto-saludate">Universidad de Chile</div>

	</div>
	
</body>
</html>