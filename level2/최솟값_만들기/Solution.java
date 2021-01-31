import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        List<Integer> b = new ArrayList<>();
        for (int n : B) {
            b.add(n);
        }
        Collections.sort(b, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * b.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
        System.out.println(s.solution(new int[] {1, 2}, new int[] {3, 4}));
    }
}
