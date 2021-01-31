import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            // 부서 예산이 남은 예산 이하이면
            if (d[i] <= budget) {
                // 남은 예산에서 빼준다
                budget -= d[i];
                answer++;
                // 남은 예산이 부족하면 반복문 종료
            } else {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[] {1, 3, 2, 5, 4}, 9));
        System.out.println(s.solution(new int[] {2, 2, 3, 3}, 10));
    }
}
