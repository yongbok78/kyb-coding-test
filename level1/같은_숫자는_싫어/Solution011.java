import java.util.*;

public class Solution011 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1])
                l.add(arr[i]);
        }
        int[] answer = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            answer[i] = l.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution011 s = new Solution011();
        System.out.println(Arrays.toString(s.solution(new int[] {1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(s.solution(new int[] {4, 4, 4, 3, 3})));
    }
}
