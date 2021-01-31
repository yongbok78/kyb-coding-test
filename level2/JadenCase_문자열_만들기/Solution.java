class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        answer.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ')
                answer.append(Character.toUpperCase(s.charAt(i)));
            else
                answer.append(Character.toLowerCase(s.charAt(i)));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("3people unFollowed me"));
        System.out.println(s.solution("for the last week"));
    }
}
