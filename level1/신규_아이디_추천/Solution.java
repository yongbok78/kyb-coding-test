class Solution {
    public String solution(String new_id) {
        // 1. 소문자로 치환
        String answer = new_id.toLowerCase()
                // 2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
                .replaceAll("[^a-z0-9-_.]", "")
                // 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
                .replaceAll("\\.+", ".")
                // 4. 마침표(.)가 처음이나 끝에 위치한다면 제거
                .replaceAll("(^\\.|\\.$)", "");
        // 5. 빈 문자열이라면 "a"를 대입
        if (answer.length() == 0)
            answer = "a";

        // 6. 15개의 문자를 제외한 나머지 문자들을 모두 제거
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            // 끝에 있는 마침표(.)제거
            if (answer.charAt(answer.length() - 1) == '.')
                answer = answer.substring(0, 14);
        }
        // 7. 길이가 2자 이하라면 길가 3이 될때까지 마지막 문자 반복
        if (answer.length() < 3)
            answer += answer.substring(answer.length() - 1, answer.length())
                    .repeat(3 - answer.length());
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(s.solution("z-+.^."));
        System.out.println(s.solution("=.="));
        System.out.println(s.solution("123_.def"));
        System.out.println(s.solution("abcdefghijklmn.p"));
    }
}
