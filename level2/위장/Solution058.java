import java.util.HashMap;
import java.util.Map;

class Solution058 {
    public int solution(String[][] clothes) {
        Map<String, Integer> m = new HashMap<>();
        // 종류별 의상수 정리
        for (String[] c : clothes) {
            m.put(c[1], m.getOrDefault(c[1], 0) + 1);
        }

        // 의상 조합 수 = (의상1 갯수 + 1)*(의상2 갯수 + 1)*...
        int cnt = 1;
        for (String k : m.keySet()) {
            cnt *= (m.get(k) + 1);
        }
        // 아무것도 안입는 경우는 빼준다
        return cnt - 1;
    }

    public static void main(String[] args) {
        Solution058 s = new Solution058();
        System.out.println(s.solution(new String[][] {{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        System.out.println(s.solution(new String[][] {{"crow_mask", "face"},
                {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }
}
