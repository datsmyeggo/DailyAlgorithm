import java.util.*;

class Solution {

		public static ArrayList<Integer> solution(String s) {
				ArrayList<Integer> answer = new ArrayList<>();
        s = s.substring(2, s.length()-2).replace("},{", "-");
				String strings [] = s.split("-");
				Arrays.sort(strings, new Comparator<String>() {
						public int compare(String o1, String o2){
							return Integer.compare(o1.length(), o2.length());
						}
				});

				for(String str : strings){
					String[] temp = str.split(",");
					for(int i = 0; i < temp.length; i++){
						int el = Integer.parseInt(temp[i]);
						if(!answer.contains(el)) answer.add(el);
					}
				}

				return answer;
		}
}