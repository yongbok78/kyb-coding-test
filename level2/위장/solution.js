function solution(clothes) {
  var cnt = 1;
  var obj = {};
  // 종류별 의상수 정리하고
  for (var c of clothes) {
    var v = obj[c[1]];
    if (v) v++;
    else v = 1;
    obj[c[1]] = v;
  }

  // 의상 조합 수 = (의상1 갯수 + 1)*(의상2 갯수 + 1)*...
  for (var k of Object.keys(obj)) {
    cnt *= obj[k] + 1;
  }
  // 의사을 안 입는 경우는 없으니 아무 것도 안입는 경우는 빼준다.
  return cnt - 1;
}

console.log(
  solution([
    ["yellow_hat", "headgear"],
    ["blue_sunglasses", "eyewear"],
    ["green_turban", "headgear"],
  ])
);
console.log(
  solution([
    ["crow_mask", "face"],
    ["blue_sunglasses", "face"],
    ["smoky_makeup", "face"],
  ])
);
