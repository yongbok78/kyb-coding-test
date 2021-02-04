class BigSquare {
    public int solution(int[][] board) {
        int max = 0;
        if (board.length == 1 || board[0].length == 1) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 1) {
                        max = 1;
                        break;
                    }
                }
            }
            return max;
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = Math.min(board[i - 1][j],
                            Math.min(board[i][j - 1], board[i - 1][j - 1])) + 1;
                    if (max < board[i][j])
                        max = board[i][j];
                }
            }
        }

        return max * max;
    }

    public static void main(String[] args) {
        BigSquare s = new BigSquare();
        System.out.println(
                s.solution(new int[][] {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}}));
        System.out.println(s.solution(new int[][] {{0, 0, 1, 1}, {1, 1, 1, 1}}));
    }
}
