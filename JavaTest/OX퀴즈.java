class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){

            String[] qStrings = quiz[i].split(" ");
            int num1 = Integer.parseInt(qStrings[0]);
            int num2 = Integer.parseInt(qStrings[2]);
            int num3 = Integer.parseInt(qStrings[4]);

            if(qStrings[1].equals("+")){
                if((num1+num2)==num3){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else{
                if((num1-num2)==num3){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}