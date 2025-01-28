class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 0;  // 짝수
        int b = 0;  // 홀수  
        
        for(int i=0; i<num_list.length; i++){
            if((i+1) % 2 == 0){
                a += num_list[i];
            }else{
                b += num_list[i];
            }
        }
        
        answer = a > b ? a : b ;
        
        
        return answer;
    }
}