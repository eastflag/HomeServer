/**
 * Created by eastflag on 2016-10-27.
 */
var items = [1, 3];
var itemList = ['공산품', '농산물', '수산물', '축산물', '김치류'];

items.map(function (item, index) {
  items[index] =itemList[item-1];
});

console.log(items);

var data = [
  {"partner_apply_id":3,"member_id":18,"items":[1,3],"filename":"23_03_01_P_스키장.xlsx","employee_number":2,"jungsang_number":5},
  {"partner_apply_id":2,"member_id":32,"items":[1,2,5],"filename":"goods_info.xlsx","employee_number":11,"jungsang_number":21}
];

data.map(function (value, index) {
  value.items.map(function(item, index){
    value.items[index] =  itemList[item-1];
  });
});

console.log(data);
