class Solution {
    public int solution(int[] arr) {
        int answer = 0;
		
		while(true) {
			int[] newArr = new int[arr.length];
			boolean issame = true; // 배열 변했는지 확인하는 변수
			
			for(int i=0;i<arr.length; i++) {
				if(arr[i] > 50 && arr[i] % 2 == 0) {
					newArr[i] = arr[i] / 2;
				}else if(arr[i] < 50 && arr[i] % 2 != 0) {
					newArr[i] = (arr[i] * 2) + 1;
				}else {
					newArr[i] = arr[i];
				}
				
				//하나라도 달라지면 false
				if(newArr[i] != arr[i]) {
					issame = false;
				}
				
			}
			
			if (issame) { // 배열이 변하지 않으면 종료
                break;
            }

            arr = newArr; // 배열 업데이트
            answer++; // 반복 횟수 증가
			
			
		}
        return answer;
    }
}