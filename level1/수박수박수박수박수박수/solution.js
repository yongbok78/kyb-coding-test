function solution(n) {
  var subak = ["수", "박"];
  var answer = "";
  for (var i = 0; i < n; i++) {
    answer += subak[i % 2];
  }
  return answer;
}

console.log(solution(3));
console.log(solution(4));
