class Solution {
    public String solution(String my_string, int[] indices) {
        /*
		// my_string의 각 문장 대해, indices에 포함되지 않은 문자만 추가
		int[] delete = new int[my_string.length()];
		
		// 삭제되는 문자는 1로 표현
		for(int d : delete) {
			delete[d] = 1;
		}
		
		for(int i=0; i<my_string.length(); i++) {
			if(delete[i] != 1) {
				answer += my_string.charAt(i);
			}
		}
        
        System.out.println(answer);
        */
		
		// boolean으로 사용하는 이유 ?
		// 같은 인덱스를 두번 설정하더라도 boolean 값은 ture , false이기 때문에 중복값이 안된다
		// int은 중복을 처리할 수 있는 기능이 없음
        
        
        
        String answer = "";
        boolean[] toDelete = new boolean[my_string.length()];
        
        for (int index : indices) {
            toDelete[index] = true;
        }
        
        for (int i = 0; i < my_string.length(); i++) {
            if (!toDelete[i]) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}