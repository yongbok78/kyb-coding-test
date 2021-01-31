class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int m = arr1.length, n = arr2[0].length, l = arr2.length;
        int[][] answer = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < l; k++) {
                for (int j = 0; j < n; j++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(
                s.solution(new int[][] {{1, 4}, {3, 2}, {4, 1}}, new int[][] {{3, 3}, {3, 3}})));
        System.out.println(Arrays.toString(s.solution(new int[][] {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}},
                new int[][] {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}})));
    }
}
