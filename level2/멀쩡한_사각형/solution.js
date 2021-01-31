function solution(w, h) {
  var answer = w * h;
  var gcd = (min, max) => (max === 0 ? min : gcd(max, min % max));
  return answer - (w + h - gcd(w, h));
}

console.log(solution(8, 12));
