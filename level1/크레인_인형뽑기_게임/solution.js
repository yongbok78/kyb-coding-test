function solution(board, moves) {
  var answer = 0;
  var stack = [];
  for (var move of moves) {
    for (var i = 0; i < board.length; i++) {
      // 크레인 이동
      var bv = board[i][move - 1];
      // 이도한 칸에 인형이 있을 때
      if (bv > 0) {
        // 바구니가 비어있으면 바로 담고
        if (stack.length === 0) stack.push(bv);
        else {
          var spv = stack.pop();
          //같은 인형이 있으면 2개 삭제하고 없어면 그냥 담는다.
          if (bv === spv) answer += 2;
          else {
            stack.push(spv);
            stack.push(bv);
          }
        }
        board[i][move - 1] = 0;
        break;
      }
    }
  }
  return answer;
}

console.log(
  solution(
    [
      [0, 0, 0, 0, 0],
      [0, 0, 1, 0, 3],
      [0, 2, 5, 0, 1],
      [4, 2, 4, 4, 2],
      [3, 5, 1, 3, 1],
    ],
    [1, 5, 3, 5, 1, 2, 1, 4]
  )
);
