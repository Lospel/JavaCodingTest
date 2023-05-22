import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Integer[] number = new Integer[numlist.length];
        
        for(int i=0; i<numlist.length; i++){
            number[i] = numlist[i];
        }
        
        Arrays.sort(number, (a, b) -> {
            int aGab = Math.abs(a-n);
            int bGab = Math.abs(b-n);
            if(aGab == bGab) return b-a; // 차이값이 동일하면 내림차순
            return aGab - bGab; // 다르면 오름차순
        });
        
        for(int i=0; i<numlist.length; i++){
            answer[i] = number[i];
        }

        return answer;
    }
}