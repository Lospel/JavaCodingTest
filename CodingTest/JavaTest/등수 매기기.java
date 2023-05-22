import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        for(int[] t : score){
            list.add(t[0] + t[1]);
        }
        
        list.sort(Comparator.reverseOrder()); // list 값을 내림차순으로 정렬
        
        for(int i=0; i<score.length; i++){
            answer[i] = list.indexOf(score[i][0] + score[i][1])+1; // 내림차순된 list 값에 해당 index 번호 값 +1 을 answer 배열에 입력.
        }
        
        return answer;
    }
}