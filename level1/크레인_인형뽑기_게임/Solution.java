import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                // 크레인 이동
                int bv = board[i][move - 1];
                // 인형이 있을 때
                if (bv > 0) {
                    // 바구니가 비어있으면 그냥 담고
                    if (stack.empty())
                        stack.push(bv);
                    else {
                        // 바구니에 같은 인형있으면 인형 2개 삭제. 없으면 그냥 담는다.
                        if (stack.peek() == bv) {
                            answer += 2;
                            stack.pop();
                        } else
                            stack.push(bv);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out
                .println(s.solution(
                        new int[][] {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1},
                                {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}},
                        new int[] {1, 5, 3, 5, 1, 2, 1, 4}));
    }
}
