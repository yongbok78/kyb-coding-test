class Solution {
    public String solution(String p) {
        if (p.length() == 0)
            return "";
        int openCnt = 0, closeCnt = 0;
        // 두 문자열 u, v로 분리
        // 문자열을 차례로 탐색하면 여는괄호와 닫는 괄호의 갯수가 같아지면 u, v로 분리
        String u = "", v = "";
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(')
                openCnt++;
            else if (p.charAt(i) == ')')
                closeCnt++;
            if (openCnt > 0 && openCnt == closeCnt) {
                u = p.substring(0, i + 1);
                v = p.substring(i + 1);
                break;
            }
        }

        String answer = "";
        // u가 여는 괄호로 시작되면 올바른 괄호로 봐도됨
        if (u.startsWith("(")) {
            // v에 대해 재귀적으로 수행
            answer = u + solution(v);
        } else {
            // v에 재귀적으로 수행한 것을 괄호로 감싸준다.
            answer = "(" + solution(v) + ")";
            // u의 앞뒤 문자 제거하고 괄호 방향을 뒤집어준다.
            String tmp = u.substring(1, u.length() - 1);
            for (int i = 0; i < tmp.length(); i++) {
                answer += tmp.charAt(i) == '(' ? ")" : "(";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("(()())()"));
        System.out.println(s.solution(")("));
        System.out.println(s.solution("()))((()"));
    }
}
