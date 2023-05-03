class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int j = 0;
        for(int i = num_list.length; i>=0; i--){
            answer[j] = num_list[i];
            j++;
        }
        return answer;
    }
}