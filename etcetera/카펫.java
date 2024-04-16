class Solution {
  public int[] solution(int brown, int yellow) {
      int[] answer = new int[2];
      int m = 0;
      int n = 0;
      
      int sum = (brown/2)-2;
      
      for(int i = 1; i<=yellow; i++){
          if(i*(sum-i) == yellow && i >= (sum-i)){
              n = i+2;
              m = sum-i+2;
              break;
          }
      }
      
      answer[0] = n; answer[1] = m;
      
      return answer;
  }
}