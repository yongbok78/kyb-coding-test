class Solution079 {
    public int solution(String name) {
        int answer = 0;
        // 각 알파벳의 상하이동 최소수는 모두 더함
        for (char c : name.toCharArray()) {
            // M보다 큰경우는 오른쪽에서 커서 이동하는게 작음. N은 같음
            answer += c > 'M' ? 'Z' - c + 1 : c - 'A';
        }

        // 커서 최소 이동수 구하기
        int len = name.length();
        int move = len - 1;
        // A가 없는 경우는 왼쪽부터 끝까지 가는게 최소이동
        if (name.indexOf("A") < 0)
            return answer + move;

        for (int i = 0; i < len; ++i) {
            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }
            move = Math.min(move, i + len - next + Math.min(i, len - next));
        }
        return answer + move;
    }

    public static void main(String[] args) {
        Solution079 s = new Solution079();
        System.out.println(s.solution("BBAAAAABAAB"));
        System.out.println(s.solution("JEROEN"));
        System.out.println(s.solution("JAN"));
    }
}
