class Solution061 {
    boolean solution(String s) {
        // 문자열 시작이 닫는 괄호이거나 끝이 닫는 괄호이면 올바르지 않습니다.
        if (s.startsWith(")") || s.endsWith("("))
            return false;
        int openCnt = 0, closeCnt = 0, beforeIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                openCnt++;
            else if (s.charAt(i) == ')')
                closeCnt++;
            // 여는 괄호와 닫는 괄호 숫자가 같을 때
            if ((openCnt > 0 || closeCnt > 0) && openCnt == closeCnt) {
                // 문자열 시작이 닫는 괄호이거나 끝이 닫는 괄호이면 올바르지 않습니다.
                if (s.charAt(beforeIdx) == ')' || s.charAt(i) == '(')
                    return false;
                else {
                    // 올바른 괄호이니 카운팅 초기화
                    openCnt = 0;
                    closeCnt = 0;
                    beforeIdx = i + 1;
                }
            }
        }
        boolean answer = true;
        if (openCnt != closeCnt)
            answer = false;
        return answer;
    }

    public static void main(String[] args) {
        Solution061 s = new Solution061();
        System.out.println(s.solution("()()"));
        System.out.println(s.solution("(())()"));
        System.out.println(s.solution(")()("));
        System.out.println(s.solution("(()("));
    }
}
