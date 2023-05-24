class Solution {
    
    public int solution(int chicken) {
        int answer = 0;
        int BONUS_NUM = 10;

        while (chicken >= BONUS_NUM) {
            int newChick = chicken / BONUS_NUM;
            int restChick = chicken % BONUS_NUM;
            chicken = newChick + restChick;
            answer += newChick;
        }

        return answer;
    }
}