import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] b_arr = before.toCharArray();
		char[] a_arr = after.toCharArray();
		
		Arrays.sort(b_arr);
		Arrays.sort(a_arr);
		
		answer = Arrays.equals(b_arr, a_arr) ? 1 : 0;
        return answer;
    }
}