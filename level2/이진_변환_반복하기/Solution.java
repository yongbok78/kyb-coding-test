class Solution {
    public int[] solution(String s) {
        int cnt = 0; // 이진 변환 횟수
        int del = 0; // 삭제한 0의 수
        while (!s.equals("1")) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '1')
                    sb.append(c);
                else
                    del++;
            }
            s = Integer.toBinaryString(sb.length());
            cnt++;
        }
        int[] answer = new int[] {cnt, del};
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("110010101001")));
        System.out.println(Arrays.toString(s.solution("01110")));
        System.out.println(Arrays.toString(s.solution("1111111")));
    }
}
