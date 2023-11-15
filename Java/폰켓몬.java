import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length/2;

        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums){
            set.add(i);
        }

        if(set.size() > count){
            answer = count;
        }else{
            answer = set.size();
        }
        
        return answer;
    }
}