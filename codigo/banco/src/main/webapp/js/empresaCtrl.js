(function () {
    'use strict';
    angular.module('Transporte.controllers', []).controller('empresaCtrl', empresaController);

    empresaController.$inject = ['$scope', '$http', '$filter', '$location'];

    function empresaController($scope, $http, $filter, $location) {

        // Definición variables
        $scope.tipoDocumentoPersona = {};
        $scope.tipoDocumentoEmpresa = {};
        $scope.empresa = {};
        $scope.empresas = {};

        // Definición de funciones
        $scope.obtenerTipoDocumento = obtenerTipoDocumento;
        $scope.obtenerempresas = obtenerempresas;
        $scope.guardar = guardar;


        // funciones basicas
        $scope.obtenerTipoDocumento();


        // Implementacion 
        function obtenerTipoDocumento() {
            $http.get('./servicios/tipoDocumento/obtenerTodos').success(function (data, status, headers, config) {
                $scope.tipoDocumentoPersona = JSON.parse(JSON.stringify(data));
                $scope.tipoDocumentoEmpresa = JSON.parse(JSON.stringify(data));
            }).error(function (data, status, headers, config) {
                console.log("error");
            });
        }
        ;

        function obtenerempresas() {
            $http.get('./servicios/empresa/obtenerTodos').success(function (data, status, headers, config) {
                $scope.empresas = data;
            }).error(function (data, status, headers, config) {
                console.log("error");
            });
        }
        ;

        function guardar() {
            console.log("guardar");
            console.log($scope.empresa);

            $http.post('./servicios/empresa/guardar', JSON.stringify($scope.empresa), {})
                    .success(function (data, status, headers, config) {
                        alert("se guardo correctamente");
                        $scope.obtenerempresas();
                    }).error(function (data, status, headers, config) {
                //    $ngBootbox.alert('Error al consultar la informacion del infractor, por favor intente mas tarde: \n\n ' + data.mensaje);
            });
        }
        ;

    }
})();


