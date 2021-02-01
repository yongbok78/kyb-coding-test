import java.util.Arrays;

class Solution065 {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(arr);
        String answer = arr[0] + " " + arr[arr.length - 1];
        return answer;
    }

    public static void main(String[] args) {
        Solution065 s = new Solution065();
        System.out.println(s.solution("1 2 3 4"));
        System.out.println(s.solution("-1 -2 -3 -4"));
        System.out.println(s.solution("-1 -1"));
    }
}
