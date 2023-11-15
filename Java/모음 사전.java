class Solution {
    public int solution(String word) {
        int answer = 0;
        String str = "AEIOU";
        int[] x = {781,156,31,6,1};
        int index;
        int result=word.length();
        
		for(int i=0;i<word.length();i++){
			index = str.indexOf(word.charAt(i));
			result += x[i]*index;
		}
        
        answer = result;
        
        return answer;
    }
}