class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;

        // 가장 가까운 2의 거듭제곱 찾기
        int newLength = 1;
        while (newLength < length) {
            newLength *= 2;
        }

        // 거듭제곱이면 그대로 반환
        if (newLength == length) {
            return arr;
        }

        // 새로운 배열 생성 후 복사
        int[] answer = new int[newLength];
        for (int i = 0; i < length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}