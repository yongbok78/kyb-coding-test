function solution(s) {
  s = [...s];
  var odd = true;
  for (var i = 0; i < s.length; i++) {
    if (s[i] === " ") {
      odd = true;
      continue;
    }
    s[i] = odd ? s[i].toUpperCase() : s[i].toLowerCase();
    odd = !odd;
  }
  return s.join("");
}

console.log(solution("try hello world"));
