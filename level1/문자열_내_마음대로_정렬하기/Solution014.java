import java.util.Arrays;
import java.util.Comparator;

class Solution014 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n))
                    return o1.compareTo(o2);
                else
                    return ((int) o1.charAt(n)) - ((int) o2.charAt(n));
            }

        });
        return strings;
    }

    public static void main(String[] args) {
        Solution014 s = new Solution014();
        System.out.println(Arrays.toString(s.solution(new String[] {"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(s.solution(new String[] {"abce", "abcd", "cdx"}, 2)));
    }
}
