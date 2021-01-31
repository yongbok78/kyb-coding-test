class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                answer += i;
        }
        return answer + n;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(12));
        System.out.println(s.solution(5));
    }
}
