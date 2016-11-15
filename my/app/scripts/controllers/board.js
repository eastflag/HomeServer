/**
 * Created by eastflag on 2016-11-14.
 */
angular.module('myApp')
  .controller('BoardCtrl', function ($scope, $http) {
    $scope.boardList = [];
    $scope.selectedBoard = null; //사용자가 글상세보기를 클릭할때 해당 글 데이터

    $scope.getBoardList = function () {
      $http.get('http://localhost:8080/api/getBoardList')
        .success(function (value) {
          console.log(value);
          $scope.boardList = value;
        })
    };
    $scope.getBoardList();

    $scope.getBoard = function (board) {
      $http.get('http://localhost:8080/api/getBoard?board_id=' + board.board_id)
        .success(function(value){
          $scope.selectedBoard = value;
        });
    }
  });
