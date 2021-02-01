class Solution050 {
    public int solution(String s) {
        int answer = s.length();
        if (answer == 1)
            return 1;

        // 전체 길이의 반이상은 압축이 불가능 함
        for (int i = 1; i < s.length() / 2 + 1; i++) {
            StringBuilder zip = new StringBuilder();
            String before = s.substring(0, i);
            int cnt = 1;
            for (int j = i; j < s.length(); j += i) {
                String c = "";
                try {
                    c = s.substring(j, j + i);
                } catch (Exception e) {
                    c = s.substring(j);
                }
                if (before.equals(c))
                    cnt++;
                else {
                    String tmp = before;
                    if (cnt > 1)
                        tmp = cnt + tmp;
                    zip.append(tmp);
                    cnt = 1;
                    before = c;
                }
                if (j + i >= s.length()) {
                    String tmp = s.substring(j);
                    if (cnt > 1)
                        tmp = cnt + c;
                    zip.append(tmp);
                    break;
                }
            }
            answer = answer > zip.length() ? zip.length() : answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution050 s = new Solution050();
        System.out.println(s.solution("aabbaccc"));
        System.out.println(s.solution("ababcdcdababcdcd"));
        System.out.println(s.solution("abcabcdede"));
        System.out.println(s.solution("abcabcabcabcdededededede"));
        System.out.println(s.solution("xababcdcdababcdcd"));
    }
}
