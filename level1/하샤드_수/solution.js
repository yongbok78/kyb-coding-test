function solution(x) {
  return x % [...("" + x)].map((x) => +x).reduce((a, b) => a + b, 0) === 0;
}

console.log(solution(10));
console.log(solution(12));
console.log(solution(11));
console.log(solution(13));
