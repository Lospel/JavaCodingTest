class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min = 0;
        for(int i=0;i<sizes.length; i++){
            int a = Math.max(sizes[i][0],sizes[i][1]);
            int b = Math.min(sizes[i][0],sizes[i][1]);
            
            if(max <= a) max = a;
            if(min <= b) min = b;
        }
        
        answer = max*min;
        
        return answer;
    }
}