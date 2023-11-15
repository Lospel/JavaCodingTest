class Solution {
    public int solution(int n) {
        int answer = 0;
        String nString = Integer.toString(n);
        String[] nStrings = nString.split("");
        for(int i=0; i<nStrings.length; i++){
            answer += Integer.parseInt(nStrings[i]);
        }
        return answer;
    }
}