import java.util.*;
import java.io.*;

class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String [] grades = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			double [] scores = new double [n];

			for(int i = 0; i < n; i++){ // 점수 입력
					StringTokenizer sts = new StringTokenizer(br.readLine(), " ");

					int mid = Integer.parseInt(sts.nextToken());
					int finals = Integer.parseInt(sts.nextToken());
					int assignments = Integer.parseInt(sts.nextToken());

					scores[i] = mid*0.35 + finals*0.45 + assignments*0.2; 
			}
			double target = scores[k-1];
			Arrays.sort(scores);
			
			for(int i = 0; i < n; i++){
				if(target == scores[i]){ // i는 석차
					System.out.println("#" + test_case + " " + grades[i/(n/10)]);
					break;
				}
			}
		}
	}
}