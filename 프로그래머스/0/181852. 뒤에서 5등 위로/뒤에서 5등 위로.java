import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // 1. num_list 정렬
        Arrays.sort(num_list);

        // 2. 가장 작은 5개의 수를 제외한 나머지 값들을 배열로 추출
        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        
        //copyOfRange 사용법
        //copyOfRange(int[] original, int from, int to);
        //  original: 복사하려는 원본 배열
        //  from: 복사 시작 인덱스 (포함)
        //  to: 복사 종료 인덱스 (미포함)

        // 3. 결과 반환
        return answer;
    }
}