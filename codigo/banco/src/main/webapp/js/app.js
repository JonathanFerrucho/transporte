'use strict';

// Declare app level module which depends on filters, and services
var app = angular.module("Transporte", [
    'ngRoute',
    'Transporte.controllers'
]);

app.config(["$routeProvider", function (a) {
        console.log(a);
        a.when('/empresa', {templateUrl: 'partials/empresa.html', controller: 'empresaCtrl'});
        a.otherwise({redirectTo: '/empresa'});
    }
]);
