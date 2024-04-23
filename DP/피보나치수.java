class Solution {
  public int solution(int n) {
      int answer = 0;
      
      int [] fibonacci = new int[n+1];
      
      fibonacci[0] = 0;
      fibonacci[1] = 1;
      
      for(int i=2; i<n+1; i++){
          fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2])%1234567; // 먼저 나눈 후 반영해줘야 한다
      }
      
      answer = fibonacci[n]; // fibonacci[n]%1234567 로 하면 실패 뜸
      return answer;
  }
}