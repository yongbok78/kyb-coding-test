import java.util.Stack;

class Solution056 {
    public String solution(String number, int k) {
        char[] answer = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char n = number.charAt(i);
            // stack에서 현재 값보다 작은 값을 버리는데 k값이 0이되면 끝
            while (!stack.isEmpty() && stack.peek() < n && k-- > 0) {
                stack.pop();
            }
            stack.add(n);
        }

        // stack 값을 결과값으로 정리
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }
        return new String(answer);
    }

    public static void main(String[] args) {
        Solution056 s = new Solution056();
        System.out.println(s.solution("1924", 2));
        System.out.println(s.solution("1231234", 3));
        System.out.println(s.solution("4177252841", 4));
    }
}
