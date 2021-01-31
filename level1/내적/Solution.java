class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 || b[i] == 0)
                continue;
            answer += a[i] * b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1,2,3,4]},new int[]{-3,-1,0,2})));
        System.out.println(Arrays.toString(s.solution(new int[]{[-1,0,1},new int[]{	1,0,-1})));
}
}
