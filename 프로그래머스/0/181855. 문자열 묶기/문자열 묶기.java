class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[31]; // 문자열 길이는 최대 30이므로 31 크기의 배열 선언
		
		// 각 문자열의 길이에 해당하는 인덱스의 값 증가
		for(String str : strArr) {
			count[str.length()]++;
		}
		
		//가장 큰 그룹 크기 찾기
		for(int c : count) {
			answer = Math.max(answer, c);
		}
        return answer;
    }
}