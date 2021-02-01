import java.util.Arrays;
import java.util.Comparator;

class Solution052 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] sNums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sNums[i] = "" + numbers[i];
        }

        Arrays.sort(sNums, new Comparator<String>() {
            @Override
            public int compare(String n1, String n2) {
                return (n2 + n1).compareTo(n1 + n2);
            }
        });

        answer = String.join("", sNums);
        if (answer.startsWith("0"))
            answer = "0";
        return answer;
    }

    public static void main(String[] args) {
        Solution052 s = new Solution052();
        System.out.println(s.solution(new int[] {6, 10, 2}));
        System.out.println(s.solution(new int[] {3, 30, 34, 5, 9}));
    }
}
