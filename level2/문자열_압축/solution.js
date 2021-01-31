function solution(s) {
  if (s.length == 1) return 1;
  var answer = s.length;
  // 전체 길이의 반이상은 압축 불가
  for (var i = 1; i < parseInt(s.length / 2) + 1; i++) {
    var zip = "",
      before = s.substr(0, i),
      cur,
      cnt = 1;

    for (var j = i; j < s.length + i; j += i) {
      cur = s.substr(j, i);
      if (before === cur) cnt++;
      else {
        zip += (cnt === 1 ? "" : cnt) + before;
        cnt = 1;
        before = cur;
      }
    }
    answer = answer > zip.length ? zip.length : answer;
  }
  return answer;
}

console.log(solution("aabbaccc"));
console.log(solution("ababcdcdababcdcd"));
console.log(solution("abcabcdede"));
console.log(solution("abcabcabcabcdededededede"));
console.log(solution("xababcdcdababcdcd"));
