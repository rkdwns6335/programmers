
class Solution {
    public String solution(String my_string, int m, int c) {
        String[] str = new String[my_string.length() / m];
		
		StringBuilder answer = new StringBuilder(); // 결과를 저장할 StringBuilder
        
        // my_string을 m 길이씩 잘라서 배열에 저장
        for (int i = 0; i < str.length; i++) {
            str[i] = my_string.substring(i * m, (i + 1) * m);
        }
        
        
        for (String row : str) {
            answer.append(row.charAt(c - 1));
        }
        
        return answer.toString();
    }
}