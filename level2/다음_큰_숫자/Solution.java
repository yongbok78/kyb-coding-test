class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneCnt = getOneCnt(n);
        while (true) {
            n++;
            if (oneCnt == getOneCnt(n)) {
                answer = n;
                break;
            }
        }
        return answer;
    }

    // 숫자 n을 2진수 스트링으로 변환 했을 때 1의 갯수를 반환하는 메소드
    private int getOneCnt(int n) {
        String binary = Integer.toBinaryString(n);
        int cnt = 0;
        for (char b : binary.toCharArray()) {
            if (b == '1')
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(78));
        System.out.println(s.solution(15));
    }
}
