import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
            int m = sc.nextInt();

            int [] A = new int[n];
            int [] B = new int[m];

            for(int i=0; i<A.length; i++) A[i] = sc.nextInt();
            for(int i=0; i<B.length; i++) B[i] = sc.nextInt();

            int answer = Integer.MIN_VALUE;

						if(n>m){
                for(int i=0; i<n-m+1; i++){
                    int sum=0;
                    for(int j=0; j<m; j++){
                        sum += A[i+j]*B[j];
                    } answer = Math.max(answer, sum);
                }
            }

            else if(n<m){
                for(int i=0; i<m-n+1; i++){
                    int sum=0;
                    for(int j=0; j<n; j++){
                        sum += A[j]*B[i+j];
                    }   answer = Math.max(answer, sum);
                }
            }
            
            else{
                int sum = 0;
                for(int i=0; i<n; i++){
                    sum += A[i]*B[i];
                }   answer = Math.max(answer, sum);
            }

			System.out.printf("#%d %d\n", test_case, answer);
        }
	}
}