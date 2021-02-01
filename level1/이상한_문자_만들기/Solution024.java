class Solution024 {
    public String solution(String s) {
        char[] cs = s.toCharArray();
        boolean odd = true;
        for (int i = 0; i < s.length(); i++) {
            if (cs[i] == ' ') {
                odd = true;
                continue;
            }
            cs[i] = odd ? Character.toUpperCase(cs[i]) : Character.toLowerCase(cs[i]);
            odd = !odd;
        }
        return String.valueOf(cs);
    }

    public static void main(String[] args) {
        Solution024 s = new Solution024();
        System.out.println(s.solution("try hello world"));
    }
}
