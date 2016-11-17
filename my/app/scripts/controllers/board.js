/**
 * Created by eastflag on 2016-11-14.
 */
angular.module('myApp')
  .controller('BoardCtrl', function ($scope, $http, $window) {
    $scope.member_id = 1;  //인증로직이 완성될때까지 1번으로 하드코딩하여 테스트

    $scope.boardList = [];  //글 목록 데이터를 담는 변수
    $scope.selectedBoard = null; //사용자가 글상세보기를 클릭할때 선택된 글 데이터

    $scope.replyingBoard = false;  //답글쓰기 버튼 눌렀을때 답글작성 UI를 보여주는 변수
    $scope.modifyingBoard = false; //수정 버튼을 눌렀을때 수정 UI를 보여주는 변수

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
    };

    $scope.addBoard = function() {
      var params = {
        title: $scope.title,
        content: $scope.content,
        member_id: 1, // 3장앞부분에서 DB에 insert한 member_id를 그대로 사용한다. 인증 로직 구현전까지
        level: 0 //새글쓰기이므로 부모글이다.
        //부모글일때는 parent_id를 보내지 않고 서버에서 계산해서 넣는다.
      };
      $http({
        url: 'http://localhost:8080/api/addBoard', method: 'POST', headers: {'Content-Type': 'application/json'}, data: params
      }).success(function (value) {
        if(value.result == 0) {
          //입력된 글 초기화
          $scope.title = null;
          $scope.content = null;
          //게시판 글 다시 가져오기
          $scope.getBoardList();
        }
      });
    };

    $scope.replyBoard = function() {
      var params = {
        title: $scope.replyTitle,
        content: $scope.replyContent,
        member_id: 1, // 3장앞부분에서 DB에 insert한 member_id를 그대로 사용한다. 인증 로직 구현전까지
        level: 1, //답글쓰기이므로 1이다.
        parent_id: $scope.selectedBoard.board_id //선택된 보드의 board_id가 parent_id 이다.
      };
      $http({
        url: 'http://localhost:8080/api/addBoard', method: 'POST', headers: {'Content-Type': 'application/json'}, data: params
      }).success(function (value) {
        if(value.result == 0) {
          //입력된 글 초기화
          $scope.replyTitle = null;
          $scope.replyContent = null;
          //게시판 글 다시 가져오기
          $scope.getBoardList();
        }
      });
    };

    //글 수정 버튼을 눌렀을때
    $scope.showModify = function() {
      $scope.modifyingBoard = true;
      $scope.modifyContent = $scope.selectedBoard.content; //수정취소때 원래 글 복원하기 위해 변수 별도 설정
    };

    //글 수정 완료 버튼을 눌렀을때
    $scope.modifyBoard = function() {
      var params = {
        content: $scope.modifyContent,
        member_id: $scope.member_id,
        board_id: $scope.selectedBoard.board_id
      };
      $http({
        url: 'http://localhost:8080/api/modifyBoard', method: 'PUT', headers: {'Content-Type': 'application/json'}, data: params
      }).success(function (value) {
        if(value.result == 0) {
          //입력된 글 초기화
          $scope.replyTitle = null;
          $scope.replyContent = null;
          //게시판 글 다시 가져오기
          $scope.getBoardList();
        }
      });
    };

    //글 수정 취소 버튼을 눌렀을때
    $scope.cancelModify = function () {
      $scope.modifyingBoard = false;
    };

    //삭제버튼을 누르면 confirm 다이얼로그를 보여주고 확인을 누르면 삭제
    $scope.showRemove = function() {
      if($window.confirm('삭제하시겠습니까?')) {
        console.log('ok');
        var params = {
          board_id: $scope.selectedBoard.board_id
        };
        $http({
          url: 'http://localhost:8080/api/removeBoard', method: 'DELETE', headers: {'Content-Type': 'application/json'}, data: params
        }).success(function (value) {
          if(value.result == 0) {
            //게시판 글 다시 가져오기
            $scope.getBoardList();
          }
        });
      }
    };
  });
