import java.util.HashMap;
import java.util.Iterator;

class Solution003 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 선수정보 초기화, 동명이인이 있으면 추가
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        for (String p : participant) {
            Integer v = m.get(p);
            if (v == null)
                v = 1;
            else
                v++;
            m.put(p, v);
        }

        // 완주한 선수는 map에서 빼주고
        for (String c : completion) {
            Integer v = m.get(c);
            v--;
            m.put(c, v);
        }

        // 완주 못한 선수를 찾아주면
        Iterator<String> keys = m.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            Integer v = m.get(key);
            if (v > 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution003 s = new Solution003();
        System.out.println(
                s.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
        System.out
                .println(s.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"},
                        new String[] {"josipa", "filipa", "marina", "nikola"}));
        System.out.println(s.solution(new String[] {"mislav", "stanko", "mislav", "ana"},
                new String[] {"stanko", "ana", "mislav"}));
    }

}
