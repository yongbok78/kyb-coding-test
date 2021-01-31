class Solution {
    public int solution(int num) {
        long n = num;
        int cnt = 0;
        // 주어진 수가 1이 될 때까지 반복
        while (n != 1) {
            // 짝수면 2로나누고
            if (n % 2 == 0)
                n /= 2;
            // 홀수면 3을 곱하고 1을 더한다
            else
                n = n * 3 + 1;
            cnt++;
            // 500회 반복했으면 반복 중지하면서 -1반환
            if (cnt == 500)
                return -1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(6));
        System.out.println(s.solution(16));
        System.out.println(s.solution(626331));
    }
}
