function solution(n, t, m, p) {
  var answer = "";
  let pointer = p - 1;
  let i = 1;
  let nums = "0";
  while (answer.length < t) {
    nums += i.toString(n);
    i++;
    if (nums.length <= pointer) continue;
    else {
      answer += nums[pointer];
      pointer += m;
    }
  }
  return answer.toUpperCase();
}

console.log(solution(2, 4, 2, 1));
console.log(solution(16, 16, 2, 1));
console.log(solution(16, 16, 2, 2));
