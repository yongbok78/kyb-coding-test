class Solution077 {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int i = 0;
        int pointer = p - 1;
        StringBuilder nums = new StringBuilder();
        while (answer.length() < t) {
            nums.append(Integer.toString(i, n).toUpperCase());
            i++;
            if (nums.length() <= pointer)
                continue;
            answer += nums.charAt(pointer);
            pointer += m;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution077 s = new Solution077();
        System.out.println(s.solution(2, 4, 2, 1));
        System.out.println(s.solution(16, 16, 2, 1));
        System.out.println(s.solution(16, 16, 2, 2));
    }
}
