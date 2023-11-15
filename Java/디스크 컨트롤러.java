import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        int index = 0;
        int count = 0;
        int total = 0;
        int end = 0;
        
        while(count < jobs.length) {

            while(index < jobs.length && jobs[index][0] <= end) { // 첫값 -> 두번째, 세번째 값 들어가서 비교 후 정렬.
                pq.add(jobs[index++]); // [0,3]
            }
            
            if(pq.isEmpty()) {
                end = jobs[index][0];
            } else {
                int[] cur = pq.poll();
                total += cur[1] + end - cur[0]; // 3 + 0 - 0
                end += cur[1];
                count++;
            }
        }
        
        answer = total/jobs.length;

        return answer;
    }
}