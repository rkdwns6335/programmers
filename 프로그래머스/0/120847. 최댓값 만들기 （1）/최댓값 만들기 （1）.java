class Solution {
    public int solution(int[] numbers) {
        int max1 = 0, max2 = 0;

        for (int num : numbers) {
            if (num > max1) { 
                max2 = max1; // 기존 최댓값을 두 번째 최댓값으로 이동
                max1 = num;  // 새로운 최댓값 업데이트
            } else if (num > max2) {
                max2 = num; // 두 번째 최댓값 갱신
            }
        }
        return max1 * max2;
    }
}