import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> hashMap = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++){
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 0)+1);
        }
        
        Iterator<Integer> iterator = hashMap.values().iterator();
        
        while(iterator.hasNext()){
            answer *= iterator.next().intValue() + 1;
        }
        return answer - 1;
    }
}