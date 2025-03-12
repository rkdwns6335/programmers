class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String f = my_string.substring(0, s);
		String b = my_string.substring(e+1,my_string.length());
		String m = my_string.substring(s, e+1);
		
		String middle = "";
		for(int i=m.length()-1; i>=0; i--) {
			middle += m.charAt(i);
		}
		
		answer = f+middle+b;
        
        return answer;
    }
}