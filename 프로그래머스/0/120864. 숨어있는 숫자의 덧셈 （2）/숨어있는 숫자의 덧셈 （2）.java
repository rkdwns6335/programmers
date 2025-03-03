class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder currentNumber = new StringBuilder(); // 연속된 숫자를 저장할 StringBuilder
		
		for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (Character.isDigit(c)) {
                currentNumber.append(c);
            } else {
                if (currentNumber.length() > 0) {
                    answer += Integer.parseInt(currentNumber.toString()); // 숫자 더하기
                    currentNumber.setLength(0); // 초기화
                }
            }
        }

        if (currentNumber.length() > 0) {
            answer += Integer.parseInt(currentNumber.toString());
        }
        return answer;
    }
}