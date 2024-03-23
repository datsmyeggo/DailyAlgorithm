class Solution {
  public int solution(int n, int[][] computers) {
      int answer = 0;
      boolean [] visited = new boolean[n]; // 방문 여부 체크 
      
      for(int i = 0; i < n; i++){ // 주어진 컴퓨터마다 확인
          if(!visited[i]){ // 해당 컴퓨터를 방문했는가? 방문하지 않았다면
              dfs(i, n, computers, visited); // 해당 컴퓨터와 연결된 컴퓨터를 dfs로 탐색
              answer += 1; // 탐색이 모두 끝나면 하나의 네트워크가 생성된다
          }
      }
      
      return answer; // 총 네트워크 수 반환
  }
  
      public static void dfs(int node, int total, int [][] computers, boolean [] visited){ // dfs 함수
      visited[node] = true; // 해당 노드(컴퓨터)를 방문처리 해준다

      for(int j = 0; j < total; j++){ // 해당 노드(컴퓨터)와 나머지 컴퓨터와의 연결 여부 확인
          if (computers[node][j] == 1 && !visited[j] && j!=node){ // 연결 && 방문 안함 && 자기 자신이 아님 -> 해당 노드와 연결되어 있다면
          dfs(j, total, computers, visited); // 연결된 그 컴퓨터의 네트워크를 같은 방식으로 또 탐색한다(재귀함수)
          }
      }

  }
}