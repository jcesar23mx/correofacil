'use strict';

angular.module('Authentication')
    .controller('LoginController',['$scope','$rootScope','$location','AuthenticationService','$state',
                '$cookieStore','$modal','$timeout','$http','toaster',

        function($scope,$rootScope,$location,AuthenticationService,$state,$cookieStore,$modal,
                $timeout,$http,toaster) {

         $scope.login = function() {
            $scope.dataLoading = true;
            AuthenticationService.Login($scope.username,$scope.password, function(response){
                if(response.success){

                    $scope.entro = $rootScope.globals.currentUser.username;
                    AuthenticationService.SetCredentials($scope.username, $scope.password, response.idclient);
                    console.log('entro');
                    $location.path('principal');
                }
                else {
                    console.log('datos incorrectos');
                    toaster.warning({title:'Notificación',body:'Datos incorrectos'});
                    $scope.dataLoading = false;
                }
            });
         }


     }]);
