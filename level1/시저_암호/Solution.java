class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            answer.append(changeChar(s.charAt(i), n));
        }

        return answer.toString();
    }

    private char changeChar(char c, int n) {
        int intC = c;
        int newC = c + n;
        // 소문자 변환
        if (intC >= 97 && intC <= 122) {
            // z보다 커지면 a쪽으로
            if (newC > 122)
                newC -= 26;
            // 대문자 변환
        } else if (intC >= 65 && intC <= 90) {
            // Z보다 커지면 A쪽으로
            if (newC > 90)
                newC -= 26;
            // 나머지 문자는 그냥 표시 되도록
        } else
            newC = intC;
        return (char) newC;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("AB", 1));
        System.out.println(s.solution("z", 1));
        System.out.println(s.solution("a B z", 4));
    }
}
