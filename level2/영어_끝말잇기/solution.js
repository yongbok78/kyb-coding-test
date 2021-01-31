function solution(n, words) {
  let answer = [0, 0];
  // 한 글자인 단어는 인정되지 않습니다.
  if (words[0].length === 1) return [1, 1];

  let failIdx = -1;
  for (let i = 1; i < words.length; i++) {
    const w1 = words[i - 1];
    const w2 = words[i];
    // 한 글자인 단어는 인정되지 않습니다.
    // 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
    if (w2.length === 1 || w1[w1.length - 1] !== w2[0]) {
      failIdx = i;
      break;
    }

    // 이전에 등장했던 단어는 사용할 수 없습니다.
    if (words.indexOf(w2) !== i) {
      failIdx = i;
      break;
    }
  }

  if (failIdx > -1) {
    answer[0] = (failIdx % n) + 1;
    answer[1] = Math.floor(failIdx / n) + 1;
  }
  return answer;
}

console.log(
  solution([
    "tank",
    "kick",
    "know",
    "wheel",
    "land",
    "dream",
    "mother",
    "robot",
    "tank",
  ])
);
console.log(
  solution([
    "hello",
    "observe",
    "effect",
    "take",
    "either",
    "recognize",
    "encourage",
    "ensure",
    "establish",
    "hang",
    "gather",
    "refer",
    "reference",
    "estimate",
    "executive",
  ])
);
console.log(
  solution(["hello", "one", "even", "never", "now", "world", "draw"])
);
