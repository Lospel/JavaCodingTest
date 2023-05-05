class Solution {
    public String solution(String my_string) {
        String answer = "";
        String up = "";
        String down = "";
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>= 'a' && my_string.charAt(i) <= 'z'){
                up += my_string.charAt(i);
                answer += up.toUpperCase();
                up = "";
            } else{
                down += my_string.charAt(i);
                answer += down.toLowerCase();
                down = "";
            }
        }
        return answer;
    }
}