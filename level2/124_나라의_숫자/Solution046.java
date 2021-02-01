class Solution046 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] nums = {"4", "1", "2"};
        while (n != 0) {
            answer.append(nums[n % 3]);
            if (n % 3 == 0)
                n--;// 자릿수 하나 줄임
            n /= 3;
        }
        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        Solution046 s = new Solution046();
        System.out.println(s.solution(1));
        System.out.println(s.solution(2));
        System.out.println(s.solution(3));
        System.out.println(s.solution(4));
    }
}
