/**
 * Created by eastflag on 2016-10-14.
 */
// push, pop test
var fruits = ["Banana", "Orange", "Apple", "Mango"];
var a = fruits.pop();
console.log(a);
//Mango
fruits.push("Kiwi");
console.log(fruits); //
// [ 'Banana', 'Orange', 'Apple', 'Kiwi' ]

//shift, unshift test
var fruits = ["Banana", "Orange", "Apple", "Mango"];
var b = fruits.shift();
console.log(b);
//Banana
fruits.unshift("Kiwi");
console.log(fruits);
//[ 'Kiwi', 'Orange', 'Apple', 'Mango' ]

//splice test
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(2, 1, "Lemon", "Kiwi");
//2번 인덱스에 1개(Apple)를 지우고 Lemon,과 Kiwi를 삽입한다.
console.log(fruits);
//[ 'Banana', 'Orange', 'Lemon', 'Kiwi', 'Mango' ]

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(1, 2);
//1번 인덱스에 2개(Orange, Apple)를 지운다.
console.log(fruits);
//[ 'Banana', 'Mango' ]

//map test : 배열의 모든 요소에 fullname property를 추가하고 싶다.
var persons = [
  {firstname : "Malcom", lastname: "Reynolds"},
  {firstname : "Kaylee", lastname: "Frye"},
  {firstname : "Jayne", lastname: "Cobb"}
];
persons.map(function (item, index) {
  item.fullname = item.firstname + " " + item.lastname;
});
console.log(persons);
/*[ { firstname: 'Malcom',
  lastname: 'Reynolds',
  fullname: 'Malcom Reynolds' },
  { firstname: 'Kaylee',
    lastname: 'Frye',
    fullname: 'Kaylee Frye' },
  { firstname: 'Jayne', lastname: 'Cobb', fullname: 'Jayne Cobb' } ]*/
