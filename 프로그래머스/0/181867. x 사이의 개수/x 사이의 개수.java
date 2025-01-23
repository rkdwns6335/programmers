class Solution {
    public int[] solution(String myString) {
        
        // 1. x 기준으로 문자열 나누기
		String[] arr = myString.split("x", -1);
		
		// 2. arr 길이만큼 출력할 answer 배열의 인덱스 크기 지정
		int[] answer = new int[arr.length];
		
		// 3. 나눠진 부분의 길이를 구해 answer[i] 요소의 값 저장
		for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length(); // 각 문자열의 길이를 저장
        }
        
        return answer;
    }
}