import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] cmd = commands[i];
            // 배열을 자르고
            int[] arr = Arrays.copyOfRange(array, cmd[0] - 1, cmd[1]);
            // 오름차순 정렬
            Arrays.sort(arr);
            answer[i] = arr[cmd[2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[] {1, 5, 2, 6, 3, 7, 4},
                new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}
