import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution075 {
    public int[] solution(String msg) {
        String[] initWord = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        // 사전 초기화 {A:1, B:2, ...}}
        HashMap<String, Integer> dic = new HashMap<>();
        for (int i = 0; i < initWord.length; i++) {
            dic.put(initWord[i], i + 1);
        }

        String word1 = "";
        String word2 = "";
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < msg.length(); i++) {
            // 단어
            word1 += msg.charAt(i);
            // 단어 + 다음 한글자
            word2 = word1 + (i == msg.length() - 1 ? "|" : msg.charAt(i + 1));

            // word2가 사전에 없으면
            if (dic.get(word2) == null) {
                // word1번호를 결과에 입력
                results.add(dic.get(word1));
                // word2를 사전에 등록
                dic.put(word2, dic.size() + 1);
            } else {
                continue;
            }
            word1 = "";
            word2 = "";
        }

        int[] answer = new int[results.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = results.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution075 s = new Solution075();
        System.out.println(Arrays.toString(s.solution("KAKAO")));
        System.out.println(Arrays.toString(s.solution("TOBEORNOTTOBEORTOBEORNOT")));
        System.out.println(Arrays.toString(s.solution("ABABABABABABABAB")));
    }
}
