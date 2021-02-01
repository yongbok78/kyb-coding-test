class Solution043 {
    public int solution(String dartResult) {
        // 점수|보너스|[옵션]으로 이루어진 문자열 3세트 분리
        String pattern = "(\\d+[SDT][#*]?)(\\d+[SDT][#*]?)(\\d+[SDT][#*]?)";
        String[] sPoints = {dartResult.replaceAll(pattern, "$1"),
                dartResult.replaceAll(pattern, "$2"), dartResult.replaceAll(pattern, "$3")};
        int[] points = new int[3];
        // 점수|보너스|옵션 분리
        String pttrn = "(\\d+)([SDT])[#*]?";
        for (int i = 0; i < 3; i++) {
            int point = Integer.parseInt(sPoints[i].replaceAll(pttrn, "$1"));

            String sPow = sPoints[i].replaceAll(pttrn, "$2");
            int pow = sPow.equals("S") ? 1 : sPow.equals("D") ? 2 : 3;

            int option = sPoints[i].endsWith("#") ? -1 : sPoints[i].endsWith("*") ? 2 : 1;

            points[i] = (int) Math.pow(point, pow) * option;
            // 보너스 D이면 앞쪽 점수 2배
            if (option == 2 && i > 0)
                points[i - 1] *= option;

        }
        int answer = 0;
        for (int v : points)
            answer += v;
        return answer;
    }

    public static void main(String[] args) {
        Solution043 s = new Solution043();
        System.out.println(s.solution("1S2D*3T"));
        System.out.println(s.solution("1D2S#10S"));
        System.out.println(s.solution("1D2S0T"));
        System.out.println(s.solution("1S*2T*3S"));
        System.out.println(s.solution("1D#2S*3S"));
        System.out.println(s.solution("1T2D3D#"));
        System.out.println(s.solution("1D2S3T*"));
    }
}


