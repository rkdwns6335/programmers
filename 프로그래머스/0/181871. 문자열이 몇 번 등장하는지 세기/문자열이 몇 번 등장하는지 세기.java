class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
		int index = myString.indexOf(pat); //첫번째 pat의 위치 찾기
		
		while(index != -1) {
			answer++;
			index = myString.indexOf(pat, index +1 ); //겹치는 부분도 포함
		}
        return answer;
    }
}