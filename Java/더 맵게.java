import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for(int A : scoville){
            que.add(A);
        }
        while(que.peek() < K) {
            if (que.size() == 1)
                return -1;
            que.add(que.poll() + que.poll() * 2); // poll() 첫번째 값 있으면 리턴 없으면 null, 두번쨰 값...
            answer++;
        }
        return answer;
    }
}