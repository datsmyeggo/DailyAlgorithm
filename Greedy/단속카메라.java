import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (o1, o2) -> {return o1[1] - o2[1];});
        int key = -30001; // 첫 번째 진출지점을 기준
        
        for(int i = 0; i < routes.length; i++ ){
            if (routes[i][0] > key){
                answer++;
                key = routes[i][1];
            }
        }        
        return answer;
    }
}