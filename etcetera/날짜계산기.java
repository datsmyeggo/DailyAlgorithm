import java.util.*;
import java.io.*;

class Solution{

		public static void main(String args[]) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			int [] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

			for(int test_case = 1; test_case <= T; test_case++)
			{
					StringTokenizer st = new StringTokenizer(br.readLine(), " ");
					int [] dates = new int[4];
					int answer = 0;

					for(int i = 0; i < 4; i++){
							dates[i] = Integer.parseInt(st.nextToken());		
					}

					if(dates[0] == dates[2]){ // 같은 달
							answer = dates[3] - dates[1] + 1;
					} else{
							for(int month = dates[0] + 1;  month < dates[2]; month++){
									answer += days[month];
							}
							answer += (days[dates[0]] - dates[1] + 1) + dates[3];
					}
				
					System.out.println("#" + test_case + " " + answer);
			}
		}
}

