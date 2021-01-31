function solution(n) {
  var primes = [];
  for (var i = 0; i <= n; i++) primes[i] = true;

  //제곱근 이하의 숫자 까지 찾으면 됨
  var sqrt = Math.sqrt(n);
  for (var i = 2; i <= sqrt; i++) {
    if (primes[i]) {
      for (var j = i; i * j <= n; j++) primes[i * j] = false;
    }
  }
  return primes.filter((v) => v).length - 2;
}

console.log(solution(10));
console.log(solution(5));
