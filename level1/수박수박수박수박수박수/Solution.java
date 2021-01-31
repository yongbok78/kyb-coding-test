class Solution {
    public String solution(int n) {
        char[] subak = {'수', '박'};
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append(subak[i % 2]);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3));
        System.out.println(s.solution(4));
    }
}
