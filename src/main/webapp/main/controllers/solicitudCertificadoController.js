var solicitudCertificadoApp = angular.module('solicitudCertificado',[]);



solicitudCertificadoApp.controller('SolicitudCertificadoController', [ '$scope', '$http', '$window', '$sce',
                                                        function($scope, $http, $window, $sce) {
	

	/*variables globales*/
	$scope.val = null;
	$scope.mensaje;
	$scope.selectedPrograma = 'Seleccionar Programa';
	$scope.jsonListaProgramaCtrl; 
	$scope.jsonTipoCertificadoCtrl; 
	$scope.jsonListaFinalidadCertificadoCtrl; 
	
	/*objetos de trabajos*/
	$scope.nombre;
	$scope.apellidoPaterno;
	$scope.apellidoMaterno;
	$scope.rut;
	$scope.correo;
	$scope.annoIngresos;
	$scope.objetoPrograma;
	$scope.objetoTipoCertificado;
	$scope.objetoFinalidadCertificado;
	
	$scope.nombresLabel;
	$scope.apellidoPaternoLabel;
	$scope.apellidoMaternoLabel;
	$scope.rutLabel;
	$scope.correoLabel;
	$scope.programaLabel;
	$scope.annoIngresosLabel;
	$scope.tipoLabel;
	$scope.finesLabel;

	
	/*botonera del formulario*/
	$scope.botonLimpiar;
	$scope.botonSiguiente;
	$scope.botonEnviar;
	$scope.botonPagar;
	
	
	/*pestañas*/
	$scope.pestanaAntecedentes;
	$scope.pestanaConfirmacion;
	$scope.tabAntecedentes;
	$scope.tabConfirmacion;
	
	
	
	
	$scope.parsearSolicitudCertificadoJson = function() {
				
		console.log('=============================================== Inicializando Data Certificados ===========================================');
		$scope.jsonListaProgramaCtrl = $window.jsonListaPrograma;
		$scope.jsonTipoCertificadoCtrl = $window.jsonListaTipoCertificado;
		$scope.jsonListaFinalidadCertificadoCtrl = $window.jsonListaFinalidadCertificado;
		$scope.mensaje = $window.jsonMensajeError;
		console.log('=================================================================================================================');
		
		if($scope.jsonListaProgramaCtrl !== undefined){
			console.log('Lista	de Programas');
			$scope.obtenerComponentesFormulario();
		}else{
			console.log('no hay poruebas');
		}
	};
	
	
	$scope.seleccionDePrograma = function(programaUniversidad){
		
		if(programaUniversidad !== undefined){
			$scope.objetoPrograma = programaUniversidad;
			$scope.selectedPrograma =  programaUniversidad.nombreProgramaUniversidad;
		}else{
			$scope.objetoPrograma = null;
			$scope.selectedPrograma =  'Seleccionar Programa';
		}
		console.log('=============================================== Seleccion de Programa ===========================================');
		console.log(programaUniversidad);
		console.log('=================================================================================================================');
	};
	
	
	$scope.seleccionTipoCertificado = function(tipoCertificado){
		
		if(tipoCertificado !== undefined){
			$scope.objetoTipoCertificado = tipoCertificado;
		}
		console.log('=============================================== Seleccion de Certificado ===========================================');
		console.log($scope.objetoTipoCertificado);
		console.log('=================================================================================================================');
	};

	$scope.seleccionFinalidadCertificado= function(finalidadCertificado){
		
		if(finalidadCertificado !== undefined){
			$scope.objetoFinalidadCertificado = finalidadCertificado;
		}
		console.log('=============================================== Seleccion de Finalidad ===========================================');
		console.log($scope.objetoFinalidadCertificado);
		console.log('=================================================================================================================');
	};
	
	$scope.obtenerComponentesFormulario = function(){
		console.log('============================================ Obtener Componentes Formulario ========================================');
		$scope.nombre = $('input[id=nombres]');
		$scope.apellidoPaterno = $('input[id=apellidoPaterno]');
		$scope.apellidoMaterno = $('input[id=apellidoMaterno]');;
		$scope.rut = $('input[id=rut]');
		$scope.correo = $('input[id=correo]');
		$scope.annoIngresos = $('input[id=annoIngresos]');
		
		$scope.botonLimpiar = $('button[id=limpiar]');
		$scope.botonSiguiente = $('button[id=siguiente]');
		$scope.botonEnviar = $('button[id=enviar]');
		$scope.botonPagar = $('button[id=pagar]');
		
		$scope.botonEnviar.hide();
		$scope.botonPagar.hide();
		
		$scope.nombresLabel = $('span[id=nombresLabel]'); 
		$scope.apellidoPaternoLabel = $('span[id=apellidoPaternoLabel]'); 
		$scope.apellidoMaternoLabel= $('span[id=apellidoMaternoLabel]'); 
		$scope.rutLabel = $('span[id=rutLabel]'); 
		$scope.correoLabel = $('span[id=correoLabel]'); 
		$scope.programaLabel = $('span[id=programaLabel]'); 
		$scope.annoIngresosLabel= $('span[id=annoIngresosLabel]'); 
		$scope.tipoLabel = $('span[id=tipoLabel]'); 
		$scope.finesLabel = $('span[id=finesLabel]'); 
		
		$scope.pestanaAntecedentes = $('a[id=pestanaAntecedentes]');
		$scope.pestanaConfirmacion = $('a[id=pestanaConfirmacion]');
		$scope.tabAntecedentes = $('div[id=antecedentes]');
		$scope.tabConfirmacion = $('div[id=confirmacion]');
		
		$scope.pestanaAntecedentes.attr('disabled','disabled');
		$scope.pestanaConfirmacion.attr('disabled','disabled');
		
		$('li[id=pestana1').attr('disabled','disabled');
		$('li[id=pestana2').attr('disabled','disabled');
		
		console.log('=================================================================================================================');
	};
	
	$scope.limpiarFormulario= function(){
		console.log('=============================================== Limpiar Formulario  ===========================================');
		$scope.nombre.val('');
		$scope.apellidoPaterno.val('');
		$scope.apellidoMaterno.val('');
		$scope.rut.val('');
		$scope.correo.val('');
		$scope.annoIngresos.val('');
		
		$scope.nombresLabel.text('');
		$scope.apellidoPaternoLabel.text('');
		$scope.apellidoMaternoLabel.text('');
		$scope.rutLabel.text('');
		$scope.correoLabel.text('');
		$scope.programaLabel.text('');
		$scope.annoIngresosLabel.text('');
		$scope.tipoLabel.text('');
		$scope.finesLabel.text('');
		$scope.objetoPrograma = null;
		$scope.selectedPrograma =  'Seleccionar Programa';

		if($scope.objetoTipoCertificado !== undefined && $scope.objetoTipoCertificado != null && $scope.objetoTipoCertificado.idTipoCertificado != 0){
			$('input[id='+ $scope.objetoTipoCertificado.idTipoCertificado +']').val('');
		}
		if($scope.objetoFinalidadCertificado !== undefined && $scope.objetoFinalidadCertificado != null && $scope.objetoFinalidadCertificado.idFinalidadCertificado != 0){
			$('input[id='+ $scope.objetoFinalidadCertificado.idFinalidadCertificado +']').val('');
		}
		
		console.log('======================================================================================================================');
	};
	
	

	$scope.siguienteFormulario = function(){
		console.log('===================================== Obtener Data Pasar Siguiente Pestaña ========================================');
		$scope.nombresLabel.text($scope.nombre.val());
		$scope.apellidoPaternoLabel.text($scope.apellidoPaterno.val());
		$scope.apellidoMaternoLabel.text($scope.apellidoMaterno.val());
		$scope.rutLabel.text($scope.rut.val());
		$scope.correoLabel.text($scope.correo.val());
		$scope.annoIngresosLabel.text($scope.annoIngresos.val());
		
		if($scope.objetoPrograma !== undefined && $scope.objetoPrograma != null){
			$scope.programaLabel.text($scope.objetoPrograma.nombreProgramaUniversidad);
		}
		if($scope.objetoTipoCertificado !== undefined && $scope.objetoTipoCertificado != null){
			$scope.tipoLabel.text($scope.objetoTipoCertificado.nombreTipoCertificado);
		}
		if($scope.objetoFinalidadCertificado !== undefined && $scope.objetoFinalidadCertificado != null){
			$scope.finesLabel.text($scope.objetoFinalidadCertificado.nombreFinalidadCertificado);
		}	
		
		$scope.botonLimpiar.hide();
		$scope.botonSiguiente.hide();
		
		$scope.botonEnviar.show();
		$scope.botonPagar.show();
		
		$scope.habilitarPestanaConfirmacion();
		
		console.log('=================================================================================================================');
	};
	
	
	$scope.habilitarPestanaConfirmacion = function(){
		console.log('========================================= Pasar a Pestaña de Confirmacion========================================');
		$scope.pestanaAntecedentes.addClass('boton-inactivo');
		$scope.pestanaAntecedentes.removeClass('boton-activo');
		$scope.pestanaAntecedentes.attr('style','border:1px solid #ddd;');

		$scope.pestanaConfirmacion.addClass('boton-activo');
		$scope.pestanaConfirmacion.removeClass('boton-inactivo');
		$scope.pestanaConfirmacion.attr('style','border:1px solid #fcefa1');
		
		
		$scope.tabAntecedentes.removeClass('in'); 
		$scope.tabAntecedentes.removeClass('active'); 
		
		$scope.tabConfirmacion.addClass('in');
		$scope.tabConfirmacion.addClass('active');
		
		console.log('====================================================================================================================');
	};
	
	
	

}]);