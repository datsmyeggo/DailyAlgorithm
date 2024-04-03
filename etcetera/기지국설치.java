class Solution {
  public int solution(int n, int[] stations, int w) {
      int answer = 0;
      int start = 1;
      
      for(int station : stations){
          if(start < station - w){
              int end = station - w;
              int length = end - start;
              
              int stationCnt = length / (2*w + 1);
              if (length % (2 * w + 1) != 0){
                  stationCnt++;
              }
              answer += stationCnt;
            }
            start = station + w + 1;
          }


          if(stations[stations.length-1] + w + 1 <= n){ // 마지막 기지국이 끝에 있지 않을 떄
            start = stations[stations.length-1] + w + 1;
            int length = n - start + 1;

            int stationCnt = length / (2 * w + 1);
            if (length%(2 * w + 1) != 0){
              stationCnt++;
            }
            answer += stationCnt;
          }

      return answer;
  }
}