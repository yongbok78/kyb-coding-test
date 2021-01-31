function solution(n) {
  let answer = 1;
  for (let i = 1, max = Math.ceil(n / 2); i < max; i++) {
    let sum = 0;
    for (let j = i; j <= max; j++) {
      sum += j;
      if (sum > n) break;
      if (sum === n) answer++;
    }
  }
  return answer;
}

console.log(solution(15));
