import java.util.*;

class Solution 
{
    public int solution(int k, int[] tangerine) 
    {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i:tangerine)
        {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((s1, s2) -> map.get(s2) - (map.get(s1)));
        for (Integer key : keyList) {
            if(k<=0)
            {
                break;
            }
            answer++;
            k -= map.get(key);
        }
        return answer;
    }
}