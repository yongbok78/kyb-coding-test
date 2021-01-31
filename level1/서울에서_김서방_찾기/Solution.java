import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        return String.format("김서방은 %s에 있다", Arrays.asList(seoul).indexOf("Kim"));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[] {"Jane", "Kim"}));
    }
}
