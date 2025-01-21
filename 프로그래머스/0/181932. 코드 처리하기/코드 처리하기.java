class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
		for(int i=0; i<code.length(); i++) {
			if(mode == 0) { // mode 가 0 일 때
				if(code.charAt(i) != '1') { // code[idx] 가 1이 아닐경우
					if(i%2==0) { // idx가 짝수 일 경우
						answer += code.charAt(i); //answer 에 추가
					}
				}else if(code.charAt(i) == '1') { //idx값이 1이면
					mode = 1; //mode를 1 변경
				}
			}else {
				if(code.charAt(i) != '1') { // code[idx] 가 1이 아닐경우
					if(i%2 == 1) { // idx가 홀수 일 경우
						answer += code.charAt(i);//answer 에 추가
					}
				}else if(code.charAt(i) == '1') { //idx값이 1이면
					mode = 0; //mode를 0 변경
				}
			}
		}
        return answer.length() > 0 ? answer.toString() : "EMPTY"; // answer 길이 값이 0 이면 answer의 값 출력 아닐경우 EMTPY 출력
    }
}