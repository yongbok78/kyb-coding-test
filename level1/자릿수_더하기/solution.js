function solution(n) {
  var r = 0;
  while (n !== 0) {
    r += n % 10;
    n = Math.floor(n / 10);
  }
  return r;
}

console.log(solution(123));
console.log(solution(987));
