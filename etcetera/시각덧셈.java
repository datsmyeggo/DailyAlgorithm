import java.util.*;
import java.io.*;

class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int hr1 = Integer.parseInt(st.nextToken());
			int min1 = Integer.parseInt(st.nextToken());
			int hr2 = Integer.parseInt(st.nextToken());
			int min2 = Integer.parseInt(st.nextToken());
			
			int hr = hr1 + hr2;
			int min = min1 + min2;

			if(hr > 12){
					hr -= 12;
			}
			if(min >= 60){
				min -= 60;
        hr += 1;
			}
			System.out.println("#" + test_case + " " + hr + " " +  min);
		}
	}
}