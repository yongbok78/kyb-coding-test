function solution(numbers, hand) {
  var l = "*";
  var r = "#";
  return numbers
    .map((n) => {
      // 키패드 1,4,7은 무조건 왼손
      if ([1, 4, 7].includes(n)) {
        l = n;
        return "L";
        // 키패드 3,6,9는 무조건 오른손
      } else if ([3, 6, 9].includes(n)) {
        r = n;
        return "R";
      } else {
        // 손가락 이동거리 확인
        var lm = move(l, n);
        var rm = move(r, n);
        // 오른손 이동거리가 작으면
        if (lm > rm) {
          r = n;
          return "R";
          // 왼손 이동거리가 작으면
        } else if (lm < rm) {
          l = n;
          return "L";
          // 이동거리가 같으면
        } else {
          // 오른손/왼손 잡이 판별
          if (hand === "right") {
            r = n;
            return "R";
          } else {
            l = n;
            return "L";
          }
        }
      }
    })
    .join("");
}

// 이동거리 확인 함수
function move(pos, num) {
  // 키패드 좌표 설정
  var keypad = {
    1: [0, 0],
    2: [0, 1],
    3: [0, 2],
    4: [1, 0],
    5: [1, 1],
    6: [1, 2],
    7: [2, 0],
    8: [2, 1],
    9: [2, 2],
    "*": [3, 0],
    0: [3, 1],
    "#": [3, 2],
  };

  var p = keypad[pos];
  var n = keypad[num];

  return Math.abs(p[0] - n[0]) + Math.abs(p[1] - n[1]);
}

console.log(solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], "right"));
console.log(solution([7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2], "left"));
console.log(solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 0], "right"));
