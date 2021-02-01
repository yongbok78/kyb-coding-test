import java.util.Arrays;

class Solution073 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        // 한 글자인 단어는 인정되지 않습니다.
        if (words[0].length() == 1)
            return new int[] {1, 1};

        int failIdx = -1;
        for (int i = 1; i < words.length; i++) {
            String w1 = words[i - 1];
            String w2 = words[i];
            // 한 글자인 단어는 인정되지 않습니다.
            // 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
            if (w2.length() == 1 || w1.charAt(w1.length() - 1) != w2.charAt(0)) {
                failIdx = i;
                break;
            }
            // 이전에 등장했던 단어는 사용할 수 없습니다.
            if (Arrays.asList(words).indexOf(w2) != i) {
                failIdx = i;
                break;
            }
        }

        if (failIdx > -1) {
            answer[0] = failIdx % n + 1;
            answer[1] = failIdx / n + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution073 s = new Solution073();
        System.out.println(Arrays.toString(s.solution(3, new String[] {"tank", "kick", "know",
                "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(s.solution(5,
                new String[] {"hello", "observe", "effect", "take", "either", "recognize",
                        "encourage", "ensure", "establish", "hang", "gather", "refer", "reference",
                        "estimate", "executive"})));
        System.out.println(Arrays.toString(s.solution(2,
                new String[] {"hello", "one", "even", "never", "now", "world", "draw"})));
    }
}
