import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int tmp = -1;
        List<Integer> list = new ArrayList<>();
        
        for(int n : arr){
            if(tmp != n){
                list.add(n);
                tmp = n;
            }
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}