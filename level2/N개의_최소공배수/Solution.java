class Solution {
    public int solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 최소 공배수 공식 사용
            arr[i] = arr[i - 1] * arr[i] / gcd(arr[i - 1], arr[i]);
        }
        int answer = arr[arr.length - 1];
        return answer;
    }

    // 최대공약수를 구하는 메소드
    private int gcd(int a, int b) {
        return a % b > 0 ? gcd(b, a % b) : b;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[] {2, 6, 8, 14}));
        System.out.println(s.solution(new int[] {1, 2, 3}));
    }
}
