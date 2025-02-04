class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(a % 2 == 1 && b % 2 == 1) {
			answer = (int) (Math.pow(a, 2) + Math.pow(b, 2)); // 제곱근
		}else if( a % 2 == 0 && b % 2 == 0) {
			answer = Math.abs(a - b); // 절대값(음수 -> 양수)으로 변경
		}else if( a % 2 == 0 || b % 2 == 0) {
			answer = 2 * (a+b);
		}
        
        
        return answer;
    }
}