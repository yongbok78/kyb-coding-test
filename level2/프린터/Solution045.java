import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


class Solution045 {
    public int solution(int[] priorities, int location) {
        // 문서에 번호 부여
        Queue<int[]> docs = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            docs.add(new int[] {priorities[i], i});
        }

        // 중요도 내림차순 저장
        Arrays.sort(priorities);
        Queue<Integer> order = new LinkedList<>();
        for (int i = priorities.length - 1; i >= 0; i--) {
            order.add(priorities[i]);
        }

        // 프린트 할 것 임시 저장
        Queue<int[]> tmpDocs = new LinkedList<>();
        // 프린트한 수 저장
        int answer = 0;
        int docNo = -1;
        while (location != docNo) {
            int important = order.poll();
            while (true) {
                int[] doc = docs.poll();
                if (important != doc[0])
                    tmpDocs.add(doc);
                else {
                    answer++;
                    if (location == doc[1])
                        docNo = location;
                    while (!tmpDocs.isEmpty())
                        docs.add(tmpDocs.poll());
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution045 s = new Solution045();
        System.out.println(s.solution(new int[] {2, 1, 3, 2}, 2));
        System.out.println(s.solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
    }
}
