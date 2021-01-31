function solution(msg) {
  var answer = [];
  let dic = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

  let word1 = "";
  let word2 = "";
  for (let i = 0; i < msg.length; i++) {
    // 단어
    word1 += msg[i];
    // 단어 + 다음 한글자
    word2 = word1 + msg[i + 1];
    // word2가 사전에 있으면
    if (dic.includes(word2)) {
      continue;
    } else {
      // 결과에 word1 입력
      answer.push(word1);
      // 사전에 word2 등록
      dic.push(word2);
    }
    word1 = "";
    word2 = "";
  }
  // 입력된 단어를 사전에서 index를 찾아 +1 해준다
  return answer.map((w) => dic.indexOf(w) + 1);
}

console.log(solution("KAKAO"));
console.log(solution("TOBEORNOTTOBEORTOBEORNOT"));
console.log(solution("ABABABABABABABAB"));
