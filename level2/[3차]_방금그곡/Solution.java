import java.time.Duration;
import java.time.LocalTime;

class Solution {
    public String solution(String m, String[] musicinfos) {
        m = convertCodes(m);
        // 조건이 일치하는 음악이 없을 때에는 "(None)"을 반환
        String answer = "(None)";
        int maxPlay = 0;
        for (int i = 0; i < musicinfos.length; i++) {
            String[] info = musicinfos[i].split(",");

            // 시간간격 구하고
            int playTime = termMinutes(info[0], info[1]);
            // 이전 플레이된 것보다 현제 플레이 시간이 길면
            if (playTime > maxPlay) {
                info[3] = convertCodes(info[3]);
                StringBuilder sb = new StringBuilder();
                // 플레이 시간만큼 코드 반복
                for (int j = 0; j < playTime; j++) {
                    sb.append(info[3].charAt(j % info[3].length()));
                }
                // m이 포함되어 있는지 확인
                if (sb.indexOf(m) > -1) {
                    answer = info[2];
                    maxPlay = playTime;
                }
            }
        }
        return answer;
    }

    // #을 빼고 소문자로 변경해서 반환 ex)ABCC# -> ABCc
    private String convertCodes(String codes) {
        StringBuilder sb = new StringBuilder();
        sb.append(codes.charAt(0));
        for (int i = 1; i < codes.length(); i++) {
            char c = codes.charAt(i);
            if (c == '#')
                sb.replace(sb.length() - 1, sb.length(),
                        ("" + sb.charAt(sb.length() - 1)).toLowerCase());
            else
                sb.append(c);
        }
        return sb.toString();
    }

    // 문자열로 주어진 시간들의 간격을 분단위로 반환 ex)("12:00","12:14") -> 14
    private int termMinutes(String time1, String time2) {
        String[] t1 = time1.split(":");
        String[] t2 = time2.split(":");
        Duration d =
                Duration.between(LocalTime.of(Integer.parseInt(t1[0]), Integer.parseInt(t1[1])),
                        LocalTime.of(Integer.parseInt(t2[0]), Integer.parseInt(t2[1])));
        return Long.valueOf(d.getSeconds() / 60).intValue();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ABCDEFG",
                new String[] {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"}));
        System.out.println(s.solution("CC#BCC#BCC#BCC#B",
                new String[] {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"}));
        System.out.println(s.solution("ABC",
                new String[] {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"}));
    }
}
