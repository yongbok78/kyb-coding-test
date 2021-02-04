public class JumpNTeleport {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 2;
            n /= 2;
        }
        return answer;
    }

    // 다른 사람 풀이
    public int solution2(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        JumpNTeleport s = new JumpNTeleport();
        System.out.println(s.solution(5));
        System.out.println(s.solution(6));
        System.out.println(s.solution(5000));
    }
}
