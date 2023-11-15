class Solution {
    public String solution(String rsp) {
        String answer = "";
        String test = "";
        
        for(int i=0; i<rsp.length(); i++){
            test += rsp.charAt(i);
            if(test.equals("2")){
                answer += "0";
            }else if(test.equals("0")){
                answer += "5";
            }else if (test.equals("5")){
                answer += "2";
            }
            test = "";
        }

        return answer;
    }
}