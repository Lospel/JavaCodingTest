class Solution 
{
    public int solution(int[] arr) 
    {
        int answer = 0;
        boolean ok = false;
        while(!ok)
        {
            answer++;
            for(int i=0; i<arr.length; i++)
            {
                if(answer % arr[i] != 0)
                {
                    ok = false;
                    break;
                }
                ok = true;
            }
        }
        return answer;
    }
}