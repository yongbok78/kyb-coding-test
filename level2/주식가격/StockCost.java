import java.util.Arrays;

class StockCost {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StockCost s = new StockCost();
        System.out.println(Arrays.toString(s.solution(new int[] {1, 2, 3, 2, 3})));
    }
}
