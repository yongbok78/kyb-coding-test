function solution(d, budget) {
  var answer = 0;
  // 오름차순 정렬
  d.sort((a, b) => a - b);
  for (var i = 0; i < d.length; i++) {
    // 부서 예산이 남은 예산 이하면
    if (d[i] <= budget) {
      //예산에서 빼주고
      budget -= d[i];
      answer++;
      // 남은 예산이 부족하면 반복 종료
    } else {
      break;
    }
  }
  return answer;
}

console.log(solution([1, 3, 2, 5, 4], 9));
console.log(solution([2, 2, 3, 3], 10));
