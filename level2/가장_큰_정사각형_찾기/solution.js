function solution(board) {
  var max = 0;
  if (board.length == 1 || board[0].length == 1) {
    for (let i = 0; i < board.length; i++) {
      for (let j = 0; j < board[0].length; j++) {
        if (board[i][j] === 1) return 1;
      }
    }
    return 0;
  }

  for (let i = 1; i < board.length; i++) {
    for (let j = 1; j < board[0].length; j++) {
      if (board[i][j] === 1) {
        board[i][j] =
          Math.min(board[i - 1][j], board[i][j - 1], board[i - 1][j - 1]) + 1;
        if (max < board[i][j]) max = board[i][j];
      }
    }
  }

  return max * max;
}

console.log(
  solution([
    [0, 1, 1, 1],
    [1, 1, 1, 1],
    [1, 1, 1, 1],
    [0, 0, 1, 0],
  ])
);
console.log(
  solution([
    [0, 0, 1, 1],
    [1, 1, 1, 1],
  ])
);
