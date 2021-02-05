import java.util.HashSet;
import java.util.Set;

class Poketmon {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        Set<Integer> mon = new HashSet<>() {
            {
                for (int n : nums) {
                    add(n);
                }
            }
        };
        return answer < mon.size() ? answer : mon.size();
    }

    public static void main(String[] args) {
        Poketmon s = new Poketmon();
        System.out.println(s.solution(new int[] {3, 1, 2, 3}));
        System.out.println(s.solution(new int[] {3, 3, 3, 2, 2, 4}));
        System.out.println(s.solution(new int[] {3, 3, 3, 2, 2, 2}));
    }
}
