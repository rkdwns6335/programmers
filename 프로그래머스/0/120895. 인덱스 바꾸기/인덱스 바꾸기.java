class Solution {
    public String solution(String my_string, int num1, int num2) {
        //문자열 -> 문자 배열로 변환
		char[] arr = my_string.toCharArray(); 
		
		//문자 바꾸기
		char temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
        
        //문자 배열 -> 문자로 변환
        return new String(arr);
    }
}