function solution(progresses, speeds) {
  // 각 작업이 몇일 걸려 완료되는지 계산
  var days = progresses.map((v, i) => {
    var d = 0;
    while (v < 100) {
      d++;
      v += speeds[i];
    }
    return d;
  });

  var answer = [];
  while (true) {
    var d = days[0];

    var cutIdx = days.indexOf(days.find((v) => v > d));
    if (cutIdx === -1) {
      answer.push(days.length);
      break;
    } else {
      answer.push(cutIdx);
      days.splice(0, cutIdx);
    }
  }

  return answer;
}

console.log(solution([93, 30, 55], [1, 30, 5]));
console.log(solution([95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]));
