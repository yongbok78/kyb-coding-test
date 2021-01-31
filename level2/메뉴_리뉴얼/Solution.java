import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        // 코스별 카운팅 저장
        TreeMap<String, Integer> courseCnt = new TreeMap<>();
        for (int c : course) {
            for (String o : orders) {
                char[] srt = o.toCharArray();
                Arrays.sort(srt);
                LinkedList<String> coms = combinations(new String(srt), c);
                for (String com : coms) {
                    courseCnt.put(com, courseCnt.getOrDefault(com, 0) + 1);
                }
            }
        }

        TreeSet<String> results = new TreeSet<>();
        for (int c : course) {
            int max = 0;
            for (Map.Entry<String, Integer> e : courseCnt.entrySet()) {
                if (e.getKey().length() == c && e.getValue() > 1 && max < e.getValue())
                    max = e.getValue();
            }

            for (Map.Entry<String, Integer> e : courseCnt.entrySet()) {
                if (e.getKey().length() == c && max > 0 && max == e.getValue())
                    results.add(e.getKey());
            }
        }

        String[] answer = new String[results.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = results.pollFirst();
        }
        return answer;
    }

    // 조합처리 재귀함수
    private LinkedList<String> combinations(String str, int selectedCnt) {
        LinkedList<String> output = new LinkedList<>();
        int len = str.length();
        if (len < selectedCnt)
            return output;

        if (selectedCnt == 1) {
            for (int i = 0; i < len; i++)
                output.add(str.substring(i, i + 1));
        } else {
            for (int i = 0; i < len - selectedCnt + 1; i++) {
                char head = str.charAt(i);
                LinkedList<String> subList = combinations(str.substring(i + 1), selectedCnt - 1);
                for (String subStr : subList)
                    output.add(head + subStr);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays
                .toString(s.solution(new String[] {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"},
                        new int[] {2, 3, 4})));
        System.out.println(Arrays
                .toString(s.solution(new String[] {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"},
                        new int[] {2, 3, 5})));
        System.out.println(Arrays
                .toString(s.solution(new String[] {"XYZ", "XWY", "WXA"}, new int[] {2, 3, 4})));
    }
}
