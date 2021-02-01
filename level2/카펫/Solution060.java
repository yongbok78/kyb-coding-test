import java.util.Arrays;

class Solution060 {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        // 제곱근이 정수이면 정사각형
        double sqrt = Math.sqrt(sum);
        if (sqrt % 1 == 0)
            return new int[] {(int) sqrt, (int) sqrt};
        int x = 0, y = 0;
        for (int i = (int) sqrt; i >= 1; i--) {
            // 제곱근 근사치 정수부터 줄여나가면서 나누어 떨어질때
            if (sum % i == 0) {
                x = sum / i;
                y = i;
                // 노랑색 갯수와 같으면 가로, 세로가 구해짐
                if (yellow == (x - 2) * (y - 2))
                    break;
            }
        }
        int[] answer = {x, y};
        return answer;
    }

    public static void main(String[] args) {
        Solution060 s = new Solution060();
        System.out.println(Arrays.toString(s.solution(10, 2)));
        System.out.println(Arrays.toString(s.solution(8, 1)));
        System.out.println(Arrays.toString(s.solution(24, 24)));
    }
}
