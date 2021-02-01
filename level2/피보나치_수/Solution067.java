class Solution067 {
    public int solution(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 0;
        answer[1] = 1;
        for (int i = 2; i <= n; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }
        return answer[n];
    }

    public static void main(String[] args) {
        Solution067 s = new Solution067();
        System.out.println(s.solution(3));
        System.out.println(s.solution(5));
    }
}
