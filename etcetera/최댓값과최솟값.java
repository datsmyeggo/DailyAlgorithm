import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split(" ");
        int [] intString = new int[list.length];

        for(int i = 0; i < list.length; i++){
          intString[i] = Integer.parseInt(list[i]);
        }    
        Arrays.sort(intString);

        answer = new String(intString[0] + " " + intString[intString.length-1]);
        return answer;
    }
}