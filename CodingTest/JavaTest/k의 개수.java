class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j; a++){
            String tmp = Integer.toString(a);
            String kTmp = Integer.toString(k);
            if(tmp.contains(kTmp)) {
                String[] array = tmp.split("");
                for(String s : array){
                    if(s.equals(kTmp)) answer++;
                }
            }
        }
        return answer;
    }
}