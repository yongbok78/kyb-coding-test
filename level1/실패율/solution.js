function solution(N, stages) {
  var rates = [];
  for (var i = 1; i <= N; i++) {
    // [[스테이지번호, 클리어못한수, 클리어한수]...]
    rates.push([i, 0, 0]);
  }

  var answer = stages
    .reduce((acc, s) => {
      // 클리어하지 못한 스테이지 값 증가
      if (s === N + 1) s--;
      // N + 1이면 모든 스테이지 클리어
      else rates[s - 1][1]++;
      // 도달한 스테이지 값 증가
      for (var i = 0; i < s; i++) {
        rates[i][2]++;
      }
      return acc;
    }, rates)
    // 실패율 계산 [[스테이지 번호, 실패율], ...]
    .map((a) => [a[0], a[2] === 0 ? 0 : a[1] / a[2]])
    // 실패율 내림차순으로 정렬
    .sort((a, b) => b[1] - a[1])
    // 스테이지 번호 반환
    .map((a) => a[0]);
  return answer;
}

console.log(solution(5, [2, 1, 2, 6, 2, 4, 3, 3]));
console.log(solution(4, [4, 4, 4, 4, 4]));
