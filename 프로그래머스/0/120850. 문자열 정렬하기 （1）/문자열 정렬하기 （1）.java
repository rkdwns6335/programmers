import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<Integer>();
		
		
		// Character.isDigit()란?
		// 주어진 문자가 숫자인지 여부 판별 (리턴값 : true or false)
		
		// getNumbericValue()란?
		// 주어진 문자를 정수로 변환
		for(char c : my_string.toCharArray()) {
			if(Character.isDigit(c)) {
				answer.add(Character.getNumericValue(c));
			}
		}
        Collections.sort(answer);
        
        //ArrayList를 다시 일반 배열로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}