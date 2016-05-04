/**
 * Main app controllers.
 * Author: Bill Lv<billcc.lv@hotmail.com>
 * Date: 2014-12-17
 */
mainApp.controller('mainController', function ($scope, mainService) {
    $scope.model = {
        mainMenu: {
            selection: ''
        }
    };

    $scope.init = function () {
        // TODO: call service to get data on demands
    };

    $scope.selectMainMenu = function (menuName) {
        $scope.model.mainMenu.selection = menuName;
    };
});

mainApp.controller('photosController', function ($scope, photosService) {
    $scope.init = function () {
        // TODO: call service to get data on demands
    };
});

mainApp.controller('tagsController', function ($scope, tagsService) {
    $scope.init = function () {
        // TODO: call service to get data on demands
    };
});

mainApp.controller('contentController', function ($scope, contentService) {
    $scope.init = function () {
        // TODO: call service to get data on demands
    };
});

mainApp.controller('usersController', function ($scope, usersService) {
    $scope.init = function () {
        // TODO: call service to get data on demands
    };
});

mainApp.controller('accountsController', function ($scope, accountsService) {
    $scope.init = function () {
        // TODO: call service to get data on demands
    };
});

mainApp.controller('wordsController', function ($scope, wordsService) {
    $scope.init = function () {
        // TODO: call service to get data on demands
    };
});