function solution(n) {
  var answer = 0;
  const oneCnt = n
    .toString(2)
    .split("")
    .filter((v) => v === "1").length;
  while (true) {
    n++;
    if (
      oneCnt ===
      n
        .toString(2)
        .split("")
        .filter((v) => v === "1").length
    ) {
      answer = n;
      break;
    }
  }
  return answer;
}

console.log(solution(78));
console.log(solution(15));
