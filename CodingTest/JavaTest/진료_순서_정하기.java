import java.util.*;
class Solution {
   public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int j=0;
        for(int i=emergency.length-1; i>=0; i--){
            answer[j] = emergency[i];
            j++;
        }
        return answer;
    }
}