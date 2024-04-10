import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        ArrayList<Integer>[] graph = new ArrayList[n+1]; // 노드의 번호를 graph의 인덱스 번호로 사용하기 위해 n+1 크기의 arraylist 생성, graph는 말그대로 문제에서 주어진 graph
        
        for(int i=0; i<n+1; i++){
            graph[i] = new ArrayList<>();
        } // 각 노드에 연결된 노드들을 담기 위해 ArrayList 형태로 생성
        
        for(int i=0; i<edge.length; i++){ // 간선의 정보 입력
            graph[edge[i][0]].add(edge[i][1]);
            graph[edge[i][1]].add(edge[i][0]);
        }
        
        int [] distance = new int[n+1]; 
        Arrays.fill(distance, Integer.MAX_VALUE); // 출발노드에서 특정노드까지의 거리를 저장해줄 1차원 배열(최단거리 배열), 초기엔 MAX로 초기화해준다
        
        distance[1] = 0; // 시작노드인 1번 노드에서 1번 노드까지의 거리는 0
        boolean [] visited = new boolean[n+1]; // 노드별 방문 여부를 저장하기 위한 배열
        
        
        // 아래 for문 이해가 가장 중요함 
        for(int i=0; i<n; i++){ // 아래의 과정을 graph의 노드수 n 만큼 반복(사실상 i번째 노드의 인접 노드 거리를 갱신하는 과정)
            int minDist = Integer.MAX_VALUE; // 최단거리를 MAX로 설정
            int now = 0; // 현재 노드
            for(int j=1; j<n+1; j++){ // 1번 노드부터 차례로 
                if(!visited[j] && distance[j] < minDist){ // 방문 안하고, j번째 노드까지의 거리가 minDist보다 작다면=그 노드가 최단경로라면(문제에서 최단경로로 이동했을 때의 조건이 있기 때문) 
                    minDist = distance[j]; 
                    now = j; // j번째 노드가 현재노드가 됨
                }
            }
            
            visited[now] = true; // 방문 표시
            
            
            // 아래의 for문은 distance 배열의 값, 즉 출발 노드에서 해당 노드까지의 거리를 갱신하는 과정이다
            for(int j=0; j<graph[now].size(); j++){ // 현재 노드에 인접한 노드 수 만큼 반복
                int adjNode = graph[now].get(j); //now의 인접 노드 adjNode
                
                if(distance[adjNode] > distance[now] + 1){// 인접 노드까지의 거리가 현재노드까지의 거리+1보다 크다면
                    distance[adjNode] = distance[now] + 1; //거리 갱신
                }
            } // 거리 갱신 for문 끝
        }
        
        ArrayList<Integer> list = new ArrayList<>(); // 최장 거리를 갖는 노드를 담을 list
        
        int max = 0;
        for(int i = 1; i<distance.length; i++){ // 1번 노드부터 시작하여 distance에 저장된 거리를 비교해
            if(distance[i] != Integer.MAX_VALUE)
                max = Math.max(distance[i], max); // 최장 거리값 도출
        }
        
        for(int i=1; i<distance.length; i++){ // 1번 노드부터 시작하여 distance 배열에서
            if(distance[i] == max){ // 문제에서 요구하는 최장 거리값을 가는 노드를
                list.add(i); // list에 저장
            }
        }
        
        answer = list.size(); // 최장 거리인 노드의 갯수를 answer로 return
        return answer;
    }
}