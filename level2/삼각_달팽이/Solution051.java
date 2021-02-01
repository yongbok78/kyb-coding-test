import java.util.ArrayList;
import java.util.Arrays;

class Solution051 {
    public int[] solution(int n) {
        int[][] mat = new int[n][n];

        // 삼각형에 값을 채워넣음
        int x = -1, y = 0, no = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                mat[x][y] = no++;
            }
        }

        // 삼각형에서 자례대로 값을 꺼내와 결과 배열에 넣어줌
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0)
                    break;
                results.add(mat[i][j]);
            }
        }

        int[] answer = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            answer[i] = results.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution051 s = new Solution051();
        System.out.println(Arrays.toString(s.solution(4)));
        System.out.println(Arrays.toString(s.solution(5)));
        System.out.println(Arrays.toString(s.solution(6)));
    }
}
