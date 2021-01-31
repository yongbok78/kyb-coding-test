class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] students = new int[n];

        // 체육복 없는 학생 확인
        for (int l : lost)
            students[l - 1]--;
        // 여벌이 있는 학생 확인
        for (int r : reserve)
            students[r - 1]++;

        for (int i = 0; i < students.length; i++) {
            // 체육복 없을 때
            if (students[i] == -1) {
                // 앞번호 학생 여벌 있으면 빌리고
                if (i - 1 >= 0 && students[i - 1] == 1) {
                    students[i]++;
                    students[i - 1]--;
                    // 뒷번호 학생 여벌 있으면 빌리고
                } else if (i + 1 < students.length && students[i + 1] == 1) {
                    students[i]++;
                    students[i + 1]--;
                    // 자기가 잃어 버리면 자기 여벌 입고
                } else
                    answer--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, new int[] {2, 4}, new int[] {1, 3, 5}));
        System.out.println(s.solution(5, new int[] {2, 4}, new int[] {3}));
        System.out.println(s.solution(3, new int[] {3}, new int[] {1}));
    }
}
