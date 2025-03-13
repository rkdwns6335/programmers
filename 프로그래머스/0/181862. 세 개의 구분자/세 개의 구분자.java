import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : myStr.toCharArray()) {
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                if (sb.length() > 0) {
                    answer.add(sb.toString());
                    sb.setLength(0); // 새로운 문자열 시작
                }
            } else {
                sb.append(ch);
            }
        }

        if (sb.length() > 0) {
            answer.add(sb.toString()); // 마지막 문자열 추가
        }

        return answer.isEmpty() ? new String[]{"EMPTY"} : answer.toArray(new String[0]);
    }
}