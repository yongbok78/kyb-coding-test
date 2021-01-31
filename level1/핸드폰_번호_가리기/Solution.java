class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length() - 4;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < len; i++) {
            answer.append("*");
        }
        answer.append(phone_number.substring(len));
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("01033334444"));
        System.out.println(s.solution("027778888"));
    }
}
