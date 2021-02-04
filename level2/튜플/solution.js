function solution(s) {
  let m = {};
  s.replace(/[{}]/g, "")
    .split(",")
    .forEach((n) => {
      m[n] = (m[n] || 0) + 1;
    });

  var answer = Object.entries(m);
  return answer.sort((a, b) => b[1] - a[1]).map((a) => Number(a[0]));
}

console.log(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
console.log(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"));
console.log(solution("{{20,111},{111}}"));
console.log(solution("{{123}}"));
console.log(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"));
