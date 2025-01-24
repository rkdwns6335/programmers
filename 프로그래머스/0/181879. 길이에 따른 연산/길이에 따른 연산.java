class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
	    int answer;

	    if (len >= 11) {
	        // 초기값은 0으로 설정, 리스트의 합 계산
	        answer = 0;
	        for (int i = 0; i < num_list.length; i++) {
	            answer += num_list[i];
	        }
	    } else {
	        // 초기값은 1로 설정, 리스트의 곱 계산
	        answer = 1;
	        for (int i = 0; i < num_list.length; i++) {
	            answer *= num_list[i];
	        }
	    }

        return answer;
    }
}