function solution(s) {
  let stack = [s.charAt(0)];
  for (let i = 1; i < s.length; i++) {
    let c = s.charAt(i);
    if (stack[stack.length - 1] === c) stack.pop();
    else stack.push(c);
  }
  return stack.length ? 0 : 1;
}

console.log(solution("baabaa"));
console.log(solution("cdcd"));
