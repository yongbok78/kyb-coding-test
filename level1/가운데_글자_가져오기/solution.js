function solution(s) {
  var even = s.length % 2 === 0 ? 1 : 0;
  var answer = s.substr(s.length / 2 - even, 1 + even);
  return answer;
}

console.log(solution("abcde"));
console.log(solution("qwer"));
