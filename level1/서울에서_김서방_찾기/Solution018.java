import java.util.Arrays;

class Solution018 {
    public String solution(String[] seoul) {
        return String.format("김서방은 %s에 있다", Arrays.asList(seoul).indexOf("Kim"));
    }

    public static void main(String[] args) {
        Solution018 s = new Solution018();
        System.out.println(s.solution(new String[] {"Jane", "Kim"}));
    }
}
