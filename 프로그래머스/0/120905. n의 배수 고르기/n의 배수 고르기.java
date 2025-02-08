class Solution {
    public int[] solution(int n, int[] numlist) {
        // answer 배열 크기 지정
		int size = 0;
		for(int num : numlist) {
			if( num % n == 0) {
				size += 1;
			}
		}
		
		int[] answer = new int[size];
		
		// answer 배열의 n의 배수 값 넣기
		int index = 0;
		for(int ans : numlist) {
			if( ans % n == 0) {
				answer[index++] = ans;
			}
		}
        return answer;
    }
}