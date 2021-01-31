function solution(answers) {
  var patterns = [
    [1, 2, 3, 4, 5], //1번 학생 패턴
    [2, 1, 2, 3, 2, 4, 2, 5], //2번 학생 패턴
    [3, 3, 1, 1, 2, 2, 4, 4, 5, 5], //3번 학생 패턴
  ];
  // 학생별로 맞은 갯수 카운트
  var scores = patterns.map((v) => 0);
  for (var i = 0; i < answers.length; i++) {
    var v1 = answers[i];
    if (v1 === patterns[0][i % patterns[0].length]) scores[0]++;
    if (v1 === patterns[1][i % patterns[1].length]) scores[1]++;
    if (v1 === patterns[2][i % patterns[2].length]) scores[2]++;
  }
  //결과 정리
  var maxScore = Math.max(...scores);
  var answer = scores.reduce((acc, cur, i) => {
    if (maxScore === cur) acc.push(i + 1);
    return acc;
  }, []);
  return answer;
}

console.log(solution([1, 2, 3, 4, 5]));
console.log(solution([1, 3, 2, 4, 2]));
