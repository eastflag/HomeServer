/* global malarkey:false, moment:false */
(function() {
  'use strict';

  angular
    .module('gulpAngular')
    .constant('HOST', 'http://localhost:8080')
    .constant('malarkey', malarkey)
    .constant('moment', moment);

})();
