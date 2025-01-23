class Solution {
    public String[] solution(String my_string) {
        // trim() : 앞 뒤 공백 제거
        // "\\s" 는 공백 문자(whitespace character)를 의미합니다. 
        // +는 "하나 이상"을 의미합니다.
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}