function solution(name) {
  var answer = 0;
  let len = name.length;
  //각각 문자의 최소 상하이동은 모두 더해둔다.
  for (var i = 0; i < len; i++) {
    let cca = name.charCodeAt(i);
    answer +=
      name.charAt(i) > "M"
        ? "Z".charCodeAt() - cca + 1
        : cca - "A".charCodeAt();
  }

  let min = len - 1;
  // A가 포함되지 않으면 왼쪽부터 끝까지 가는게 최소이동
  if (name.indexOf("A") === -1) return answer + min;

  for (let i = 1; i < len; i++) {
    if (name[i] === "A") {
      for (var j = i + 1; j < len; j++) {
        if (name[j] !== "A") {
          break;
        }
      }

      const left = i - 1;
      const right = len - j;
      // 다른 사람 풀이를 참고 했는데 *2가 해깔린다...
      min = Math.min(min, left > right ? left + right * 2 : left * 2 + right);

      i = j;
    }
  }
  return answer + min;
}

console.log(solution("BBBAAABBAABBABB"));
console.log(solution("JEROEN"));
console.log(solution("JAN"));
console.log(solution("BBBBBBBBBABB"));
console.log(solution("AAAAAAAABAAAAAAAA"));
