import java.util.*;

class Solution {
  // String begin = "hit";
  // String target = "cog";
  // String [] words = {"hot", "dot", "dog", "lot", "log", "cog"};
  static int answer = 0;
  static boolean [] visited;

    public int solution(String begin, String target, String[] words) {
        
        visited = new boolean[words.length];
        dfs(begin, target, words, 0);

        return answer;
    }

    public static void dfs(String word, String target, String[] words, int cnt){
      if(word.equals(target)){
        answer = cnt;
      }

      for(int i = 0; i < words.length; i++){
        int k = 0;
        if(visited[i]) continue;

        for(int j = 0; j < word.length(); j++ ){
          if (word.charAt(j) != words[i].charAt(j)) {
                k++;
          } 
        }

        if (k == 1){
          visited[i] = true;
          dfs(words[i], target, words, cnt+1);
          visited[i] = false; //초기화
        }

      }
    }

}