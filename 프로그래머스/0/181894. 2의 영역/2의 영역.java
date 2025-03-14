import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1, end = -1;
		
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i; // 첫 번째 2의 위치
                end = i; // 마지막 2의 위치 (계속 갱신)
            }
        }

        
		// 2가 없을 경우
        if (start == -1) return new int[]{-1};

        // Arrays.copyOfRange() 란?
        // 배열의 일부분을 잘라내서 새로운 배열을 반환
        // Arrarys.copyOfRange(원본배열 , 복사할 시작 인덱스(포함) , 끝 인덱스(배열 크기보다 하나 큰값)
        
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}