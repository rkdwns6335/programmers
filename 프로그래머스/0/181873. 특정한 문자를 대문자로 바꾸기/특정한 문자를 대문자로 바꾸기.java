class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        // alp 값과 my_string.charAt(i) 값을 비교할 수 있도록 char 형식으로 변경 ( contains 사용 )
		char ch = alp.charAt(0);
		
		// 해당 값을 가지고 있으면 대문자로 변경 후 answer 에 저장 아닐경우 그냥 문자열 출력
		if(my_string.contains(alp)) {
			for(int i=0; i<my_string.length(); i++) {
				if(my_string.charAt(i) == ch) {
					answer += Character.toUpperCase(my_string.charAt(i));
				}else {
					answer += my_string.charAt(i);
				}
			}
		}else {
			answer += my_string;
		}
        return answer;
    }
}