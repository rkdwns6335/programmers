class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        // k 값을 10진수로 변환
		char target = Character.forDigit(k, 10);
		System.out.println(k);
		
		for(int num = i; num<=j; num++) {
			String numStr = String.valueOf(num);
			for(char c : numStr.toCharArray()) {
				if( c == target) {
					answer++;
				}
			}
		}
        return answer;
    }
}