class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0) {
			for(int i=0; i<=n; i++) {
				System.out.println(i);
				if(i % 2 == 0) {
					answer += (int)Math.pow(i,2);
				}
			}
		}else {
			for(int i=0; i<=n; i++) {
				System.out.println(i);
				if(i % 2 != 0) {
					answer += i;
				}
			}
		}
	    // for문 사용을 못해서 이런 코드가 나온거 같음
	    // 아래는 답지
	     for(int i = n; i >= 0; i -= 2)
                answer += (n % 2 == 0) ? i * i : i;
	    
        return answer;
    }
}
