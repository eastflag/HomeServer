(function() {
  'use strict';

  angular
    .module('gulpAngular')
    .controller('BoardController', BoardController);

  /** @ngInject */
  function BoardController(HttpSvc) {
    var self = this;

    //변수와 함수 정의
    self.boardList = [];
    self.getBoardList = getBoardList;

    //게시판 목록을 호출한다.
    self.getBoardList();

    //함수 선언
    function getBoardList() {
      HttpSvc.getBoardList()
        .success(function (values, status, headers) {
          self.boardList = values;
        })
        .error(function (values, status) {
        });
    };
  }
})();
