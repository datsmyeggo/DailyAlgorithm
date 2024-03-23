import java.lang.Math;

class Solution {
    public int solution(int[][] triangle) { //Top-Down
        int length = triangle.length;
        
        for(int i = 1; i < length; i++){ // 끝 수와 중간 수를 위에서 아래로 update
            for(int j = 0; j <= i ; j++){
                if (j == 0)
                    triangle[i][0] += triangle[i-1][0];
                else if(j == i)
                    triangle[i][j] += triangle[i-1][j-1];
                else
                    triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
            }
        }
        int answer = 0;
        
        for(int i = 0; i < length; i++){
            answer = Math.max(answer, triangle[length-1][i]);
        }
        
        return answer;
    }
}