import java.math.BigInteger;

class Solution {
    public long solution(int w, int h) {
        long answer = (long) w * (long) h;
        BigInteger gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h));

        return answer - ((long) w + (long) h - gcd.longValue());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(8, 12));
    }
}
