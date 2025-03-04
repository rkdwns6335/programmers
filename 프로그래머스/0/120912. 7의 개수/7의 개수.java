class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array) {
			String str = String.valueOf(a); // 숫자를 문자열로 변경
			for(char c : str.toCharArray()) { // 문자열을 char 형으로 변경해서 문자 하나씩 돌리기
				if( c == '7' ) answer++;
			}
		}
        return answer;
    }
}