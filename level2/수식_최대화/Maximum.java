import java.util.LinkedList;

class Maximum {
    public long solution(String expression) {
        long answer = 0;
        // 우선 순위 설정
        String[][] prioritys = {{"+", "-", "*"}, {"*", "+", "-"}, {"*", "-", "+"}, {"+", "*", "-"},
                {"-", "*", "+"}, {"-", "+", "*"}};


        LinkedList<Object> expList = new LinkedList<>();
        for (String n : expression.split("[*+-]")) {
            expList.add(Long.parseLong(n));
        }
        int idx = 1;
        for (String o : expression.split("\\d+")) {
            if (o.equals(""))
                continue;
            expList.add(idx, o);
            idx += 2;
        }

        for (String[] prior : prioritys) {
            LinkedList<Object> exp = new LinkedList<>();
            exp.addAll(expList);
            for (String p : prior) {
                for (int i = 1; i < exp.size() - 1; i += 2) {
                    String o = (String) exp.get(i);
                    if (o.equals(p)) {
                        Long cal = calc((Long) exp.get(i - 1), (String) o, (Long) exp.get(i + 1));
                        exp.remove(i - 1);
                        exp.remove(i - 1);
                        exp.remove(i - 1);
                        exp.add(i - 1, cal);
                        i -= 2;
                    }
                }
            }
            long cal = Math.abs((Long) exp.get(0));
            if (answer < cal)
                answer = cal;
            exp.clear();
        }
        return answer;
    }

    private long calc(Long n1, String mark, Long n2) {
        long result = 0;
        if (mark.equals("*"))
            result = n1 * n2;
        else if (mark.equals("+"))
            result = n1 + n2;
        else
            result = n1 - n2;
        return result;
    }

    public static void main(String[] args) {
        Maximum s = new Maximum();
        System.out.println(s.solution("100-200*300-500+20"));
        System.out.println(s.solution("50*6-3*2"));
        System.out.println(s.solution("2-990-5+2"));
        System.out.println(s.solution("2-990-5+2+3*2"));
    }
}
