class Solution {
  public int[] solution(int n, int s) {
      int[] answer = new int[n];
      int quotient = s/n; //몫
      int remainder = s%n; //나머지

      if (quotient == 0) return new int[] {-1};
      
      for(int i = 0; i<n; i++){
        answer[i] = quotient; // 몫을 각 자리에 분배 후
      }

      for(int i = n - remainder; i<n; i++){ // 배열의 끝에서부터 1을 remainder번 더해준다
        answer[i] += 1;
      }

      return answer;
  }
}