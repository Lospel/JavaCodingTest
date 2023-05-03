import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int max = 100;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if (Math.abs(n - array[i]) < max){
                max = Math.abs(n-array[i]);
                answer = array[i];
            }
        }
        return answer;
    }
}