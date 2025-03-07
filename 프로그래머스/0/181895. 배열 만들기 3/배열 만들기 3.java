import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
       ArrayList<Integer> list = new ArrayList<>();
        
        // 첫 번째 구간
        for (int j = intervals[0][0]; j <= intervals[0][1]; j++) {
            list.add(arr[j]);
        }
        
        // 두 번째 구간
        for (int j = intervals[1][0]; j <= intervals[1][1]; j++) {
            list.add(arr[j]);
        }
        
        // ArrayList를 배열로 변환하여 반환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}