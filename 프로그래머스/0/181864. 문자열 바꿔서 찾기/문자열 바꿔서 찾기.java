class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String a = "";
		
		for(int i=0; i<myString.length();i++) {
			if(myString.charAt(i) == 'A') {
				a += 'B';
			}else if(myString.charAt(i) == 'B') {
				a += 'A';
			}
		}
		// contains(포함되는 문자열)
        // a라는 문자열에 pat 문자열이 포함하는가?
		answer = a.contains(pat) ? 1 : 0;
        return answer;
    }
}