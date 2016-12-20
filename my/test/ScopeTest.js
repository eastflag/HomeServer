/**
 * Created by eastflag on 2016-12-20.
 */
//1.
function a (){
  var i = 0; //var를 생략하면 로컬변수가 아니라 전역변수가 되서 무한루프에 빠진다.
}
for(var i=0; i<5; i++) { //i는 전역 변수
  a();
  console.log(i);
}

//2. 정적 유효범위 렉시컬 : 사용될 때가 아니라 정의될때를 기준으로 스코프가 결정된다.
var j = 1;
function c(){
  var j = 10;
  d();
}

function d() {
  console.log(j); //여기 j는 d()를 호출한 c()의 j를 참조할까 글로벌의 j를 참조하는것인가? 글로벌을 참조한다.
}
