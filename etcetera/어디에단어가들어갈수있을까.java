import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			int [][] puzzle = new int[n][n];

			for(int i=0; i<n; i++){
					st = new StringTokenizer(br.readLine(), " ");
					for(int j=0; j<n; j++){
						puzzle[i][j] = Integer.parseInt(st.nextToken());
					}
			}

			int total = 0;
			int cnt = 0;
            
			for(int i=0; i<n; i++){
					cnt = 0;
					for(int j=0; j<n; j++){						
						if(puzzle[i][j] == 1){
							cnt++;
                        }
                        if(puzzle[i][j] == 0 || j == n-1){
							if(cnt == k) {total++;}
							cnt = 0;
						}
					}
					
					for(int j=0; j<n; j++){						
						if(puzzle[j][i] == 1){
							cnt++;
						}
                        if(puzzle[j][i] == 0 || j == n-1){
							if(cnt == k) {total++;}
							cnt = 0;
						}
					}
			}
			System.out.println("#" + test_case + " " + total);
		}
	}
}