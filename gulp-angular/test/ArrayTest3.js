/**
 * Created by eastflag on 2016-11-09.
 */
var member_typelist = {
  member_type:1, type_name: '판매자',
  member_type:2, type_name: '구매자'
};

function findMemberType(type) {
  member_typelist.forEach(function (item, index) {
    if (item.member_type= type) {
      return item.type_name;
    }
  })
}

findMemberType(1);
