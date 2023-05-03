import java.security.Key;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String a : participant){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        for(String b : completion){
            map.put(b, map.get(b)-1);
        }
        for(String c : map.keySet()){
            if(map.get(c)!=0){
                answer = c;
                break;
            }
        }

        return answer;
    }
}