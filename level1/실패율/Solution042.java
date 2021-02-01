class Solution042 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];// 스테이지 수만큼 결과배열 생성
        float[] failRates = new float[N];// 실패율 저장 변수 생성

        // 스테이지별 실패율 계산
        for (int i = 0; i < N; i++) {
            float unclear = 0;// 스테이지 클리어하지 못한수
            float clear = 0;// 스테이지 클리어수

            // 스테이지 클리어한 사람과 못한사람 카운트
            for (int stage : stages) {
                if (stage == i + 1) {
                    unclear++;
                    clear++;
                } else if (stage > i + 1) {
                    clear++;
                }
            }

            // 클리어한 사람이 있으면 스테이지의 실패율을 계산해서 넣어준다
            if (clear != 0)
                failRates[i] = unclear / clear;
            else
                failRates[i] = 0;
        }

        // 실패율 내림차순으로 세티이지 번호 정렬
        for (int i = 0; i < N; i++) {
            float maxValue = failRates[0];
            int maxIndex = 0;

            for (int j = 0; j < N; j++) {
                if (maxValue < failRates[j]) {
                    maxIndex = j;
                    maxValue = failRates[j];
                }
            }
            failRates[maxIndex] = -1;
            answer[i] = maxIndex + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution042 s = new Solution042();
        System.out.println(Arrays.toString(s.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(s.solution(4, new int[] {4, 4, 4, 4, 4})));
    }
}
