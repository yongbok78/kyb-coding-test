import java.util.HashSet;

class Solution055 {
    public int solution(String numbers) {
        HashSet<Integer> answer = new HashSet<>();
        for (int i = 1; i <= numbers.length(); i++) {
            permutation(numbers.split(""), 0, numbers.length(), i, answer);
        }
        return answer.size();
    }

    private void permutation(String[] arr, int depth, int n, int r, HashSet<Integer> primes) {
        if (depth == r) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < r; i++) {
                sb.append(arr[i]);
            }
            int no = Integer.parseInt(sb.toString());
            if (isPrime(no))
                primes.add(no);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r, primes);
            swap(arr, depth, i);
        }
    }

    private void swap(String[] arr, int depth, int i) {
        if (depth == i)
            return;
        String temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    private boolean isPrime(int n) {
        int i;
        int sqrt = (int) Math.sqrt(n);
        // 2는 유일한 짝수 소수
        if (n == 2)
            return true;
        // 짝수와 1은 소수가 아님
        if (n % 2 == 0 || n == 1)
            return false;
        // 제곱근까지만 홀수로 나눠보면 됨
        for (i = 3; i <= sqrt; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution055 s = new Solution055();
        System.out.println(s.solution("17"));
        System.out.println(s.solution("011"));
    }
}
