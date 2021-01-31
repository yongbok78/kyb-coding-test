function solution(strings, n) {
  var answer = [];
  return strings.sort((s1, s2) => {
    var r = 0;
    if (s1[n] === s2[n]) r = s1 === s2 ? 0 : s1 > s2 ? 1 : -1;
    else r = s1[n] === s2[n] ? 0 : s1[n] > s2[n] ? 1 : -1;
    return r;
  });
}

console.log(solution([sun, bed, car], 1));
console.log(solution([abce, abcd, cdx], 2));
