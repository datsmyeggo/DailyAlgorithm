import java.util.*;
import java.io.*;

class Solution{

	public static void main(String args[]) throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());

			for(int test_case = 1; test_case <= T; test_case++){
					int n = Integer.parseInt(br.readLine());
					int [][] snail = new int[n][n];

					int [] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};

					int snail_num = 1;
					int x = 0, y = 0;
					int d = 0;

					while(snail_num <= n * n){
							snail[x][y] = snail_num++;
							int nx = x + dx[d], ny = y + dy[d];
							if(nx >= n || nx < 0 || ny >= n || ny < 0 || snail[nx][ny] != 0){
									d = (d + 1)%4;
									nx = x + dx[d];
									ny = y + dy[d];
							}
							x = nx;
							y = ny;
					}
					System.out.println("#" + test_case);
					for(int i = 0; i < n; i++){
						for(int j = 0; j < n; j++){
							System.out.print(snail[i][j] + " ");
						}
						System.out.println();
					}


			}
	}
}