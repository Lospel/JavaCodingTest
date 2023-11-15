class Solution 
{
    public int solution(int n) 
    {
        int answer = 0;
        int nextN = n;
        String binaryNumber = Integer.toBinaryString(n);
        int findOneCnt1 = (int)binaryNumber.chars().filter(i -> String.valueOf((char)i).equals("1")).count();
        
        while(answer == 0)
        {
            nextN++;
            String binaryNextN = Integer.toBinaryString(nextN);
            int findOneCnt2 = (int)binaryNextN.chars().filter(i->String.valueOf((char)i).equals("1")).count();
            if(findOneCnt2 == findOneCnt1)
            {
                answer = nextN;
                break;
            }
        }
        
        return answer;
    }
}

class Solution2
{
    public int solution(int n) 
    {
        int answer = 0;
        int nextN = n;
        int binaryCntN = Integer.bitCount(n);
        while(answer == 0)
        {
            int bCntNextN = Integer.bitCount(++nextN);
            if(bCntNextN == binaryCntN)
            {
                answer = nextN;
            }
        }
        return answer;
    }
}