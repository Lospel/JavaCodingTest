class Solution 
{
    public int solution(int n) 
    {
        int answer = 1;
        int first = 0;
        for(int i=1; i<=n; i++)
        {
            first = i;
            for(int j=i+1; j<=n; j++)
            {
                first += j;
                if(first > n)
                {
                    break;
                }
                if(first == n)
                {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}