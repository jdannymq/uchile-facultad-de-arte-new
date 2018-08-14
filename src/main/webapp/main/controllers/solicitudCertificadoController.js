var solicitudCertificadoApp = angular.module('solicitudCertificado',[]);



solicitudCertificadoApp.controller('SolicitudCertificadoController', [ '$scope', '$http', '$window', '$sce',
                                                        function($scope, $http, $window, $sce) {
	


	$scope.val = null;
	$scope.listadoCertificadosJson = '';
	$scope.mensaje = "nueva ventana de ";
	$scope.selectedPrograma = 'Seleccionar Programa';
	
	$scope.parsearSolicitudCertificadoJson = function() {
				
		console.log('=============================================== Inicializando Solicitudes ===========================================');
		$scope.listadoCertificadosJson = $window.jsonListadoCertificado;
		$scope.mensaje = $window.jsonMensaje;
		console.log('=================================================================================================================');
		
		if($scope.listadoCertificadosJson !== undefined){
			console.log('prueba exitosa');
		}
		else{
			console.log('no hay poruebas');
		}
		
	};
	

}]);