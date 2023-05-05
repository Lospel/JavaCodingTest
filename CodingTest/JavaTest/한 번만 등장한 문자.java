import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = s.split("");
        Arrays.sort(tmp);

        for(int i=0; i<tmp.length; i++){
            int count =0;
            for(int j=0; j<tmp.length; j++){
                if(tmp[i].equals(tmp[j])){
                    count++;
                }
            }
            if (count == 1){
                answer += tmp[i];
            }
        }
        return answer;
    }
}