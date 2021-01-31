function solution(dartResult) {
  //점수|보너스|[옵션]으로 이루어진 문자열 3세트 분리
  var points = dartResult.match(/\d+[SDT][#*]?/g);
  for (var i = 0; i < points.length; i++) {
    var p = points[i]
      // 점수|보너스|옵션 분리
      .match(/(\d+)([SDT])([#*]?)/)
      .filter((v, j) => [1, 2, 3].includes(j));
    p[0] = +p[0];
    p[1] = p[1] === "S" ? 1 : p[1] === "D" ? 2 : 3;
    p[2] = p[2] === "#" ? -1 : p[2] === "*" ? 2 : 1;
    points[i] = p[0] ** p[1] * p[2];
    // 보너스 D이면 앞쪽 점수 2배
    if (p[2] === 2 && i > 0) points[i - 1] *= p[2];
  }
  var answer = points.reduce((a, b) => a + b);
  return answer;
}

console.log(solution("1S2D*3T"));
console.log(solution("1D2S#10S"));
console.log(solution("1D2S0T"));
console.log(solution("1S*2T*3S"));
console.log(solution("1D#2S*3S"));
console.log(solution("1T2D3D#"));
console.log(solution("1D2S3T*"));
