class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cntOpen = 0;
        int cntClose = 0;
        
        String[] s_array = s.split("");

		if(s_array[0].equals(")"))
            return answer = false;
		else if(s_array[s_array.length-1].equals("("))
            return answer = false;
		else{
			for(int i = 0; i < s_array.length; i++){
			    if(s_array[i].equals("("))
					cntOpen++;
				else cntClose++;
                if(cntOpen < cntClose) return answer = false; // 짝 짓는 것이 포인트! 이걸 빼먹어서 계속 fail 뜸
				}
                if(cntClose == cntOpen) answer = true;
                else answer = false;
			        }
        return answer;
    }
}