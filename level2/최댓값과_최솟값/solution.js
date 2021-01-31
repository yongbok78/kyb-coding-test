function solution(s) {
  let arr = s
    .split(" ")
    .map((v) => Number(v))
    .sort((a, b) => a - b);
  var answer = [arr[0], arr[arr.length - 1]].join(" ");
  return answer;
}

console.log(solution("1 2 3 4"));
console.log(solution("-1 -2 -3 -4"));
console.log(solution("-1 -1"));
