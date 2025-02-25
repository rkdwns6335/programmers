import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 1.소문자로 변환
		String str = my_string.toLowerCase();
		
		// 2. 문자 배열로 변환 후 정렬
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		
		// 3. 정렬된 문자 배열을 다시 문자열로 변환
		answer = new String(arr);
        return answer;
    }
}