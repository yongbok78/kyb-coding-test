class Solution031 {
    public String solution(int[] numbers, String hand) {
        int l = 10;
        int r = 12;
        StringBuilder sb = new StringBuilder();
        for (int n : numbers) {
            // 키패드 1,4,7은 무조건 왼손
            if (n == 1 || n == 4 || n == 7) {
                sb.append("L");
                l = n;
                // 키패드 3,6,9은 무조건 왼손
            } else if (n == 3 || n == 6 || n == 9) {
                sb.append("R");
                r = n;
            } else {
                // 손가락 이동거리 확인
                int lm = move(l, n);
                int rm = move(r, n);
                // 이동거리가 작은 쪽으로 터치
                if (lm > rm) {
                    sb.append("R");
                    r = n;
                } else if (lm < rm) {
                    sb.append("L");
                    l = n;
                    // 이동거리가 같은 경우 오른손/왼손 잡이 판별하여 터치
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        r = n;
                    } else {
                        sb.append("L");
                        l = n;
                    }
                }
            }
        }
        return sb.toString();
    }

    // 이동거리 확인 메소드
    private int move(int pos, int num) {
        pos = (pos == 0) ? 11 : pos;
        num = (num == 0) ? 11 : num;

        // 키패드 좌표 설정
        int[][] location = {
            {0, 0}, {0, 1}, {0, 2},// 1, 2, 3
            {1, 0}, {1, 1}, {1, 2},// 4, 5, 6
            {2, 0}, {2, 1}, {2, 2},// 7, 8, 9
            {3, 0}, {3, 1}, {3, 2}// *, 0, #
        };

        int[] p = location[pos - 1];
        int[] n = location[num - 1];

        return Math.abs(p[0] - n[0]) + Math.abs(p[1] - n[1]);
    }

    public static void main(String[] args) {
        Solution031 s = new Solution031();
        System.out.println(s.solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println(s.solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println(s.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }
}
