function solution(participant, completion) {
  var answer = "";
  var m = {};
  // 선수정보 초기화, 동명이인이 있으면 추가
  for (var p of participant) {
    if (m[p]) m[p]++;
    else m[p] = 1;
  }
  //완주한 선수는 빼주고
  for (var c of completion) {
    m[c]--;
  }
  //완주 못한 선수를 찾는다.
  for (var k in m) {
    var v = m[k];
    if (v > 0) {
      answer = k;
      break;
    }
  }
  return answer;
}

console.log(solution(["leo", "kiki", "eden"], ["eden", "kiki"]));
console.log(
  solution(
    ["marina", "josipa", "nikola", "vinko", "filipa"],
    ["josipa", "filipa", "marina", "nikola"]
  )
);
console.log(
  solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"])
);
