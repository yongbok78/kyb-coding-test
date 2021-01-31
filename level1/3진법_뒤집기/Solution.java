class Solution {
    public int solution(int n) {
        int num = 3;
        StringBuilder sb = new StringBuilder("");
        int val = n;
        // Integer.toString(n, 3) 몰라서 아래 방식으로 해결. 문제 풀고 다른 사람 코드확인하면서 확인
        while (true) {
            sb.append(String.valueOf(val % num));
            val /= num;
            if (val == 0)
                break;
        }

        for (int i = 0; i < sb.length(); i++) {
            char no = sb.charAt(i);
            if (no != '0')
                val += Character.getNumericValue(no) * Math.pow(num, sb.length() - i - 1);
        }
        return val;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(45));
        System.out.println(s.solution(125));
    }
}
