class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("up")){
                keyinput[i] = keyinput[i].replace("up", "1");
                answer[1] += Integer.parseInt(keyinput[i]);
            }else if(keyinput[i].equals("down")){
                keyinput[i] = keyinput[i].replace("down", "-1");
                answer[1] += Integer.parseInt(keyinput[i]);
            }else if(keyinput[i].equals("left")){
                keyinput[i] = keyinput[i].replace("left", "-1");
                answer[0] += Integer.parseInt(keyinput[i]);
            }else{
                keyinput[i] = keyinput[i].replace("right", "1");
                answer[0] += Integer.parseInt(keyinput[i]);
            }
            if(answer[0] > board[0]/2){
                answer[0] = board[0]/2;
            }else if(answer[0] < -(board[0]/2)){
                answer[0] = -(board[0]/2);
            }
    
            if(answer[1] > board[1]/2){
                answer[1] = board[1]/2;
            }else if(answer[1] < -(board[1]/2)){
                answer[1] = -(board[1]/2);
            }
        }

        return answer;
    }
}