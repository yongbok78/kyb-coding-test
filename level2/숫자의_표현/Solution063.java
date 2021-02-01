class Solution063 {
    public int solution(int n) {
        int answer = 1;
        int loopCnt = 1;
        int maxCnt = n / 2 + 2;
        while (loopCnt < maxCnt) {
            int sum = 0;
            for (int i = loopCnt; i < maxCnt; i++) {
                sum += i;
                if (sum > n)
                    break;
                if (sum == n) {
                    answer++;
                    break;
                }
            }
            loopCnt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution063 s = new Solution063();
        System.out.println(s.solution(15));
    }
}
