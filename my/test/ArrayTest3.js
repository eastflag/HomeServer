/**
 * Created by eastflag on 2016-11-09.
 */
/**
 * Created by eastflag on 2016-11-09.
 */
var member_typelist = [
  {member_type:1, type_name: '판매자'},
  {member_type:2, type_name: '구매자'}
];

function findMemberType(type) {
  var type_name = null;

  member_typelist.forEach(function (item, index) {
    if (item.member_type == type) {
      type_name = item.type_name;
    }
  });

  return type_name;
}

console.log(findMemberType(1));
