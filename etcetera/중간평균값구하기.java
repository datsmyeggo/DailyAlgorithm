import java.util.*;
import java.io.*;

class Solution{

		public static void main(String args[]) throws IOException{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int T = Integer.parseInt(br.readLine());

			for(int test_case = 1; test_case <= T; test_case++)
			{
					StringTokenizer st = new StringTokenizer(br.readLine(), " ");
					int [] arr = new int[10];
					double sum = 0;
					int answer = 0;

					for(int i = 0; i < 10; i++){
							arr[i] = Integer.parseInt(st.nextToken());
					}
					Arrays.sort(arr);

					for(int i = 1; i < 9; i++){
							sum += arr[i];
					}
					answer = (int)Math.round(sum/8);

					System.out.println("#" + test_case + " " + answer);
			}

				
		}
}

