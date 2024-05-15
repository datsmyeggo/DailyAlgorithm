import java.util.*;
import java.io.*;

class Solution{
	static int [][] sudoku;
	static boolean [] visited;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringBuilder sb = new StringBuilder();
			sudoku = new int[9][9];

			for(int i = 0; i < 9; i++){
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for(int j = 0; j < 9; j++){
					sudoku[i][j] = Integer.parseInt(st.nextToken());
				}
			} // 스도쿠 판 입력

			sb.append("#" + test_case + " ").append(answer());
			System.out.println(sb);
		}
	}


	public static int answer(){
		for(int i = 0; i < 9; i++){
			visited = new boolean[10];
			for(int j = 0; j < 9; j++){
				if(visited[sudoku[i][j]]){ // 중복되는 숫자
					return 0;
				}
				else if(visited[sudoku[i][j]] != true){
					visited[sudoku[i][j]] = true;
				}
			}
		}

		for(int i = 0; i < 9; i++){
			visited = new boolean[10];
			for(int j = 0; j < 9; j++){
				if(visited[sudoku[j][i]]){
					return 0;
				}
				else if(visited[sudoku[i][j]] != true){
					visited[sudoku[j][i]] = true;
				}
			}
		}

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
					visited = new boolean[10];
					for(int n = 0; n < 3; n++){
						for(int m = 0; m < 3; m++){
							if(visited[sudoku[i*3 + n][j*3 + m]]){
									return 0;
							} else if(visited[sudoku[i*3 + n][j*3 + m]] != true){
									visited[sudoku[i*3 + n][j*3 + m]] = true;
							}
						}
					}
			}
		}
		return 1;
	}

			
			
}


