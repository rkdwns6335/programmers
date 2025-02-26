class Solution {
    public String solution(int age) {
        String answer = "";
        // 숫자형 age를 String으로 변환
		String ageStr = String.valueOf(age);
		
		// 문자형태로 변환 후 for문 실행
		for( char c : ageStr.toCharArray()) {
			answer += (char) ('a' + (c - '0')); // c - '0'을 하면 해당 문자를 정수 값으로 변환

		}
		
		
		//설명
		// Java에서 문자(char)는 아스키(ASCII) 코드 값을 갖는다
        return answer;
    }
}