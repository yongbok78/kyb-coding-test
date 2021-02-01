class Solution038 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * ((long) i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution038 s = new Solution038();
        System.out.println(Arrays.toString(s.solution(2, 5)));
        System.out.println(Arrays.toString(s.solution(4, 3)));
        System.out.println(Arrays.toString(s.solution(-4, 2)));
    }
}
