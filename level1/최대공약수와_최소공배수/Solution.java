class Solution {
    public int[] solution(int n, int m) {
        int maxDivisor = 0; // 최대 공약수
        int minMultiple = 0; // 최소 공배수

        // 최대 공약수 구하기
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                for (int j = m; j > 0; j--) {
                    if (m % i == 0) {
                        maxDivisor = i;
                        break;
                    }
                }
            }
            if (maxDivisor > 0)
                break;
        }

        // 최소 공배수 구하기
        int ni = 1;
        int mi = 1;
        int nMulti = n; // n의 배수
        int mMulti = m; // m의 배수
        while (minMultiple == 0) {
            if (nMulti < mMulti) {
                while (true) {
                    ni++;
                    nMulti = n * ni;
                    if (nMulti >= mMulti)
                        break;
                }
            } else if (nMulti > mMulti) {
                while (true) {
                    mi++;
                    mMulti = m * mi;
                    if (nMulti <= mMulti)
                        break;
                }
            } else {
                minMultiple = nMulti;
            }
        }

        int[] answer = {maxDivisor, minMultiple};
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, 12)));
        System.out.println(Arrays.toString(s.solution(2, 5)));
    }
}
