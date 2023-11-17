import java.util.*;

class Solution 
{
    public int solution(int[] elements) 
    {
        int answer = 0;
        int lenE = elements.length;
        int[] elements2 = new int[lenE*2];
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<lenE; i++)
        {
            elements2[i] = elements[i];
            elements2[i+lenE] = elements[i];
        }
        
        for(int i=0; i<lenE; i++)
        {
            int sum = 0;
            for(int j=0; j<lenE; j++)
            {
                sum += elements2[i+j];
                set.add(sum);
            }
        }
        
        answer = set.size();
        return answer;
    }
}