function solution(expression) {
  let prioritys = [
    ["*", "+", "-"],
    ["*", "-", "+"],
    ["+", "*", "-"],
    ["+", "-", "*"],
    ["-", "*", "+"],
    ["-", "+", "*"],
  ];
  let expList = [];
  let num = "";
  for (let i = 0; i < expression.length; i++) {
    if (/[*+-]/.test(expression[i])) {
      expList.push(num);
      expList.push(expression[i]);
      num = "";
      continue;
    }
    num += expression[i];
  }
  expList.push(num);

  var answer = 0;
  for (const ps of prioritys) {
    let tmp = expList.slice();
    for (const p of ps) {
      for (let i = 1; i < tmp.length; i += 2) {
        if (tmp[i] === p) {
          tmp[i - 1] = eval(`${tmp[i - 1]}${tmp[i]}${tmp[i + 1]}`);
          tmp.splice(i, 2);
          i -= 2;
        }
      }
    }
    const val = Math.abs(tmp[0]);
    if (answer < val) answer = val;
  }
  return answer;
}

console.log(solution("100-200*300-500+20"));
console.log(solution("50*6-3*2"));
