class Solution {
    public int[] solution(long n) {
        char[] cs = String.valueOf(n).toCharArray();
        int len = cs.length;
        int[] r = new int[len];
        len--;
        for (int i = 0; i <= len; i++) {
            r[i] = cs[len - i] - 48;
        }
        return r;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(12345)));
    }
}
