import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
		
		int a = slicer[0];
		int b = slicer[1];
		int c = slicer[2];
		
		
		
		// n이 1일 경우
       if(n == 1) {
            for(int i = 0; i <= b; i++) {
                answer.add(num_list[i]);
            }
        }
        // n이 2일 경우
        else if(n == 2) {
            for(int i = a; i < num_list.length; i++) {
                answer.add(num_list[i]);
            }
        }
        // n이 3일 경우
        else if(n == 3) {
            for(int i = a; i <= b; i++) {
                answer.add(num_list[i]);
            }
        }
        // n이 4일 경우
        else {
            for(int i = a; i <= b; i += c) {
                answer.add(num_list[i]);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}