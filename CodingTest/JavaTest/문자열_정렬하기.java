import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        answer = Arrays.stream(my_string.split(""))
            .filter(i -> i.matches("[0-9]"))
            .mapToInt(Integer::parseInt)
            .sorted()
            .toArray();
        return answer;
    }
}