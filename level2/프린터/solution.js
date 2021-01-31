function solution(priorities, location) {
  var list = priorities.map((v, i) => ({
    isPrint: i === location, // 프린트 여부 저장
    value: v,
  }));
  var count = 0;
  while (true) {
    var cur = list.splice(0, 1)[0];
    if (list.some((v) => v.value > cur.value)) {
      list.push(cur);
    } else {
      count++;
      if (cur.isPrint) return count;
    }
  }
}

console.log(solution([2, 1, 3, 2], 2));
console.log(solution([1, 1, 9, 1, 1, 1], 0));
