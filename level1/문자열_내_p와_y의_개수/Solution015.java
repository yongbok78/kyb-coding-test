class Solution015 {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p' || c == 'P')
                pCnt++;
            else if (c == 'y' || c == 'Y')
                yCnt++;
        }
        boolean answer = pCnt == yCnt;
        return answer;
    }

    public static void main(String[] args) {
        Solution015 s = new Solution015();
        System.out.println(s.solution("pPoooyY"));
        System.out.println(s.solution("Pyy"));
    }
}
