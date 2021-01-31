function solution(number, k) {
  let stack = [];
  for (let i = 0; i < number.length; i++) {
    const n = number[i];
    while (k > 0 && n > stack[stack.length - 1]) {
      stack.pop();
      k--;
    }
    stack.push(n);
  }
  let answer = stack.join("");
  return answer;
}

console.log(solution("1924", 2));
console.log(solution("1231234", 3));
console.log(solution("4177252841", 4));
