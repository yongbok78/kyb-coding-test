import java.util.Stack;

class Solution071 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i))
                stack.pop();
            else
                stack.add(s.charAt(i));
        }
        return stack.size() > 0 ? 0 : 1;
    }

    public static void main(String[] args) {
        Solution071 s = new Solution071();
        System.out.println(s.solution("baabaa"));
        System.out.println(s.solution("cdcd"));
    }
}
