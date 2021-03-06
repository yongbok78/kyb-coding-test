import java.util.Arrays;

class Solution057 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        int h;
        int cLen = citations.length;
        for (int i = 0; i < cLen; i++) {
            h = cLen - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution057 s = new Solution057();
        System.out.println(s.solution(new int[] {3, 0, 6, 1, 5}));
    }
}
