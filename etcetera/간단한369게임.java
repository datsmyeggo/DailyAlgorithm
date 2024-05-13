import java.util.*;
import java.io.*;

class Solution{
	static int cnt;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());

		for(int i = 1; i <= length; i++){
			cnt = 0; // 3 or 6 or 9의 개수

			String str_num = String.valueOf(i); // 정수 i를 String 타입으로 변환

			if(Check(str_num) == true){ // str_num에 3,6,9가 있다?!
				for(int j = 0; j < cnt; j++){ // 3,6,9가 있는 만큼 cnt 만큼 -를 print
					System.out.print("-");
				}
				System.out.print(" ");
			}
			else{
				System.out.print(i+" "); // str_num에 3,6,9 없음
			}

		}
	} // main 함수 끝

	static boolean Check(String str){
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) % 3 == 0 && str.charAt(i) != '0'){
				cnt++; 
			}
		}
		if (cnt>0){
			return true;
		} else return false;
	}
	
}
