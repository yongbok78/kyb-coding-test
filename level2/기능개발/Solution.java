import java.util.ArrayList;

class Solution {
    // 나의 풀이
    // public int[] solution(int[] progresses, int[] speeds) {
    // for (int i = 0; i < progresses.length; i++) {
    // int p = progresses[i];
    // int s = speeds[i];
    // int d = 0;
    // while (p < 100) {
    // d++;
    // p += s;
    // }
    // progresses[i] = d;
    // }

    // ArrayList<Integer> result = new ArrayList<>();
    // int cnt = 0; // 배포 기능 숫자
    // int prevDay = progresses[0];
    // for (int i = 0; i < progresses.length; i++) {
    // if (prevDay < progresses[i]) {
    // result.add(cnt);
    // prevDay = progresses[i];
    // cnt = 1;
    // } else
    // cnt++;

    // if (i == progresses.length - 1)
    // result.add(cnt);
    // }

    // int[] answer = new int[result.size()];
    // for (int i = 0; i < result.size(); i++) {
    // answer[i] = result.get(i);
    // }
    // return answer;
    // }

    // 다른 사람 풀이
    public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out
                .println(Arrays.toString(s.solution(new int[] {93, 30, 55}, new int[] {1, 30, 5})));
        System.out.println(Arrays.toString(
                s.solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1})));
    }
}
