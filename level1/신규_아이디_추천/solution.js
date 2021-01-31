function solution(new_id) {
  var answer = new_id
    //1. 소문자로 치환
    .toLowerCase()
    //2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
    .replace(/[^a-z0-9-_.]/g, "")
    //3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
    .replace(/\.+/g, ".")
    //4. 마침표(.)가 처음이나 끝에 위치한다면 제거
    .replace(/(^\.|\.$)/g, "");

  //5. 빈 문자열이라면 "a"를 대입
  if (answer.length === 0) answer = "a";
  //6. 15개의 문자를 제외한 나머지 문자들을 모두 제거
  if (answer.length > 15) {
    answer = answer.substr(0, 15);
    //끝에 있는 마침표(.)제거
    if (answer[answer.length - 1] === ".") answer = answer.substr(0, 14);
  }
  //7. 길이가 2자 이하라면 길가 3이 될때까지 마지막 문자 반복
  if (answer.length < 3)
    answer += answer[answer.length - 1].repeat(3 - answer.length);
  return answer;
}

console.log(solution("...!@BaT#*..y.abcdefghijklm"));
console.log(solution("z-+.^."));
console.log(solution("=.="));
console.log(solution("123_.def"));
console.log(solution("abcdefghijklmn.p"));
