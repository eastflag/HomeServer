/**
 * Created by eastflag on 2016-08-31.
 */
(function() {
  'use strict';

  angular
    .module('gulpAngular')
    .service('HttpSvc', HttpService);

  function HttpService($http, HOST) {
    this.getBoardList  = function () {
      return $http({
        url: HOST + '/api/board', method: 'GET', headers: {'Content-Type': 'application/json'}
      });
    };
  }
})();
