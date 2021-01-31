function solution(n) {
  var r = [];
  while (n !== 0) {
    r.push(n % 10);
    n = Math.floor(n / 10);
  }
  return r;
}

console.log(solution(12345));
