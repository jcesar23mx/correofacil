// Declare app level module which depends on filters, and services
angular.module('Authentication', []);
angular.module('Home', []);

angular.module('correofacil',
        [
            'Authentication',
            'Home',
            'ngResource',
            'ngRoute',
            'ui.bootstrap',
            'ui.date',
            'ngCookies',
            'ui.router',
            'base64',
            'toaster'

        ])

        .constant('CONFIG', {
                APIURL: 'http://127.0.0.1:8084'
            })

        .config(['$stateProvider', '$urlRouterProvider',
                function($stateProvider, $urlRouterProvider) {

                    // For unmatched routes
                    $urlRouterProvider.otherwise('/');
                    $stateProvider
                                    .state('login', {
                                        url: '/',
                                        controller: 'LoginController',
                                        templateUrl: 'views/login/login.html',
                                        hideNavbar: true
                                    })
                     .state('home', {
                         url: '/',
                         controller: 'HomeController',
                         templateUrl: 'views/home/home.html'
                     })
                     .state('home.principal', {
                              url: 'principal',
                              controller: 'HomeController',
                              templateUrl: 'views/home/home.html'
                          })
                }
        ])

        .run(['$rootScope', '$location', '$cookieStore', '$http', '$state',
                function ($rootScope, $location, $cookieStore, $http, $state) {
                    // keep user logged in after page refresh
                    $rootScope.globals = $cookieStore.get('globals') || {};
                    if ($rootScope.globals.currentUser) {
                        $http.defaults.headers.common['Authorization'] = 'Basic' + $rootScope.globals.currentUser.authdata; // jshint ignore:line
                    }
                    $rootScope.session = $cookieStore.get('session') || {};
                    if ($rootScope.session.username) {
                        $http.defaults.headers.common['Authorization'] = 'Basic' + $rootScope.session.authdata;
                    }
                    $rootScope.$on('$stateChangeStart', function (event, toState, next, current) {
                        // redirect to login page if not logged in
                        if ($location.path() !== '/login' && $location.path() !== '/home') {
                            console.info($location.path())
                            $state.transitionTo("login");
                            event.preventDefault();
                        }
                    });
                 }
        ]);
