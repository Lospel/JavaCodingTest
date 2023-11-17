import java.util.*;

class Solution 
{
    public int solution(String[] want, int[] number, String[] discount) 
    {
        int answer = 0;
        
        for(int start=0; start<discount.length-9; start++)
        {
            HashMap<String, Integer> map = new HashMap<>();
            for(int i=0; i<want.length; i++)
            {
                map.put(want[i], number[i]);
            }
            for(int i=start; i<start+10; i++)
            {
                if(map.getOrDefault(discount[i], 0) > 0)
                {
                    map.put(discount[i], map.get(discount[i])-1);
                }
            
            }
            if(Collections.max(map.values()) == 0)
            {
                answer++;
            }
        }
        
        return answer;
    }
}