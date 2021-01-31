import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] u1 = {1, 2, 3, 4, 5};// 1번 학생 찍는 패턴
        int[] u2 = {2, 1, 2, 3, 2, 4, 2, 5};// 2번 학생 찍는 패턴
        int[] u3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};// 3번 학생 찍는 패턴
        int[] answerNos = {0, 0, 0};
        // 각 학생의 맞은 갯수 카운트
        for (int i = 0; i < answers.length; i++) {
            int v1 = answers[i];
            int v2 = u1[i % u1.length];
            if (v1 == v2)
                answerNos[0]++;

            v2 = u2[i % u2.length];
            if (v1 == v2)
                answerNos[1]++;

            v2 = u3[i % u3.length];
            if (v1 == v2)
                answerNos[2]++;
        }
        // 최고 점수받은 사람부터 오름차순 정렬
        int[] clonNos = answerNos.clone();
        Arrays.sort(clonNos);
        int maxNo = clonNos[clonNos.length - 1];
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < answerNos.length; i++) {
            if (maxNo == answerNos[i])
                a.add(i + 1);
        }
        // 최종 결과 정리
        int[] answer = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(s.solution(new int[] {1, 3, 2, 4, 2})));
    }
}
