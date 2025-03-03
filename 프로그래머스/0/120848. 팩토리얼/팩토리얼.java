class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1; //팩토리얼의 값
		int k = 1; //곱해지는 수
		
		while(true) {
			num *= k;
			if(num > n) {
				answer = k;
				break;
			}
			k++;
		}
        return answer-1;
    }
}