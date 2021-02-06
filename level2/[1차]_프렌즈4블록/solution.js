function solution(m, n, board) {
  let mat = new Array(m).fill().map((v) => new Array(m).fill());
  for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
      mat[i][j] = board[i][j];
    }
  }
  while (true) {
    let isSame = false;
    for (let i = 1; i < m; i++) {
      for (let j = 1; j < n; j++) {
        if (mat[i][j] === "0") continue;
        let [b1, b2, b3, b4] = [
          mat[i - 1][j - 1].toLowerCase(),
          mat[i - 1][j].toLowerCase(),
          mat[i][j - 1].toLowerCase(),
          mat[i][j].toLowerCase(),
        ];
        if (b1 === b2 && b2 === b3 && b3 === b4) {
          mat[i - 1][j - 1] = b1;
          mat[i - 1][j] = b2;
          mat[i][j - 1] = b3;
          mat[i][j] = b4;
          isSame = true;
        }
      }
    }
    if (!isSame) break;

    let stack = [];
    for (let j = 0; j < n; j++) {
      for (let i = 0; i < m; i++) {
        let s = mat[i][j];
        if (/[A-Z]/.test(s)) stack.push(s);
        mat[i][j] = "0";
      }

      for (let i = m - 1; i >= 0; i--) {
        if (stack.length === 0) break;
        mat[i][j] = stack.pop();
      }
    }
  }

  return mat.flat().filter((v) => v === "0").length;
}

console.log(solution(4, 5, ["CCBDE", "AAADE", "AAABF", "CCBBF"]));
console.log(
  solution(6, 6, ["TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"])
);
