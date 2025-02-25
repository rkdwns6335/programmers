class Solution {
    public String solution(String my_string) {
        String answer = "";
        // Character.isUpperCase() = 대문자인지 확인
		// Character.isLowerCase() = 소문자인지 확인
		for(int i=0; i<my_string.length(); i++) {
			if(Character.isUpperCase(my_string.charAt(i))) {
				answer += Character.toLowerCase(my_string.charAt(i));
			}else {
				answer += Character.toUpperCase(my_string.charAt(i));
			}
		}
        return answer;
    }
}