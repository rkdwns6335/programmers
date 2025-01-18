class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        answer = str2.contains(str1) ? 1 : 0; // contains 함수를 활용해 문자열이 특정 문자열을 포함하고 있는지 확인
        return answer;
    }
}
