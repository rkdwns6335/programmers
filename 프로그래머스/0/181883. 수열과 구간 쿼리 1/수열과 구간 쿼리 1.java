class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int[] query : queries) { // 각 query를 순회
            int s = query[0]; // 시작 인덱스
            int e = query[1]; // 끝 인덱스
            
            for (int i = s; i <= e; i++) { // s부터 e까지 증가
                arr[i]++;
            }
        }
        return arr;
    }
}