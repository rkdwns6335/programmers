class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
		
		// Math.abs() = 절댓값을 반환하는 함수
		
		// Math.abs(n-array[i]) 는 아래와 같다
		
		// Math.abs(20 - 3)  = 17
		// Math.abs(20 - 10) = 10
		// Math.abs(20 - 28) = 8
		
		
		for (int i = 1; i < array.length; i++) {
            if (Math.abs(n - answer) > Math.abs(n - array[i])) {
                answer = array[i]; 
            } else if (Math.abs(n - answer) == Math.abs(n - array[i]) && array[i] < answer) {
                answer = array[i]; 
            }
        }
        return answer;
    }
}