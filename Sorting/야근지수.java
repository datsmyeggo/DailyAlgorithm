import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        
        long answer = 0;
        
        // 주어진 n 시간을 모두 활용해야 함
        int worksSum = Arrays.stream(works).sum(); // 주어진 works 배열 작업시간의 합
        if (worksSum <= n) return 0; // 그 합이 작업 가능 시간 n보다 작거나 같으면 0을 반환
        
        // 최대 작업량을 최소화 시켜야 피로도의 최솟값을 구할 수 있다
        // 반복문 반복 횟수 = n, 1시간 당 1작업량 처리 가능
        // 반복문의 각 턴에서 최대힙의 루트 노드값-1 을 수행한 후 다시 최대힙에 반영하면
        // 각 턴에서의 최대힙의 최댓값, 즉 최대작업량을 가진 작업이 갱신되며
        // 그로써 최대 작업량을 단계별로 최소화 시킬 수 있다고 생각했다

        PriorityQueue <Integer> pqMax = new PriorityQueue(Collections.reverseOrder()); // 최대힙을 활용
        for(int work : works) pqMax.add(work); // 주어진 works 배열을 최대힙 pqMax에 반영
        
        for(int i = 0; i < n; i++){ // n만큼 반복
            int maxWork = pqMax.poll()-1; // 1작업량 처리
            pqMax.add(maxWork); // 최대작업량 갱신
        }
        
        for(int i : pqMax){ // 남은 작업량의 배열 
            answer += i * i; // 피로도 계산
        }
        
        return answer;
    }
}