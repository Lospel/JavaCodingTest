class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // 등차수열 공식 n(n+1)/2
        int nSum = num * (1 + num) / 2;
        int start = (total - nSum) / num;

        for(int i=0; i<num+1; i++){
                answer[i] = i + start;
        }
        
        return answer;
        
    }
}