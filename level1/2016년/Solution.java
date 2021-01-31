import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().name().substring(0, 3);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 24));
    }
}
