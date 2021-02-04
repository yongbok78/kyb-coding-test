import java.util.ArrayList;

class ExpectCount {

    public int solution(int n, int a, int b) {
        int half = n / 2;
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        // a와 b가 대진표 양쪽에 포진하면 무조건 n = Math.pow(2, x) x만큼 반복된다.
        if (half >= a && half < b) {
            return Integer.toBinaryString(n).replace("1", "").length();
        }

        // a,b 가 대진표 오른쪽으 치우쳐 있으면 왼쪽으로 옮겨 주자
        if (half < a) {
            a -= half;
            b -= half;
        }
        return solution(half, a, b);
    }

    // 첫 풀이. 채점에서 시간 초과로 실패
    public int solution2(int n, int a, int b) {
        int answer = 0;
        ArrayList<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        root: while (true) {
            answer++;
            for (int i = n - 1; i >= 1; i -= 2) {
                int p1 = people.get(i - 1);
                int p2 = people.get(i);
                // a, b가 만나면 반복문 모두 종료
                if ((p1 == a && p2 == b) || (p1 == b && p2 == a))
                    break root;
                else {
                    if (a == p1 || b == p1)
                        people.remove(i);
                    else
                        people.remove(i - 1);
                }
            }
            n /= 2;
        }
        return answer;
    }

    // 다른 사람 풀이. 세상에 능력자는 많다는 것을 느낀다...
    public int solution3(int n, int a, int b) {
        return Integer.toBinaryString((a - 1) ^ (b - 1)).length();
    }

    public static void main(String[] args) {
        ExpectCount s = new ExpectCount();
        System.out.println(s.solution(8, 1, 8));
    }
}
