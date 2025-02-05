class Solution {
    public int solution(int n) {
        int answer = 0;
        // Math.sqrt() = 제곱근 구하기
		// 반환값이 double 이므로 int 로 변환해준다
        int sqrt = (int) Math.sqrt(n);
        answer = (sqrt * sqrt == n) ? 1 : 2;
        return answer;
    }
}