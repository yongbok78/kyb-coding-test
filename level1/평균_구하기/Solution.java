class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int v : arr) {
            answer += v;
        }
        answer /= arr.length;
        return answer;
    }
}
