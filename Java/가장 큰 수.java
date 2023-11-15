import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNumbers = new String[numbers.length];
        
        for(int i=0; i<strNumbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNumbers, (a,b) -> (b + a).compareTo(a + b)); // 람다식 : 내림차순 정렬로 비교 정렬.
        
        if(strNumbers[0].equals("0")){
            return "0";
        }
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<strNumbers.length; i++){
            str.append(strNumbers[i]);
        }
        
        answer = str.toString();
        
        return answer;
    }
}