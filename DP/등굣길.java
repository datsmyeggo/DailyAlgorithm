class Solution {
  public int solution(int m, int n, int[][] puddles) {
      int answer = 0;
      
      int [][] map = new int [m][n];
      int division = 1000000007;
      map[0][0] = 1;

      for(int i = 0 ; i < puddles.length; i++){ //물웅덩이 표시
          int x = puddles[i][0];
          int y = puddles[i][1];
    
          map[x-1][y-1] = -1;
      }
  
      for(int i = 0; i < m; i++){ 
          for(int j = 0; j < n; j++){
              if(map[i][j] == -1){
                  map[i][j] = 0;
                  continue; //이걸 고려 못해서 웅덩이의 값이 제대로 저장이 안됐음
              }
              if(!(i==0 && j==0)){ // 출발점 외의 지점
                int up = 0;
                int left = 0;

                if(i > 0) up = map[i-1][j];
                if(j > 0) left = map[i][j-1];

                map[i][j] = (up + left) % division;
              }


          } // 안쪽 for문
      } //바깥 for문
      answer = map[m-1][n-1];
      return answer;
  }
}