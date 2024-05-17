import java.util.*;
import java.io.*;

class Solution{
		static int answer;
		public static void main(String args[]) throws IOException{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int T = Integer.parseInt(br.readLine());

				for(int test_case = 1; test_case <= T; test_case++)
				{
						int test_num = Integer.parseInt(br.readLine());
						StringTokenizer st = new StringTokenizer(br.readLine(), " ");
						int [] scores = new int[101];

						for(int i = 0; i < 1000; i++){
							scores[Integer.parseInt(st.nextToken())]++;
						}

						Map<Integer, Integer> hashMap = new HashMap<>();
						for(int i = 0; i < scores.length; i++){
								hashMap.put(i, scores[i]);
						}

						List<Integer> keySet = new ArrayList<>(hashMap.keySet());

						keySet.sort(new Comparator<Integer>() {
							@Override
							public int compare(Integer o1, Integer o2) {
								return hashMap.get(o1).compareTo(hashMap.get(o2));
							}
						});

						System.out.println("#" + test_num + " " + keySet.get(keySet.size()-1));
				}
		}					
}

