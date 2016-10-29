/**
 * Created by eastflag on 2016-10-14.
 */
(function() {
  "use strict";

  var app = angular.module("myApp", []);

  app.controller("demoController", demoController);

  function demoController(NgTableParams, simpleList) {
    var self = this;
    self.a = "aaa";
    console.log(self.a);
  }
})();
