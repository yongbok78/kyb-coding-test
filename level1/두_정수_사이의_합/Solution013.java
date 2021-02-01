class Solution013 {
    public long solution(int a, int b) {
        return sum(Math.min(a, b), Math.max(b, a));
    }

    // 등차수열 공식
    private long sum(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

    public static void main(String[] args) {
        Solution013 s = new Solution013();
        System.out.println(s.solution(3, 5));
        System.out.println(s.solution(3, 3));
        System.out.println(s.solution(5, 3));
    }
}
