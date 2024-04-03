class Solution {
  public int[] solution(int n, String[] words) {
      int [] answer = {0,0};
      int cnt = 0;

      for(int i = 1; i < words.length; i++){
        if(cnt != 0){
          break;
        }
        if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
            cnt = i;
        }
        for(int j = 0; j < i; j++){
          if(words[i].equals(words[j])){
            cnt = i;
          }

        }
      }

      if(cnt == 0){
          return answer;
      }
      int num = (cnt+1) % n;
      int turn = (cnt+1) / n;

      if(num != 0){
        turn++;
      }else{
        num = n;
      }

      answer = new int[]{num, turn};
      return answer;
  }
}