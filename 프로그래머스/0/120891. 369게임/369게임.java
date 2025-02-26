class Solution {
    public int solution(int order) {
        int answer = 0;
        String od = String.valueOf(order);
		
		for(int i=0; i<od.length(); i++) {
			if(od.charAt(i) == '3' || od.charAt(i) == '6' || od.charAt(i) == '9') {
				answer++;
			}
		}
        return answer;
    }
}