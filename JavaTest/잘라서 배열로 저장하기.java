class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int) Math.ceil((double)my_str.length()/n)];
        
        for(int i=0; i<(int) Math.ceil((double)my_str.length()/n); i++){
            try {
                answer[i] = my_str.substring(n * i, n*(i+1));
            } catch (Exception e) {
                answer[i] = my_str.substring(n * i, my_str.length());
            }     
        }
        
        return answer;
    }
}