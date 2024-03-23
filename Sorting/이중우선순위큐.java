// 실패 코드
// 수정 필요

import java.util.*;

class Solution {
  public int[] solution(String[] operations) {

    int[] answer = {0,0};

    PriorityQueue<Integer> pq_max = new PriorityQueue<>(); //최대 힙
    PriorityQueue<Integer> pq_min = new PriorityQueue<>(Collections.reverseOrder()); //최소 힙

    for(String data : operations){
      if(data.charAt(0) == 'I'){ //숫자 삽입
          int num = Integer.parseInt(data.substring(2));

          pq_min.add(num);
          pq_max.add(num);
      }
      else if(data.charAt(0) == 'D'){
        if(data.substring(2) == "-1"){
          int del_num = pq_min.poll();
          pq_max.remove(del_num);
        }
        else{
          int del_num = pq_max.poll();
          pq_min.remove(del_num);
        }
      }
    }

    if(!pq_max.isEmpty()){      
      answer[0] = -pq_max.peek();
      answer[1] = pq_min.peek();
    }

      return answer;
  }
}