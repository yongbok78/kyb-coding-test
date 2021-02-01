import java.util.Arrays;

class Solution059 {
    public int solution(int[] people, int limit) {
        int answer = people.length;
        // 오름차순 정렬해고
        Arrays.sort(people);
        // 제일 가변운 사람과 제일 무거운 사람을 차례로 태워보고
        // 제한을 넘지 않은면 보트 댓수를 한대씨 줄인다.
        int s = 0, e = people.length - 1;
        while (s < e) {
            if (people[s] + people[e] <= limit) {
                s++;
                answer--;
            }
            e--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution059 s = new Solution059();
        System.out.println(s.solution(new int[] {70, 50, 80, 50}, 100));
        System.out.println(s.solution(new int[] {70, 80, 50}, 100));
    }
}
