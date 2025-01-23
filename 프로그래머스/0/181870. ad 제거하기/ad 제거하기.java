import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
		for(int i=0; i<strArr.length; i++) {
			if(!strArr[i].contains("ad")) {
				answer.add(strArr[i]);
			}
		}
        // ArrayList를 String[] 배열로 변환
        String[] result = answer.toArray(new String[0]);
        return result;
    }
}