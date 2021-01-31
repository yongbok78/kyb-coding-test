import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        String[] ss = s.split("");
        Arrays.sort(ss, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (Character.isUpperCase(s1.charAt(0)) && Character.isLowerCase(s2.charAt(0)))
                    return 1;
                else if (Character.isUpperCase(s2.charAt(0)) && Character.isLowerCase(s1.charAt(0)))
                    return -1;
                return s2.compareTo(s1);
            }
        });
        return String.join("", ss);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Zbcdefg"));
    }
}
