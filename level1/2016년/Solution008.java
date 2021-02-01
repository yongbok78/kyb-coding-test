import java.time.LocalDate;

class Solution008 {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().name().substring(0, 3);
    }

    public static void main(String[] args) {
        Solution008 s = new Solution008();
        System.out.println(s.solution(5, 24));
    }
}
