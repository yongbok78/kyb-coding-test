function solution(s, n) {
  var answer = [...s]
    .map((c) => {
      if (c === " ") return c;
      var intC = c.charCodeAt();
      var newC = intC + n;
      // 대문자일 경우
      if (intC >= 65 && intC <= 90) {
        if (newC > 90) newC -= 26;
        // 소문자일 경우
      } else if (intC >= 97 && intC <= 122) {
        if (newC > 122) newC -= 26;
        //나머지 문자는 그대로
      } else newC = intC;
      return String.fromCharCode(newC);
    })
    .join("");
  return answer;
}

console.log("AB", 1);
console.log("z", 1);
console.log("a B z", 1);
