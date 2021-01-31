import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                // 배열에서 두 수를 뽑아 더한 수가 list에 없으면 추가
                if (list.indexOf(sum) < 0) {
                    list.add(sum);
                }
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] += list.get(i);
        }
        // 오르차순 정렬
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[] {2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(s.solution(new int[] {5, 0, 2, 7})));
    }
}
