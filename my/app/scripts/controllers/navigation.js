/**
 * Created by eastflag on 2016-11-14.
 */
angular.module('myApp')
  .controller('NavigationCtrl', function ($scope, $location) {

    $scope.isActive = function(route) {
      return route == $location.path();
    }
  });
