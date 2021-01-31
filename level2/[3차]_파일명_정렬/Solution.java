import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String reg = "^([a-zA-Z- ]+)(\\d+)(.*)";
                String aHead = a.replaceAll(reg, "$1").toLowerCase();
                String bHead = b.replaceAll(reg, "$1").toLowerCase();
                if (!aHead.equals(bHead))
                    return aHead.compareTo(bHead);

                int aNum = Integer.parseInt(a.replaceAll(reg, "$2"));
                int bNum = Integer.parseInt(b.replaceAll(reg, "$2"));
                return aNum - bNum;
            }
        });
        String[] answer = files;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[] {"img12.png", "img10.png",
                "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})));
        System.out.println(Arrays.toString(s.solution(new String[] {"F-5 Freedom Fighter",
                "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"})));
    }
}
