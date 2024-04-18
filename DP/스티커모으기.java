class Solution {
  public int solution(int sticker[]) {
      int answer = 0;
      // 예외
      if(sticker.length==1) {return sticker[0];}
      else if(sticker.length==2) {return Math.max(sticker[0], sticker[1]);}
      
      int [] dp1 = new int[sticker.length-1];
      dp1[0] = sticker[0];
      dp1[1] = sticker[0];
      
      int [] dp2 = new int[sticker.length];
      dp2[0] = 0;
      dp2[1] = sticker[1];
      
      for(int i = 2; i<sticker.length-1; i++){ // 첫번째 스티커 사용
          dp1[i] = Math.max(dp1[i-1], sticker[i]+dp1[i-2]);
      }
      
      for(int i = 2; i<sticker.length; i++){ // 첫번째 스티커 사용하지 않음
          dp2[i] = Math.max(dp2[i-1], sticker[i]+dp2[i-2]);
      }
      
      answer = Math.max(dp1[dp1.length-1], dp2[dp2.length-1]);

      return answer;
  }
}