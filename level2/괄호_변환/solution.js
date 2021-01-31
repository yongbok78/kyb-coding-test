function solution(p) {
  if (p.length === 0) return "";

  let [openCnt, closeCnt] = [0, 0];
  let [u, v] = ["", ""];
  for (let i = 0; i < p.length; i++) {
    let c = p.charAt(i);
    if (c === "(") openCnt++;
    else if (c === ")") closeCnt++;
    if (openCnt > 0 && openCnt === closeCnt) {
      u = p.slice(0, i + 1);
      v = p.slice(i + 1);
      break;
    }
  }

  let answer = "";
  if (u.startsWith("(")) {
    answer = u + solution(v);
  } else {
    let tmp = u
      .substring(1, u.length - 1)
      .split("")
      .map((c) => (c === "(" ? ")" : "("))
      .join("");
    answer = "(" + solution(v) + ")" + tmp;
  }
  return answer;
}

console.log(solution("(()())()"));
console.log(solution(")("));
console.log(solution("()))((()"));
