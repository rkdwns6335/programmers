import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
		
		// 1. num_list 를 내림차순으로 정렬
		Arrays.sort(num_list);
		
		// 2. 작은 수 5개를 저장할 answer 리스트
		ArrayList<Integer> res = new ArrayList<>(5);
		
		// 3. 내림차순으로 정렬한 num_list 값의 5개 요소를 res에 저장
		for(int i=0; i<5; i++) {
			res.add(num_list[i]);
		}
		
		// 4. res 에 담긴 요소를 ansewr 리스트에 저장
		int[] answer = new int[res.size()]; //res arraylist 사이즈 값 만큼 방 만들기
		for(int i=0; i<res.size(); i++) {
			answer[i] = res.get(i);
		}
        
        return answer;
    }
}