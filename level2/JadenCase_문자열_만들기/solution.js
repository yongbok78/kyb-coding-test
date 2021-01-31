function solution(s) {
  var answer = s[0].toUpperCase();
  for (var i = 1; i < s.length; i++) {
    if (s[i - 1] === " ") {
      answer += s[i].toUpperCase();
    } else answer += s[i].toLowerCase();
  }
  return answer;
}

console.log(solution("3people unFollowed me"));
console.log(solution("for the last week"));
