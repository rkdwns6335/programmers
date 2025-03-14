class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder(); 
		for(int i=0; i < code.length(); i++) {
			if(i % q == r) { // i 나누기 q 의 나머지 값이 1 과 동일한가?
				answer.append(code.charAt(i));
			}
		}
        return answer.toString();
    }
}