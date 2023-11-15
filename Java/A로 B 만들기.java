import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] bf = before.split("");
        String[] af = after.split("");
        Arrays.sort(bf);
        Arrays.sort(af);
        String b = "";
        String a = "";
        for(String c : bf){
            b += c;
        }
        for(String d : af){
            a += d;
        }
        if(a.equals(b)) answer = 1;
        return answer;
    }
}