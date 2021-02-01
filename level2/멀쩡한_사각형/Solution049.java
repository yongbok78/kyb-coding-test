import java.math.BigInteger;

class Solution049 {
    public long solution(int w, int h) {
        long answer = (long) w * (long) h;
        BigInteger gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h));

        return answer - ((long) w + (long) h - gcd.longValue());
    }

    public static void main(String[] args) {
        Solution049 s = new Solution049();
        System.out.println(s.solution(8, 12));
    }
}
