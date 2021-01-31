class Solution {
    public int solution(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i <= n; i++)
            primes[i] = true;

        // 제곱근 이하까지 찾으면 됨
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (primes[i] == true) {
                for (double j = i; i * j <= n; j++)
                    primes[(int) (i * j)] = false;
            }
        }
        int answer = 0;
        for (int i = 2; i <= n; i++)
            if (primes[i] == true)
                answer++;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
        System.out.println(s.solution(5));
    }
}
