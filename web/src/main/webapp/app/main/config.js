/**
 * Main app config.
 * Author: Bill Lv<billcc.lv@hotmail.com>
 * Date: 2014-12-17
 */
mainApp.value('contextPath', '');

mainApp.config(['$routeProvider', '$httpProvider', function ($routeProvider, $httpProvider) {
    $routeProvider
        .when('/photos', {
            controller: 'photosController',
            templateUrl: 'photos'
        })
        .when('/tags', {
            controller: 'tagsController',
            templateUrl: 'tags'
        })
        .when('/content', {
            controller: 'contentController',
            templateUrl: 'content'
        })
        .when('/users', {
            controller: 'usersController',
            templateUrl: 'users'
        })
        .when('/accounts', {
            controller: 'accountsController',
            templateUrl: 'accounts'
        })
        .when('/words', {
            controller: 'wordsController',
            templateUrl: 'words'
        })
        .otherwise({redirectTo: "/"});
}]);