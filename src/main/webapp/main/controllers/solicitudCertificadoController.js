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
	$scope.objetoPrograma;
	
	
	$scope.parsearSolicitudCertificadoJson = function() {
				
		console.log('=============================================== Inicializando Data Certificados ===========================================');
		$scope.jsonListaProgramaCtrl = $window.jsonListaPrograma;
		$scope.jsonTipoCertificadoCtrl = $window.jsonListaTipoCertificado;
		$scope.jsonListaFinalidadCertificadoCtrl = $window.jsonListaFinalidadCertificado;
		$scope.mensaje = $window.jsonMensajeError;
		console.log('=================================================================================================================');
		
		if($scope.jsonListaProgramaCtrl !== undefined){
			console.log('Lista	de Programas');
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
	
	

}]);