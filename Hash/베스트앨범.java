import java.util.*;
// 항상 최종적으로 출력하고자 하는 것이 무엇인지 명확히 한 후 문제 풀자

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genresMap = new HashMap<>();

        for (int i = 0; i<genres.length; i++){
          genresMap.put(genres[i], genresMap.getOrDefault(genres[i],0) + plays[i]);

        } // 장르와 장르의 총 재생수를 각각 key와 value로 갖는 해시맵 genresMap 설정

        // 장르 재생수로 내림차순하여 sortedGenreList에 반영
        List<String> sortedGenreList = new ArrayList<>(genresMap.keySet());
        Collections.sort(sortedGenreList, (o1, o2) -> (genresMap.get(o2).compareTo(genresMap.get(o1))));

        List<Integer> answerList = new ArrayList<>(); // 최종 선정된 곡을 담을 List

        sortedGenreList.forEach(genre -> { // 각 장르별로 곡의 고유번호와 재생수를 담고, 재생수에 따른 내림차순을 해준다
          HashMap<Integer, Integer> playsMap = new HashMap<>(); // 각 장르별 곡의 고유번호와 재생수를 담는 playsMap 해시맵

          for(int i = 0; i< genres.length; i++){
              if(genre.equals(genres[i])) {
                playsMap.put(i, plays[i]);
              } 
          } // 고유번호, 재생수 담기

          List<Integer> playsList = new ArrayList<>(playsMap.keySet());
          Collections.sort(playsList, (o1, o2) -> (playsMap.get(o2).compareTo(playsMap.get(o1))));

          answerList.add(playsList.get(0));
          if(playsList.size() != 1){
            answerList.add(playsList.get(1));
          } // answerList에는 현재 sortedGenreList의 특정 genre에 해당하는 최대 재생곡 2곡의 고유번호가 담겨있다
        }); //forEach문 끝


        int [] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++){
          answer[i] = answerList.get(i);
        }

        return answer;
    }
}