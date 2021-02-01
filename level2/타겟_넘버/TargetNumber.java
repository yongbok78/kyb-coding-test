class TargetNumber {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }

    public int dfs(int[] numbers, int depth, int sum, int target) {
        if (depth == numbers.length) {
            if (sum == target)
                return 1;
            return 0;
        }
        return dfs(numbers, depth + 1, sum + numbers[depth], target)
                + dfs(numbers, depth + 1, sum - numbers[depth], target);
    }

    public static void main(String[] args) {
        TargetNumber t = new TargetNumber();
        System.out.println(t.solution(new int[] {1, 1, 1, 1, 1}, 3));
    }
}
