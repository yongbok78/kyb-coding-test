function solution(s) {
  var answer = true;
  // 문자열의 시작이 닫는괄호 이거나 끝이 여는 괄호이면 올바르지 않은 괄호
  if (s.startsWith(")") || s.endsWith("(")) return false;

  let [openCnt, closeCnt, beforeIdx] = [0, 0, 0];
  for (let i = 0; i < s.length; i++) {
    if (s.charAt(i) === "(") openCnt++;
    else if (s.charAt(i) === ")") closeCnt++;
    // 여는 괄호와 닫는 괄호의 갯수가 같으면
    if (openCnt > 0 && openCnt === closeCnt) {
      // 문자열의 시작이 닫는괄호 이거나 끝이 여는 괄호이면 올바르지 않은 괄호
      if (s.charAt(beforeIdx) === ")" || s.charAt(i) === "(") return false;
      else {
        // 카운팅 초기화
        beforeIdx = i + 1;
        openCnt = 0;
        closeCnt = 0;
      }
    }
  }
  // 문자열 탐색 후 여는 괄호와 닫는 괄호의 갯수가 다르면 올바르지 않은 괄호
  if (openCnt != closeCnt) answer = false;
  return answer;
}

console.log(solution("()()"));
console.log(solution("(())()"));
console.log(solution(")()("));
console.log(solution("(()("));
