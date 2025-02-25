import java.util.*;

class Solution {
    public int[] solution(int n) {
        // ArrayList를 활용하는 이유?
		// 데이터가 고정된 수라면 일반 배열이 좋지만 데이터 값이 유동적이면 ArrayList를 활용한다
		List<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			if( n % i == 0) {
				answer.add(i);
			}
		}
        
        //stream()을 사용해서 int 타입의 배열로 변환
        //.mapToInt(i -> i) → Integer를 int로 변환
        //.toArray() → 최종적으로 int[]로 변환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}