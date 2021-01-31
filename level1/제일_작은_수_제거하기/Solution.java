class Solution {
    public int[] solution(int[] arr) {
        int aLen = arr.length;
        // 배열의 길이가 한자리 이하면 바로 [-1] 반환
        if (aLen < 2)
            return new int[] {-1};

        // 최소값 찾기
        int min = arr[0];
        for (int i = 1; i < aLen; i++) {
            if (min > arr[i])
                min = arr[i];
        }

        // 결과 정리
        int[] r = new int[aLen - 1];
        int j = 0;
        for (int i = 0; i < aLen - 1; i++) {
            if (arr[i + j] == min)
                j++;
            r[i] = arr[i + j];
        }
        return r;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[] {4, 3, 2, 1})));
        System.out.println(Arrays.toString(s.solution(new int[] {10})));
    }
}
