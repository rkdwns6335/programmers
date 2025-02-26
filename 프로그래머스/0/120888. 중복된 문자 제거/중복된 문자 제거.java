class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
		boolean[] seen = new boolean[128]; // 대문자 , 소문자, 공백을 포함한 ascii 문자
		
		
		for(char c : my_string.toCharArray()) {
			if(!seen[c]) { // c의 값이 false 이면 ( 해당 문자를 처음 만났다면 )
				seen[c] = true; // true로 변경
				answer.append(c); //결과에 추가
			}
		}
		
		return answer.toString();

    }
}