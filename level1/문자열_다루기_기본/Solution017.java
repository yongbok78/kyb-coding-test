class Solution017 {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6)
            return false;
        return s.matches("^\\d+$");
    }

    public static void main(String[] args) {
        Solution017 s = new Solution017();
        System.out.println(s.solution("a234"));
        System.out.println(s.solution("1234"));
    }
}
