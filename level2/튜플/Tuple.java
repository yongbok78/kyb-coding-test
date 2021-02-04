import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Tuple {
    public int[] solution(String s) {
        String[] arrStr = s.replaceAll("\\{\\{|\\}\\}", "").split("\\},\\{");
        HashMap<Integer, Integer> cnts = new HashMap<>();
        for (String str : arrStr) {
            for (String el : str.split(",")) {
                int intEl = Integer.parseInt(el);
                cnts.put(intEl, cnts.getOrDefault(intEl, 0) + 1);
            }
        }

        ArrayList<int[]> results = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : cnts.entrySet()) {
            results.add(new int[] {e.getKey(), e.getValue()});
        }

        results.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int[] answer = new int[results.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = results.get(i)[0];
        }
        return answer;
    }

    // 다른 사람 풀이
    public int[] solution2(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b) -> {
            return a.length() - b.length();
        });
        int[] answer = new int[arr.length];
        int idx = 0;
        for (String s1 : arr) {
            for (String s2 : s1.split(",")) {
                if (set.add(s2))
                    answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Tuple s = new Tuple();
        System.out.println(Arrays.toString(s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(s.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(s.solution("{{20,111},{111}}")));
        System.out.println(Arrays.toString(s.solution("{{123}}")));
        System.out.println(Arrays.toString(s.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
    }
}
