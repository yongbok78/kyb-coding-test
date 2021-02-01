import java.util.Arrays;

class Solution027 {
    public long solution(long n) {
        char[] cs = String.valueOf(n).toCharArray();
        Arrays.sort(cs);
        StringBuilder sb = new StringBuilder();
        for (int i = cs.length - 1; i >= 0; i--) {
            sb.append(cs[i]);
        }
        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        Solution027 s = new Solution027();
        System.out.println(s.solution(118372));
    }
}
