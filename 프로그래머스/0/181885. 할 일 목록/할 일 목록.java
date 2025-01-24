class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // answer 인덱스 값 구하기
		int count = 0;
        for (boolean task : finished) {
            if (!task) {
                count++;
            }
        }
        // 인덱스 구한 값 넣기
        String[] answer = new String[count];
		
        // answer 인덱스 값 구할려고 index = 0 해줌
        int index = 0;
		for(int i=0; i<finished.length; i++) {
			if(!finished[i]) {
				answer[index++] = todo_list[i];
			}
		}
        return answer;
    }
}