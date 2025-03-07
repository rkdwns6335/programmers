import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> x = new ArrayList<>();
		
		for(int i=0; i< arr.length; i++) {
			if(flag[i]) { // flag 값이 true 라면 arr[i]를 arr[i] * 2 번 추가
				for (int j = 0; j < arr[i] * 2; j++) { 
                    x.add(arr[i]);
                }
			}else {
				// flag 값이 false 임ㄴ arr[i]만큼 감소
				for(int j=0; j < arr[i]; j++) {
					if(!x.isEmpty()) {
						x.remove(x.size() -1); //마지막 원소 제거
					}
				}
			}
		}
		
		int[] answer = new int[x.size()];
		for(int i=0; i< x.size(); i++) {
			answer[i] = x.get(i);
		}
        return answer;
    }
}