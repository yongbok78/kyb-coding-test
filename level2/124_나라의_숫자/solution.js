function solution(n) {
  var answer = "";
  var nums = [4, 1, 2];
  while (n > 0) {
    answer = nums[n % 3] + answer;
    if (n % 3 === 0) n--; // 자릿수 하나 줄임
    n = parseInt(n / 3);
  }
  return answer;
}

console.log(solution(1));
console.log(solution(2));
console.log(solution(3));
console.log(solution(4));
