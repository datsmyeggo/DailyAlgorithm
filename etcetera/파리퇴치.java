import java.io.*;
import java.util.*;

class Solution
{
    static int max,n,m;
    static int[][] flies; 
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            flies = new int[n][n];

            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine(), " ");
                for(int j=0; j<n; j++){
                    flies[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            max = 0;

            for(int i=0; i<=n-m; i++){
                for(int j=0; j<=n-m; j++){
                    getMax(i, j); //해당 좌표를 기준으로 만들어지는 파리채에 따른 최대kill을 구하는 함수
                }
            }

            System.out.println("#" + test_case + " " + max);

		}
	}

    static void getMax(int x, int y){
        int sum=0;
        for(int i=x; i<x + m; i++){
            for(int j=y; j<y + m; j++){
                sum += flies[i][j];
            }
        }
        if(max < sum){
            max = sum;
        }
    }

}