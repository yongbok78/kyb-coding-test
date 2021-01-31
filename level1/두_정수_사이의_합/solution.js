function solution(a, b) {
  var sum = (a, b) => ((b - a + 1) * (a + b)) / 2;
  var answer = sum(Math.min(a, b), Math.max(a, b));
  return answer;
}

console.log(solution(3, 5));
console.log(solution(3, 3));
console.log(solution(5, 3));
