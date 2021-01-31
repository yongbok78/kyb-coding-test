import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;// 총 경과시간
        int upWeight = 0;// 다리위의 트럭무게 합
        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        // 트럭을 차례대로 다리위에 올리고
        for (int i = 0; i < truck_weights.length; i++) {
            answer++;// 시간 추가
            upWeight -= bridge.poll();
            int w = truck_weights[i];
            // 트럭 추가하는데 제한 무게 이상이면
            if (weight < upWeight + w) {
                bridge.add(0);
                i--;
            } else {
                bridge.add(w);
                upWeight += w;
            }
        }
        // 다리위에 남아있는 트럭을 빼고
        while (upWeight != 0) {
            upWeight -= bridge.poll();
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 10, new int[] {7, 4, 5, 6}));
        System.out.println(s.solution(100, 100, new int[] {10}));
        System.out
                .println(s.solution(100, 100, new int[] {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }
}
