class Solution {
    public int[] solution(int n) {
        int j = 0;
        int tmp =0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                tmp++;
            }
        }
        int[] answer = new int[tmp];
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}