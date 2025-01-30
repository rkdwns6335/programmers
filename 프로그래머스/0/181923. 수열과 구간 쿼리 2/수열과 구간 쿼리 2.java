class Solution {
    public int[] solution(int[] arr, int[][] queries) {
       int[] answer = new int[queries.length]; // 크기를 queries.length로 초기화

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0]; // 시작 인덱스
            int e = queries[i][1]; // 끝 인덱스
            int k = queries[i][2]; // 기준 값

            int min = Integer.MAX_VALUE; // 최소값을 찾기 위해 MAX_VALUE로 설정

            for (int j = s; j <= e; j++) { // s부터 e까지 순회
                if (arr[j] > k && arr[j] < min) { 
                    min = arr[j]; // 최소값 갱신
                }
            }

            // 만약 min이 초기값 그대로라면 k보다 큰 값이 없는 것이므로 -1 저장
            answer[i] = (min == Integer.MAX_VALUE) ? -1 : min;
        }
        return answer;
    }
}