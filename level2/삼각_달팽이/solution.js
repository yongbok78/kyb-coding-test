function solution(n) {
  // 삼각형 배열 생성
  var answer = Array(n)
    .fill()
    .map((_, i) => Array(i + 1).fill());
  let [x, y, cnt] = [-1, 0, 1];
  for (let i = 0; i < n; i++) {
    for (let j = i; j < n; j++) {
      if (i % 3 === 0) {
        // 삼각형에서 아래로 이동
        x++;
      } else if (i % 3 === 1) {
        // 삼각형에서 오른쪽으로 이동
        y++;
      } else if (i % 3 === 2) {
        // 삼각형에서 왼쪽 위로 이동
        x--;
        y--;
      }
      answer[x][y] = cnt++;
    }
  }
  return answer.flat();
}

console.log(solution(4));
console.log(solution(5));
console.log(solution(6));
