class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.indexOf(my_string.charAt(i)) == i){ // indexOf(값) 값에 해당하는 첫번째 인덱스 위치값을 리턴함
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}