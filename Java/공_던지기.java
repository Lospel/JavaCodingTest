class Solution {
    public int solution(int[] numbers, int k) {
        int answer = numbers[2*(k-1)%numbers.length]; // 규칙을 수리적으로 파악하자
        return answer;
    }
}