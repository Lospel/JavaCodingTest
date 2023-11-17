import java.util.*;

class Solution 
{
    public int solution(String s) 
    {
        int answer = 0;

        for(int i=0; i<s.length(); i++)
        {
            Stack<Character> stack = new Stack<>();
            String listS = s.substring(i, s.length()) + s.substring(0, i);
            
            for(int j=0; j<listS.length(); j++)
            {
                char c = listS.charAt(j);
                if(stack.isEmpty())
                {
                    stack.push(c);
                }
                else if(c == ')' && stack.peek() == '(')
                {
                    stack.pop();
                }
                else if(c == '}' && stack.peek() == '{')
                {
                    stack.pop();
                }
                else if(c == ']' && stack.peek() == '[')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(c);
                }
            }
        
            if(stack.isEmpty())
            {
                answer++;
            }
        }


        return answer;
    }
}