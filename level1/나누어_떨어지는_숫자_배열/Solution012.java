import java.util.Arrays;
import java.util.HashSet;

class Solution012 {
    public int[] solution(int[] arr, int divisor) {
        HashSet<Integer> h = new HashSet<>();
        for (int v : arr) {
            if (v % divisor == 0)
                h.add(Integer.valueOf(v));
        }

        if (h.size() == 0)
            return new int[] {-1};

        int[] answer = new int[h.size()];
        Object[] tmp = h.toArray();
        for (int i = 0; i < h.size(); i++) {
            answer[i] = (int) tmp[i];
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution012 s = new Solution012();
        System.out.println(Arrays.toString(s.solution(new int[] {5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(s.solution(new int[] {2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(s.solution(new int[] {3, 2, 6}, 5)));
    }
}
