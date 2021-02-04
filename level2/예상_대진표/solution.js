function solution(n, a, b) {
  let half = n / 2;
  if (a > b) {
    let tmp = b;
    b = a;
    a = tmp;
  }

  if (a <= half && b > half) {
    let cnt = 0;
    while (true) {
      n /= 2;
      cnt++;
      if (n == 1) break;
    }
    return cnt;
  }

  if (a > half) {
    a -= half;
    b -= half;
  }
  return solution(half, a, b);
}

// 다른 사람 풀이
function solution2(n, a, b) {
  let answer = 0;
  while (a !== b) {
    a = Math.ceil(a / 2);
    b = Math.ceil(b / 2);
    answer++;
  }
  return answer;
}

console.log(solution(8, 4, 7));
