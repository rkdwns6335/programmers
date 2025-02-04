class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int hap = 0;
		for(int i=0; i<numbers.length; i++) {
			hap += numbers[i];
		}
		answer = (double)hap / numbers.length;
        return answer;
    }
}