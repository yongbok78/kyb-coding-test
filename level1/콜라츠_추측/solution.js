function solution(num) {
  var cnt = 0;
  // 주어진 수가 1이 될 때까지 반복
  while (num !== 1) {
    // 짝수이면 2로나누고
    if (num % 2 === 0) num /= 2;
    // 홀수이면 3을 곱해서 1을 더한다
    else num = num * 3 + 1;
    cnt++;
    // 500회 반복했으면 반복 중지하면서 -1반환
    if (cnt === 500) return -1;
  }
  return cnt;
}

console.log(solution(6));
console.log(solution(16));
console.log(solution(626331));
