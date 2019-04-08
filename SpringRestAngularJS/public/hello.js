angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    then(function(response) {
        $scope.greeting = response.data;
    });
});