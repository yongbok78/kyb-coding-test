function solution(n) {
  var r = -1;
  var sqrt = Math.sqrt(n);
  // 제곱근이 정수라면
  if (Number.isInteger(sqrt)) r = (sqrt + 1) ** 2;
  return r;
}
