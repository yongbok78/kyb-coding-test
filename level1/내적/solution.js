function solution(a, b) {
  var answer = a.reduce((acc, cur, i) => {
    if (cur === 0 || b[i] === 0) return acc;
    return acc + cur * b[i];
  }, 0);
  return answer;
}

console.log(solution([1, 2, 3, 4], [-3, -1, 0, 2]));
console.log(solution([-1, 0, 1], [1, 0, -1]));
