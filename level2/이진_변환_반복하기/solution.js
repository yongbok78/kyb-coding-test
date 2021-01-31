function solution(s) {
  let cnt = 0;
  let del = 0;
  while (s != "1") {
    cnt++;
    del += (s.match(/0/g) || []).length;
    s = s.replace(/0/g, "").length.toString(2);
  }
  var answer = [cnt, del];
  return answer;
}

console.log(solution("110010101001"));
console.log(solution("01110"));
console.log(solution("1111111"));
