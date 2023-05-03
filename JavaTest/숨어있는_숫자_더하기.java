import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int[] answer2 = {};
        answer2 = Arrays.stream(my_string.split(""))
            .filter(i -> i.matches("[0-9]"))
            .mapToInt(Integer::parseInt)
            .sorted()
            .toArray();
        for(int i : answer2){
            answer += i;
        }
        return answer;
    }
}