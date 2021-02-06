import java.util.Stack;

class FourBlocks {
    public int solution(int m, int n, String[] board) {
        String[][] mat = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = "" + board[i].charAt(j);
            }
        }

        while (true) {
            // 같은 블럭은 소문자로
            boolean isSame = false;
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (mat[i][j].equals("0"))
                        continue;
                    String b1 = mat[i - 1][j - 1].toLowerCase();
                    String b2 = mat[i - 1][j].toLowerCase();
                    String b3 = mat[i][j - 1].toLowerCase();
                    String b4 = mat[i][j].toLowerCase();
                    if (b1.equals(b2) && b2.equals(b3) && b3.equals(b4)) {
                        mat[i - 1][j - 1] = b1;
                        mat[i - 1][j] = b2;
                        mat[i][j - 1] = b3;
                        mat[i][j] = b4;
                        isSame = true;
                    }
                }
            }
            if (!isSame)
                break;

            // 밑에 채워주고 지운건 0으로 바꿔준다.
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    String s = mat[j][i];
                    if (s.matches("[A-Z]"))
                        stack.add(s);
                    mat[j][i] = "0";
                }
                for (int j = m - 1; j >= 0; j--) {
                    if (stack.empty())
                        break;
                    mat[j][i] = stack.pop();
                }
            }
        }

        // 0의 갯수가 지운 갯수
        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j].equals("0"))
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FourBlocks s = new FourBlocks();
        System.out.println(s.solution(4, 5, new String[] {"CCBDE", "AAADE", "AAABF", "CCBBF"}));
        System.out.println(s.solution(6, 6,
                new String[] {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}));
    }
}
