class Solution028 {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        // 제곱근 값이 정수라면
        if (String.valueOf(sqrt).endsWith(".0")) {
            return (long) Math.pow(sqrt + 1, 2);
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution028 s = new Solution028();
        System.out.println(s.solution(121));
        System.out.println(s.solution(3));
    }
}
