class Solution030 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Solution030 s = new Solution030();
        System.out.println(s.solution(3));
        System.out.println(s.solution(4));
    }
}
