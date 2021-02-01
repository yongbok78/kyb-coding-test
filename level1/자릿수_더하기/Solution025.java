import java.util.*;

public class Solution025 {
    public int solution(int n) {
        int r = 0;
        char[] cs = String.valueOf(n).toCharArray();
        for (int i = 0; i < cs.length; i++) {
            r += (int) cs[i] - 48;
        }
        return r;
    }

    public static void main(String[] args) {
        Solution025 s = new Solution025();
        System.out.println(s.solution(123));
        System.out.println(s.solution(987));
    }
}
