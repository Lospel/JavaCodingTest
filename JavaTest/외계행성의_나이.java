class Solution {
    public String solution(int age) {
        String answer = "";
        String age962 = "abcdefghij";
        // String.valueOf(a).split("") A값을 ""로 자른 다음 문자열로 변환한다. 즉 배열로 넣는다.
        String[] age2 = String.valueOf(age).split("");
        for(int i=0; i<age2.length; i++){
            answer += age962.charAt(Integer.valueOf(age2[i]));
        }
        return answer;
    }
}