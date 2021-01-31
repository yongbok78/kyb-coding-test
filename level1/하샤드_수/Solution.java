class Solution {
    public boolean solution(int x) {
        String[] arr = String.valueOf(x).split("");
        int sum = 0;
        for (String v : arr) {
            sum += Integer.parseInt(v);
        }
        return x % sum == 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
        System.out.println(s.solution(12));
        System.out.println(s.solution(11));
        System.out.println(s.solution(13));
    }
}
