class Solution {
    public String solution(String s) {
        int c = s.length() / 2;
        String answer = s.substring(c - (s.length() % 2 == 0 ? 1 : 0), c + 1);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcde"));
        System.out.println(s.solution("qwer"));
    }
}
