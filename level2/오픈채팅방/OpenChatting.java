import java.util.ArrayList;
import java.util.HashMap;

class OpenChatting {
    public String[] solution(String[] record) {
        HashMap<String, String> users = new HashMap<>();
        ArrayList<String[]> chat = new ArrayList<>();
        for (String str : record) {
            String[] rec = str.split(" ");
            if (rec[0].equals("Enter") || rec[0].equals("Change"))
                users.put(rec[1], rec[2]);
            if (rec[0].equals("Enter") || rec[0].equals("Leave"))
                chat.add(rec);
        }

        String[] answer = new String[chat.size()];
        for (int i = 0; i < chat.size(); i++) {
            String[] cht = chat.get(i);
            answer[i] = users.get(cht[1]);
            if (cht[0].equals("Enter"))
                answer[i] += "님이 들어왔습니다.";
            else if (cht[0].equals("Leave"))
                answer[i] += "님이 나갔습니다.";
        }
        return answer;
    }

    public static void main(String[] args) {
        OpenChatting s = new OpenChatting();
        System.out.println(s.solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
                "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"}));
    }
}
