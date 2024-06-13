class Solution {
  public int solution(int n) {
      int answer = 0;
      int n_cnt = cntBinary(n);
    while(true){
      n++;
      if(cntBinary(n) == n_cnt){
        answer = n;
        break;
      }
    }
      
      return answer;
  }
  
  public static int cntBinary(int num){
  String bin_num = Integer.toBinaryString(num);
  int bin_cnt = 0;
  for(int i = 0; i < bin_num.length(); i++){					if(bin_num.charAt(i) == '1'){
          bin_cnt++;
      }
  }
  return bin_cnt;
  }
}