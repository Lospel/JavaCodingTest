class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numString = Integer.toString(num); // String 변환 후 인덱스 값 호출.
        String kString = Integer.toString(k);
        if(numString.indexOf(kString) == -1){ // 값이 없으면 -1 리턴.
            answer = -1;
        } else {
            answer = numString.indexOf(kString)+1; // 값이 있으면 해당 위치 값 출력(단, 0부터 값이 출력하기 때문에 정확한 위치 정보는 +1해야 됨)
        }
        return answer;
    }
}